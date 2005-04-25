/*$************************************************************************************************
 **
 ** $Id$
 **
 ** $Source$
 **
 ** Copyright (C) 2003 Open GIS Consortium, Inc. All Rights Reserved. http://www.opengis.org/Legal/
 **
 *************************************************************************************************/
package org.opengis.referencing.crs;

// OpenGIS direct dependencies
import org.opengis.referencing.datum.EngineeringDatum;

// Annotations
import org.opengis.annotation.UML;
import static org.opengis.annotation.Obligation.*;
import static org.opengis.annotation.Specification.*;


/**
 * A contextually local coordinate reference system. It can be divided into two broad categories:
 * <ul>
 *   <li>earth-fixed systems applied to engineering activities on or near the surface of the
 *       earth;</li>
 *   <li>CRSs on moving platforms such as road vehicles, vessels, aircraft, or spacecraft.</li>
 * </ul>
 *
 * <TABLE CELLPADDING='6' BORDER='1'>
 * <TR BGCOLOR="#EEEEFF"><TH NOWRAP>Used with CS type(s)</TH></TR>
 * <TR><TD>
 *   {@link org.opengis.referencing.cs.AffineCS           Affine},
 *   {@link org.opengis.referencing.cs.CartesianCS        Cartesian},
 *   {@link org.opengis.referencing.cs.EllipsoidalCS      Ellipsoidal},
 *   {@link org.opengis.referencing.cs.SphericalCS        Spherical},
 *   {@link org.opengis.referencing.cs.CylindricalCS      Cylindrical},
 *   {@link org.opengis.referencing.cs.PolarCS            Polar},
 *   {@link org.opengis.referencing.cs.VerticalCS         Vertical},
 *   {@link org.opengis.referencing.cs.LinearCS           Linear}
 * </TD></TR></TABLE>
 *
 * @author ISO 19111
 * @author <A HREF="http://www.opengis.org">OpenGIS&reg; consortium</A>
 * @version <A HREF="http://www.opengis.org/docs/03-073r1.zip">Abstract specification 2.0</A>
 */
@UML (identifier="SC_EngineeringCRS", specification=ISO_19111)
public interface EngineeringCRS extends SingleCRS {
    /**
     * Returns the datum, which must be an engineering one.
     */
/// @UML (identifier="usesDatum", obligation=MANDATORY, specification=ISO_19111)
/// EngineeringDatum getDatum();
}
