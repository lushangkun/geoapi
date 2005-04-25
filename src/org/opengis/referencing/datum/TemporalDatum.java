/*$************************************************************************************************
 **
 ** $Id$
 **
 ** $Source$
 **
 ** Copyright (C) 2003 Open GIS Consortium, Inc. All Rights Reserved. http://www.opengis.org/Legal/
 **
 *************************************************************************************************/
package org.opengis.referencing.datum;

// J2SE direct dependencies
import java.util.Date;

// OpenGIS direct dependencies
import org.opengis.util.InternationalString;

// Annotations
import org.opengis.annotation.UML;
import static org.opengis.annotation.Obligation.*;
import static org.opengis.annotation.Specification.*;


/**
 * A temporal datum defines the origin of a temporal coordinate reference system.
 *
 * @author ISO 19111
 * @author <A HREF="http://www.opengis.org">OpenGIS&reg; consortium</A>
 * @version <A HREF="http://www.opengis.org/docs/03-073r1.zip">Abstract specification 2.0</A>
 */
@UML (identifier="CD_TemporalDatum", specification=ISO_19111)
public interface TemporalDatum extends Datum {
    /**
     * The date and time origin of this temporal datum.
     *
     * @return The date and time origin of this temporal datum.
     */
    @UML (identifier="origin", obligation=MANDATORY, specification=ISO_19111)
    Date getOrigin();

    /**
     * Description of the point or points used to anchor the datum to the Earth.
     *
     * @deprecated This attribute is defined in the {@link Datum} parent interface,
     *             but is not used by a temporal datum.
     *
     * @return Always <code>null</code>.
     */
    InternationalString getAnchorPoint();

    /**
     * The time after which this datum definition is valid.
     *
     * @deprecated This attribute is defined in the {@link Datum} parent interface,
     *             but is not used by a temporal datum.
     *
     * @return Always <code>null</code>.
     */
    Date getRealizationEpoch();
}
