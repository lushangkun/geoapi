/*
 *    GeoAPI - Java interfaces for OGC/ISO standards
 *    http://www.geoapi.org
 *
 *    Copyright (C) 2004-2021 Open Geospatial Consortium, Inc.
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

import org.opengis.annotation.UML;
import org.opengis.annotation.Classifier;
import org.opengis.annotation.Stereotype;

import static org.opengis.annotation.Specification.*;


/**
 * Accuracy and correctness of attributes and classification of features.
 * More specifically:
 *
 * <ul>
 *   <li>accuracy of quantitative attributes,</li>
 *   <li>correctness of non-quantitative attributes,</li>
 *   <li>correctness of the classifications of features and their relationships.</li>
 * </ul>
 *
 * Instances should be one of the following subtypes:
 * <ul>
 *   <li>{@link ThematicClassificationCorrectness}: comparison of the classes assigned to features or their attributes to a universe of discourse;</li>
 *   <li>{@link NonQuantitativeAttributeCorrectness}: measure of whether a non-quantitative attribute is correct or incorrect;</li>
 *   <li>{@link QuantitativeAttributeAccuracy}: closeness of the value of a quantitative attribute to a value accepted as being true.</li>
 * </ul>
 *
 * @author  Martin Desruisseaux (IRD)
 * @author  Alexis Gaillard (Geomatys)
 * @version 3.1
 * @since   2.0
 */
@Classifier(Stereotype.ABSTRACT)
@UML(identifier="DQ_ThematicAccuracy", specification=ISO_19157)
public interface ThematicAccuracy extends Element {
}
