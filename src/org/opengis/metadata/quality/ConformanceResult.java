/*$************************************************************************************************
 **
 ** $Id$
 **
 ** $Source$
 **
 ** Copyright (C) 2003 Open GIS Consortium, Inc. All Rights Reserved. http://www.opengis.org/Legal/
 **
 *************************************************************************************************/
package org.opengis.metadata.quality;

// OpenGIS direct dependencies
import org.opengis.util.InternationalString;
import org.opengis.metadata.citation.Citation;

// Annotations
import org.opengis.annotation.UML;
import static org.opengis.annotation.Obligation.*;
import static org.opengis.annotation.Specification.*;


/**
 * Information about the outcome of evaluating the obtained value (or set of values) against
 * a specified acceptable conformance quality level.
 *
 * @author ISO 19115
 * @author <A HREF="http://www.opengis.org">OpenGIS&reg; consortium</A>
 * @version <A HREF="http://www.opengis.org/docs/01-111.pdf">Abstract specification 5.0</A>
 */
@UML (identifier="DQ_ConformanceResult", specification=ISO_19115)
public interface ConformanceResult extends Result {
    /**
     * Citation of product specification or user requirement against which data is being evaluated.
     */
    @UML (identifier="specification", obligation=MANDATORY, specification=ISO_19115)
    Citation getSpecification();

    /**
     * Explanation of the meaning of conformance for this result.
     */
    @UML (identifier="explanation", obligation=MANDATORY, specification=ISO_19115)
    InternationalString getExplanation();

    /**
     * Indication of the conformance result.
     */
    @UML (identifier="pass", obligation=MANDATORY, specification=ISO_19115)
    boolean pass();
}
