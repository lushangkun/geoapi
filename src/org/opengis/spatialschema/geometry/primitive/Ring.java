/*$************************************************************************************************
 **
 ** $Id$
 **
 ** $Source$
 **
 ** Copyright (C) 2003 Open GIS Consortium, Inc. All Rights Reserved. http://www.opengis.org/Legal/
 **
 *************************************************************************************************/
package org.opengis.spatialschema.geometry.primitive;

// OpenGIS direct dependencies
import org.opengis.spatialschema.geometry.complex.CompositeCurve;

// Annotations
import org.opengis.annotation.UML;
import static org.opengis.annotation.Obligation.*;
import static org.opengis.annotation.Specification.*;


/**
 * Represent a single connected component of a {@linkplain SurfaceBoundary surface boundary}.
 * It consists of a number of references to {@linkplain OrientableCurve orientable curves}
 * connected in a cycle (an object whose boundary is empty). A <code>Ring</code> is structurally
 * similar to a {@linkplain CompositeCurve composite curve} in that the end point of each
 * {@linkplain OrientableCurve orientable curve} in the sequence is the start point of the next
 * {@linkplain OrientableCurve orientable curve} in the sequence. Since the sequence is circular,
 * there is no exception to this rule. Each ring, like all boundaries is a cycle and each ring is
 * simple.
 * <br><br>
 * Even though each <code>Ring</code> is simple, the boundary need not be simple. The easiest
 * case of this is where one of the interior rings of a surface is tangent to its exterior ring.
 * Implementations may enforce stronger restrictions on the interaction of boundary elements.
 *
 * @author ISO/DIS 19107
 * @author <A HREF="http://www.opengis.org">OpenGIS&reg; consortium</A>
 * @version <A HREF="http://www.opengis.org/docs/01-101.pdf">Abstract specification 5</A>
 *
 * @see SurfaceBoundary
 * @see Shell
 */
@UML (identifier="GM_Ring", specification=ISO_19107)
public interface Ring extends CompositeCurve {
    /**
     * Always returns <code>true</code> since ring objects are simples.
     *
     * @return Always <code>true</code>.
     */
    public boolean isSimple();
}
