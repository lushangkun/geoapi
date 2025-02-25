/*
 *    GeoAPI - Java interfaces for OGC/ISO standards
 *    http://www.geoapi.org
 *
 *    Copyright (C) 2021 Open Geospatial Consortium, Inc.
 *    All Rights Reserved. http://www.opengeospatial.org/ogc/legal
 *
 *    Permission to use, copy, and modify this software and its documentation, with
 *    or without modification, for any purpose and without fee or royalty is hereby
 *    granted, provided that you include the following on ALL copies of the software
 *    and documentation or portions thereof, including modifications, that you make:
 *
 *    1. The full text of this NOTICE in a location viewable to users of the
 *       redistributed or derivative work.
 *    2. Notice of any changes or modifications to the OGC files, including the
 *       date changes were made.
 *
 *    THIS SOFTWARE AND DOCUMENTATION IS PROVIDED "AS IS," AND COPYRIGHT HOLDERS MAKE
 *    NO REPRESENTATIONS OR WARRANTIES, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED
 *    TO, WARRANTIES OF MERCHANTABILITY OR FITNESS FOR ANY PARTICULAR PURPOSE OR THAT
 *    THE USE OF THE SOFTWARE OR DOCUMENTATION WILL NOT INFRINGE ANY THIRD PARTY
 *    PATENTS, COPYRIGHTS, TRADEMARKS OR OTHER RIGHTS.
 *
 *    COPYRIGHT HOLDERS WILL NOT BE LIABLE FOR ANY DIRECT, INDIRECT, SPECIAL OR
 *    CONSEQUENTIAL DAMAGES ARISING OUT OF ANY USE OF THE SOFTWARE OR DOCUMENTATION.
 *
 *    The name and trademarks of copyright holders may NOT be used in advertising or
 *    publicity pertaining to the software without specific, written prior permission.
 *    Title to copyright in this software and any associated documentation will at all
 *    times remain with copyright holders.
 */
package org.opengis.metadata.quality;

import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import org.opengis.util.CodeList;
import org.opengis.annotation.UML;
import org.opengis.referencing.operation.Matrix;

import static org.opengis.annotation.Obligation.*;
import static org.opengis.annotation.Specification.*;


/**
 * Structure for reporting a complex data quality result.
 *
 * @author  Alexis Gaillard (Geomatys)
 * @author  Martin Desruisseaux (Geomatys)
 * @version 3.1
 * @since   3.1
 */
@UML(identifier="DQM_ValueStructure", specification=ISO_19157)
public final class ValueStructure extends CodeList<ValueStructure> {
    /**
     * Serial number for compatibility with different versions.
     */
    private static final long serialVersionUID = 455647811714853262L;

    /**
     * List of all enumerations of this type.
     * Must be declared before any enum declaration.
     */
    private static final List<ValueStructure> VALUES = new ArrayList<>(6);

    /**
     * Finite, unordered collection of related items that may be repeated.
     * The corresponding Java type is {@link java.util.Collection}.
     */
    @UML(identifier="bag", obligation=CONDITIONAL, specification=ISO_19157)
    public static final ValueStructure BAG = new ValueStructure("BAG", Collection.class);

    /**
     * Unordered collection of related items with no repetition.
     * The corresponding Java type is {@link java.util.Set}.
     */
    @UML(identifier="set", obligation=CONDITIONAL, specification=ISO_19157)
    public static final ValueStructure SET = new ValueStructure("SET", Set.class);

    /**
     * Finite, ordered collection of related items that may be repeated.
     * The corresponding Java type is {@link java.util.List}.
     */
    @UML(identifier="sequence", obligation=CONDITIONAL, specification=ISO_19157)
    public static final ValueStructure SEQUENCE = new ValueStructure("SEQUENCE", List.class);

    /**
     * An arrangement of data in which each item may be identified by means of arguments or keys.
     * The corresponding Java type is {@link java.util.Map}.
     */
    @UML(identifier="table", obligation=CONDITIONAL, specification=ISO_19157)
    public static final ValueStructure TABLE = new ValueStructure("TABLE", Map.class);

    /**
     * Rectangular array of numbers.
     * The corresponding Java type is {@link org.opengis.referencing.operation.Matrix}.
     */
    @UML(identifier="matrix", obligation=CONDITIONAL, specification=ISO_19157)
    public static final ValueStructure MATRIX = new ValueStructure("MATRIX", Matrix.class);

