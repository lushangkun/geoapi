/*
 *    GeoAPI - Java interfaces for OGC/ISO standards
 *    http://www.geoapi.org
 *
 *    Copyright (C) 2006-2021 Open Geospatial Consortium, Inc.
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
package org.opengis.util;

import java.util.Map;
import org.opengis.annotation.UML;

import static org.opengis.annotation.Obligation.*;
import static org.opengis.annotation.Specification.*;


/**
 * A list of logically related fields as (<var>name</var>, <var>value</var>) pairs in a dictionary.
 * A {@code Record} is an instance of an {@link RecordType}.
 * For example, a {@code Record} may be a row in a table described by a {@code RecordType}.
 *
 * <h2>Relationship with Java {@code Record} class</h2>
 * This interface serves a purpose similar to the {@link java.lang.Record} abstract class
 * provided by the standard Java platform, but is used in a different context.
 * The standard Java {@code Record} class provides static records (i.e., with structure defined at compile time),
 * while this GeoAPI {@code Record} interfaces provides dynamic records.
 * The former is more convenient, efficient and type-safe,
 * while the latter is the only option when the record structure is not known in advance,
 * for example when it is determined by the content of a data file being read.
 * If interoperability between the two models is desired,
 * a GeoAPI {@code Record} implementation could delegate all operations
 * to a wrapped Java {@code Record} using {@link java.lang.reflect.RecordComponent}.
 *
 * @author  Bryce Nordgren (USDA)
 * @author  Martin Desruisseaux (IRD)
 * @version 3.1
 * @since   2.1
 *
 * @see RecordType
 */
@UML(identifier="Record", specification=ISO_19103)
public interface Record {
    /**
     * Returns the type definition of this record. All fields named in this record must be defined
     * in the returned record type. In other words, the following assertion must holds:
     *
     * {@snippet lang="java" :
     * Set<MemberName> members = getRecordType().getMembers();
     * Set<MemberName> fields  = getFields().keySet();
     * assert members.containsAll(fields);
     * }
     *
     * This association is optional according ISO 19103.
     * But implementers are encouraged to provide a value in all cases.
     *
     * <div class="note"><b>Comparison with Java reflection:</b>
     * if we think about this {@code Record} as equivalent to an {@code Object} instance, then
     * this method can be though as the equivalent of the Java {@link Object#getClass()} method.
     * </div>
     *
     * @return the type definition of this record. May be {@code null}.
     */
    @UML(identifier="type", obligation=OPTIONAL, specification=ISO_19103)
    RecordType getRecordType();

    /**
     * Returns the dictionary of all (<var>name</var>, <var>value</var>) pairs in this record.
     * The returned map should not allows entry addition or removal.
     * It may allows the replacement of values for existing keys only.
     *
     * @return the dictionary of all (<var>name</var>, <var>value</var>) pairs in this record.
     *
     * @see RecordType#getFieldTypes()
     *
     * @since 3.1
     */
    @UML(identifier="field", obligation=MANDATORY, specification=ISO_19103)
    Map<MemberName, Object> getFields();

    /**
     * Returns the dictionary of all (<var>name</var>, <var>value</var>) pairs in this record.
     * The returned map should not allows key addition or removal.
     * It may allows the replacement of values for existing keys only.
     *
     * @return the dictionary of all (<var>name</var>, <var>value</var>) pairs in this record.
     *
     * @see RecordType#getMemberTypes()
     *
     * @deprecated Renamed {@link #getFields()}.
     */
    @Deprecated
    @UML(identifier="memberValue", obligation=MANDATORY, specification=ISO_19103, version=2005)
    default Map<MemberName, Object> getAttributes() {
        return getFields();
    }

    /**
     * Returns the value for a field of the specified name.
     * This is functionally equivalent to <code>{@linkplain #getFields()}.{@linkplain Map#get get}(name)</code>.
     * The type of the returned object is given by
     * <code>{@linkplain #getRecordType()}.{@linkplain RecordType#locate locate}(name)</code>.
     *
     * @param  name  the name of the field to lookup.
     * @return the value of the field for the given name.
     *
     * @see RecordType#locate(MemberName)
     *
     * @deprecated This method has been removed in ISO 19103:2015. The same functionality is available with
     *             <code>{@linkplain #getFields()}.{@linkplain Map#get get}(name)</code>.
     */
    @Deprecated
    @UML(identifier="locate", obligation=MANDATORY, specification=ISO_19103, version=2005)
    default Object locate(MemberName name) {
        return getFields().get(name);
    }

    /**
     * Sets the value for the field of the specified name. This is functionally equivalent
     * to <code>{@linkplain #getFields()}.{@linkplain Map#put put}(name, value)</code>.
     * Remind that {@code name} keys are constrained to {@linkplain RecordType#getMembers()
     * record type members} only.
     *
     * @param  name   the name of the field to modify.
     * @param  value  the new value for the field.
     * @throws UnsupportedOperationException if this record is not modifiable.
     *
     * @departure easeOfUse
     *   This method provides no additional functionality compared to the ISO standard methods,
     *   but is declared in GeoAPI as a convenient shortcut.
     *
     * @deprecated Use <code>{@linkplain #getFields()}.{@linkplain Map#put put}(name, value)</code> instead.
     */
    @Deprecated
    default void set(MemberName name, Object value) throws UnsupportedOperationException {
        getFields().put(name, value);
    }
}
