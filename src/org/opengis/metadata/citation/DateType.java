/*$************************************************************************************************
 **
 ** $Id$
 **
 ** $Source$
 **
 ** Copyright (C) 2003 Open GIS Consortium, Inc. All Rights Reserved. http://www.opengis.org/Legal/
 **
 *************************************************************************************************/
package org.opengis.metadata.citation;

// J2SE directdependencies
import java.util.List;
import java.util.ArrayList;

// OpenGIS direct dependencies
import org.opengis.util.CodeList;

// Annotations
import org.opengis.annotation.UML;
import static org.opengis.annotation.Obligation.*;
import static org.opengis.annotation.Specification.*;


/**
 * Identification of when a given event occurred
 *
 * @author ISO 19115
 * @author <A HREF="http://www.opengis.org">OpenGIS&reg; consortium</A>
 * @version <A HREF="http://www.opengis.org/docs/01-111.pdf">Abstract specification 5.0</A>
 */
@UML (identifier="CI_DateType", specification=ISO_19115)
public final class DateType extends CodeList {
    /**
     * Serial number for compatibility with different versions.
     */
    private static final long serialVersionUID = 9031571038833329544L;

    /**
     * List of all enumerations of this type.
     * Must be declared before any enum declaration.
     */
    private static final List VALUES = new ArrayList(3);

    /**
     * Date identifies when the resource was brought into existence.
     */
    @UML (identifier="creation", obligation=CONDITIONAL, specification=ISO_19115)
    public static final DateType CREATION = new DateType("CREATION");

    /**
     * Date identifies when the resource was issued.
     */
    @UML (identifier="publication", obligation=CONDITIONAL, specification=ISO_19115)
    public static final DateType PUBLICATION = new DateType("PUBLICATION");

    /**
     * Date identifies when the resource was examined or re-examined and improved or amended.
     */
    @UML (identifier="revision", obligation=CONDITIONAL, specification=ISO_19115)
    public static final DateType REVISION = new DateType("REVISION");

    /**
     * Constructs an enum with the given name. The new enum is
     * automatically added to the list returned by {@link #values}.
     *
     * @param name The enum name. This name must not be in use by an other enum of this type.
     */
    public DateType(final String name) {
        super(name, VALUES);
    }

    /**
     * Returns the list of <code>DateType</code>s.
     */
    public static DateType[] values() {
        synchronized (VALUES) {
            return (DateType[]) VALUES.toArray(new DateType[VALUES.size()]);
        }
    }

    /**
     * Returns the list of enumerations of the same kind than this enum.
     */
    public /*{DateType}*/ CodeList[] family() {
        return values();
    }
}
