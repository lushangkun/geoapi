/*$************************************************************************************************
 **
 ** $Id$
 **
 ** $Source$
 **
 ** Copyright (C) 2003 Open GIS Consortium, Inc. All Rights Reserved. http://www.opengis.org/Legal/
 **
 *************************************************************************************************/
package org.opengis.metadata.extent;

// OpenGIS direct dependencies
import org.opengis.metadata.Identifier;

// Annotations
import org.opengis.annotation.UML;
import static org.opengis.annotation.Obligation.*;
import static org.opengis.annotation.Specification.*;


/**
 * Description of the geographic area using identifiers.
 *
 * @author ISO 19115
 * @author <A HREF="http://www.opengis.org">OpenGIS&reg; consortium</A>
 * @version <A HREF="http://www.opengis.org/docs/01-111.pdf">Abstract specification 5.0</A>
 */
@UML (identifier="EX_GeographicDescription", specification=ISO_19115)
public interface GeographicDescription extends GeographicExtent {
    /**
     * Returns the identifier used to represent a geographic area.
     */
    @UML (identifier="geographicIdentifier", obligation=MANDATORY, specification=ISO_19115)
    Identifier getGeographicIdentifier();
}