    /**
     * Feature that acts as a function to return values from its range
     * for any direct position within its spatial, temporal or spatiotemporal domain.
     */
    @UML(identifier="coverage", obligation=CONDITIONAL, specification=ISO_19157)
    public static final ValueStructure COVERAGE = new ValueStructure("COVERAGE");

    /**
     * The values in the order they should be tested by {@link #valueOf(Class)}.
     * In particular, {@link #SEQUENCE} and {@link #SET} shall be tested before {@link #BAG}.
     */
    private static final ValueStructure[] PREDEFINED = {SEQUENCE, SET, TABLE, BAG, MATRIX};

    /**
     * Base Java type for objects storing this kind of structure, or {@code null} if unspecified.
     */
    private final Class<?> type;

    /**
     * Constructs an element of the given name. The new element is
     * automatically added to the list returned by {@link #values()}.
     *
     * This is invoked by reflection by {@link #valueOf(Class, String)}
     * when a new code needs to be created. This is indirectly required
     * for {@link #valueOf(String)} implementation.
     *
     * @param name  the name of the new element. This name shall not be in use by another element of this type.
     */
    private ValueStructure(final String name) {
        super(name, VALUES);
        type = null;
    }

    /**
     * Constructs an element of the given name. The new element is
     * automatically added to the list returned by {@link #values()}.
     *
     * @param name  the name of the new element. This name shall not be in use by another element of this type.
     * @param type  base Java interface for objects storing this kind of structure.
     */
    private ValueStructure(final String name, final Class<?> type) {
        super(name, VALUES);
        this.type = type;
    }

    /**
     * Returns the list of {@code ValueStructure}s.
     *
     * @return the list of codes declared in the current JVM.
     */
    public static ValueStructure[] values() {
        synchronized (VALUES) {
            return VALUES.toArray(new ValueStructure[VALUES.size()]);
        }
    }

    /**
     * Returns the list of codes of the same kind than this code list element.
     * Invoking this method is equivalent to invoking {@link #values()}, except that
     * this method can be invoked on an instance of the parent {@code CodeList} class.
     *
     * @return all code {@linkplain #values() values} for this code list.
     */
    @Override
    public ValueStructure[] family() {
        return values();
    }

    /**
     * Returns the structure that matches the given string, or returns a new one if none match it.
     * More specifically, this methods returns the first instance for which
     * <code>{@linkplain #name() name()}.{@linkplain String#equals equals}(code)</code> returns {@code true}.
     * If no existing instance is found, then a new one is created for the given name.
     *
     * @param  code  the name of the code to fetch or to create.
     * @return a code matching the given name.
     */
    public static ValueStructure valueOf(String code) {
        return valueOf(ValueStructure.class, code);
    }

    /**
     * Returns the structure corresponding to the given class.
     * The mapping between Java type and {@code ValueStructure} code list is as below:
     *
     * <table class="ogc">
     *   <caption>Mapping from Java type to {@code ValueStructure}</caption>
     *   <tr><th>Java or GeoAPI type</th>                              <th>Code list value</th></tr>
     *   <tr><td>{@link java.util.Collection}</td>                     <td>{@link #BAG}</td></tr>
     *   <tr><td>{@link java.util.Set}</td>                            <td>{@link #SET}</td></tr>
     *   <tr><td>{@link java.util.List}</td>                           <td>{@link #SEQUENCE}</td></tr>
     *   <tr><td>{@link java.util.Map}</td>                            <td>{@link #TABLE}</td></tr>
     *   <tr><td>{@link org.opengis.referencing.operation.Matrix}</td> <td>{@link #MATRIX}</td></tr>
     * </table>
     *
     * @param  type  the Java type for which to get a structure, or {@code null} if unknown.
     * @return structure for the given type, or an empty value if there is no value for the given type.
     */
    public static Optional<ValueStructure> valueOf(final Class<?> type) {
        if (type != null) {
            for (final ValueStructure value : PREDEFINED) {
                if (value.type.isAssignableFrom(type)) {
                    return Optional.of(value);
                }
            }
        }
        return Optional.empty();
    }

    /**
     * Returns the Java type corresponding to this code list value.
     * The Java type is documented in each code list value.
     *
     * @departure integration
     *   Added for integration with the Java language.
     *
     * @return the Java type for this code list value.
     */
    public Optional<Class<?>> toJavaType() {
        return Optional.ofNullable(type);
    }
}
