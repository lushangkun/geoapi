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

import static org.opengis.annotation.Specification.*;


/**
 * Correctness of ordered events or sequences, if reported.
 *
 * <h2>Standardized values</h2>
 * In order to achieve well defined and comparable quality information, it is recommended to
 * report data quality using {@linkplain Measure quality measures} listed in ISO 19157 annex.
 * The following table provides a summary; see ISO 19157 for more complete descriptions and examples.
 * All identifiers should be in "ISO 19157" namespace.
 *
 * <table class="ogc">
 *   <caption>Standardized values derived from ISO 19157</caption>
 *   <tr>
 *     <th>{@linkplain MeasureReference#getMeasureIdentification() Identifier}</th>
 *     <th>{@linkplain MeasureReference#getNamesOfMeasure() Name of measure}</th>
 *     <th>{@linkplain Measure#getBasicMeasure() Basic measure}</th>
 *     <th>{@linkplain Measure#getValueType() Value type}</th>
 *     <th>Remarks</th>
 *   </tr><tr>
 *     <td>159</td>
 *     <td>chronological order</td>
 *     <td>error indicator</td>
 *     <td>Boolean</td>
 *     <td>{@code true} indicates that the event is incorrectly ordered</td>
 *   </tr>
 * </table>
 *
 * <p>{@linkplain Measure#getDefinition() Definitions}:</p>
 * <ol start="159">
 *   <li>Indication that an event is incorrectly ordered against the other events.</li>
 * </ol>
 *
 * @author  Martin Desruisseaux (IRD)
 * @author  Alexis Gaillard (Geomatys)
 * @version 3.1
 * @since   2.0
 */
@UML(identifier="DQ_TemporalConsistency", specification=ISO_19157)
public interface TemporalConsistency extends TemporalQuality, TemporalAccuracy {
}
