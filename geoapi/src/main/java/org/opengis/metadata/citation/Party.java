/*
 *    GeoAPI - Java interfaces for OGC/ISO standards
 *    http://www.geoapi.org
 *
 *    Copyright (C) 2014-2021 Open Geospatial Consortium, Inc.
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
package org.opengis.metadata.citation;

import java.util.Collection;
import java.util.Collections;

import org.opengis.annotation.UML;
import org.opengis.annotation.Classifier;
import org.opengis.annotation.Stereotype;
import org.opengis.util.InternationalString;
import org.opengis.metadata.Identifier;

import static org.opengis.annotation.Obligation.*;
import static org.opengis.annotation.Specification.ISO_19115;


/**
 * Information about the individual and / or organisation of the party.
 *
 * @author  Rémi Maréchal (Geomatys)
 * @version 3.1
 * @since   3.1
 */
@Classifier(Stereotype.ABSTRACT)
@UML(identifier="CI_Party", specification=ISO_19115)
public interface Party {
    /**
     * Name of the party.
     *
     * @return name of the party, or {@code null} if none.
     *
     * @condition Mandatory if the {@linkplain Organisation#getLogo() logo} and the
     *            {@linkplain Individual#getPositionName() position name} are not documented.
     */
    @UML(identifier="name", obligation=CONDITIONAL, specification=ISO_19115)
    InternationalString getName();

    /**
     * Identifiers of the party.
     *
     * @return identifiers of the party, or an empty collection if none.
     *
     * @departure rename
     *   Renamed from "{@code partyIdentifier}" to "{@code identifier}"
     *   for providing a unified method signature for identifiers.
     */
    @UML(identifier="partyIdentifier", obligation=OPTIONAL, specification=ISO_19115, version=2018)
    default Collection<? extends Identifier> getIdentifiers() {
        return Collections.emptyList();
    }

    /**
     * Contact information for the party.
     *
     * @return contact information for the party, or an empty collection if none.
     */
    @UML(identifier="contactInfo", obligation=OPTIONAL, specification=ISO_19115)
    default Collection<? extends Contact> getContactInfo() {
        return Collections.emptyList();
    }
}
