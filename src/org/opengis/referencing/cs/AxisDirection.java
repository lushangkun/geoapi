/*$************************************************************************************************
 **
 ** $Id$
 **
 ** $Source$
 **
 ** Copyright (C) 2001 Open GIS Consortium, Inc. All Rights Reserved. http://www.opengis.org/Legal/
 **
 *************************************************************************************************/
package org.opengis.referencing.cs;

// J2SE directdependencies
import java.util.List;
import java.util.ArrayList;

// OpenGIS direct dependencies
import org.opengis.util.CodeList;

// Annotations
///import org.opengis.annotation.UML;
///import org.opengis.annotation.Extension;
///import static org.opengis.annotation.Obligation.*;


/**
 * The direction of positive increments in the coordinate value for a coordinate system
 * axis. This direction is exact In some cases, and is approximate in other cases.
 *
 * Some coordinate systems use non-standard orientations.  For example,
 * the first axis in South African grids usually points West, instead of
 * East. This information is obviously relevant for algorithms converting
 * South African grid coordinates into Lat/Long.
 *
 * @author <A HREF="http://www.opengis.org">OpenGIS&reg; consortium</A>
 * @version <A HREF="http://www.opengis.org/docs/03-073r1.zip">Abstract specification 2.0</A>
 */
///@UML (identifier="CS_AxisDirection")
public final class AxisDirection extends CodeList {
    /**
     * Serial number for compatibility with different versions.
     */
    private static final long serialVersionUID = -4405275475770755714L;

    /**
     * List of all enumerations of this type.
     * Must be declared before any enum declaration.
     */
    private static final List VALUES = new ArrayList(32);

    /**
     * Unknown or unspecified axis orientation.
     */
    public static final AxisDirection OTHER = new AxisDirection("OTHER");
    static {
        OTHER.opposite = OTHER;
    }

    /**
     * Axis positive direction is north. In a geographic or projected CRS,
     * north is defined through the geodetic datum. In an engineering CRS,
     * north may be defined with respect to an engineering object rather
     * than a geographical direction.
     */
/// @UML (identifier="north", obligation=CONDITIONAL)
    public static final AxisDirection NORTH = new AxisDirection("NORTH");

    /**
     * Axis positive direction is approximately north-north-east.
     */
/// @UML (identifier="northNorthEast", obligation=CONDITIONAL)
    public static final AxisDirection NORTH_NORTH_EAST = new AxisDirection("NORTH_NORTH_EAST");

    /**
     * Axis positive direction is approximately north-east.
     */
/// @UML (identifier="northEast", obligation=CONDITIONAL)
    public static final AxisDirection NORTH_EAST = new AxisDirection("NORTH_EAST");

    /**
     * Axis positive direction is approximately east-north-east.
     */
/// @UML (identifier="eastNorthEast", obligation=CONDITIONAL)
    public static final AxisDirection EAST_NORTH_EAST = new AxisDirection("EAST_NORTH_EAST");

    /**
     * Axis positive direction is &pi;/2 radians clockwise from north.
     * This is usually used for Grid X coordinates and Longitude.
     */
/// @UML (identifier="east", obligation=CONDITIONAL)
    public static final AxisDirection EAST = new AxisDirection("EAST");

    /**
     * Axis positive direction is approximately east-south-east.
     */
/// @UML (identifier="eastSouthEast", obligation=CONDITIONAL)
    public static final AxisDirection EAST_SOUTH_EAST = new AxisDirection("EAST_SOUTH_EAST");

    /**
     * Axis positive direction is approximately south-east.
     */
/// @UML (identifier="southEast", obligation=CONDITIONAL)
    public static final AxisDirection SOUTH_EAST = new AxisDirection("SOUTH_EAST");

    /**
     * Axis positive direction is approximately south-south-east.
     */
/// @UML (identifier="southSouthEast", obligation=CONDITIONAL)
    public static final AxisDirection SOUTH_SOUTH_EAST = new AxisDirection("SOUTH_SOUTH_EAST");

    /**
     * Axis positive direction is &pi; radians clockwise from north.
     */
/// @UML (identifier="south", obligation=CONDITIONAL)
    public static final AxisDirection SOUTH = new AxisDirection("SOUTH", NORTH);

    /**
     * Axis positive direction is approximately south-south-west.
     */
/// @UML (identifier="southSouthWest", obligation=CONDITIONAL)
    public static final AxisDirection SOUTH_SOUTH_WEST = new AxisDirection("SOUTH_SOUTH_WEST", NORTH_NORTH_EAST);

    /**
     * Axis positive direction is approximately south-west.
     */
/// @UML (identifier="southWest", obligation=CONDITIONAL)
    public static final AxisDirection SOUTH_WEST = new AxisDirection("SOUTH_WEST", NORTH_EAST);

    /**
     * Axis positive direction is approximately west-south-west.
     */
/// @UML (identifier="westSouthWest", obligation=CONDITIONAL)
    public static final AxisDirection WEST_SOUTH_WEST = new AxisDirection("WEST_SOUTH_WEST", EAST_NORTH_EAST);

    /**
     * Axis positive direction is 3&pi;/2 radians clockwise from north.
     * This is usually used for Grid X coordinates and Longitude.
     */
/// @UML (identifier="west", obligation=CONDITIONAL)
    public static final AxisDirection WEST = new AxisDirection("WEST", EAST);

    /**
     * Axis positive direction is approximately west-north-west.
     */
/// @UML (identifier="westNorthWest", obligation=CONDITIONAL)
    public static final AxisDirection WEST_NORTH_WEST = new AxisDirection("WEST_NORTH_WEST", EAST_SOUTH_EAST);

    /**
     * Axis positive direction is approximately north-west.
     */
/// @UML (identifier="northWest", obligation=CONDITIONAL)
    public static final AxisDirection NORTH_WEST = new AxisDirection("NORTH_WEST", SOUTH_EAST);

    /**
     * Axis positive direction is approximately north-north-west.
     */
/// @UML (identifier="northNorthWest", obligation=CONDITIONAL)
    public static final AxisDirection NORTH_NORTH_WEST = new AxisDirection("NORTH_NORTH_WEST", SOUTH_SOUTH_EAST);

    /**
     * Axis positive direction is up relative to gravity.
     * This is used for {@linkplain org.opengis.referencing.crs.VerticalCRS vertical}
     * coordinate reference systems.
     */
/// @UML (identifier="up", obligation=CONDITIONAL)
    public static final AxisDirection UP = new AxisDirection("UP");

    /**
     * Axis positive direction is down relative to gravity.
     * This is used for {@linkplain org.opengis.referencing.crs.VerticalCRS vertical}
     * coordinate reference systems.
     */
/// @UML (identifier="down", obligation=CONDITIONAL)
    public static final AxisDirection DOWN = new AxisDirection("DOWN", UP);

    /**
     * Axis positive direction is in the equatorial plane from the centre of the
     * modelled earth towards the intersection of the equator with the prime meridian.
     */
/// @UML (identifier="geocentricX", obligation=CONDITIONAL)
    public static final AxisDirection GEOCENTRIC_X = new AxisDirection("GEOCENTRIC_X");

    /**
     * Axis positive direction is in the equatorial plane from the centre of the
     * modelled earth towards the intersection of the equator and the meridian &pi;/2
     * radians eastwards from the prime meridian.
     */
/// @UML (identifier="geocentricY", obligation=CONDITIONAL)
    public static final AxisDirection GEOCENTRIC_Y = new AxisDirection("GEOCENTRIC_Y");

    /**
     * Axis positive direction is from the centre of the modelled earth parallel to
     * its rotation axis and towards its north pole.
     */
/// @UML (identifier="geocentricZ", obligation=CONDITIONAL)
    public static final AxisDirection GEOCENTRIC_Z = new AxisDirection("GEOCENTRIC_Z");

    /**
     * Axis positive direction is towards the future.
     * This is used for {@linkplain org.opengis.referencing.crs.TemporalCRS temporal}
     * coordinate reference systems.
     */
/// @UML (identifier="future", obligation=CONDITIONAL)
    public static final AxisDirection FUTURE = new AxisDirection("FUTURE");

    /**
     * Axis positive direction is towards the past.
     * This is used for {@linkplain org.opengis.referencing.crs.TemporalCRS temporal}
     * coordinate reference systems.
     */
/// @UML (identifier="past", obligation=CONDITIONAL)
    public static final AxisDirection PAST = new AxisDirection("PAST", FUTURE);

    /**
     * Axis positive direction is towards higher pixel column.
     */
/// @UML (identifier="columnPositive", obligation=CONDITIONAL)
    public static final AxisDirection COLUMN_POSITIVE = new AxisDirection("COLUMN_POSITIVE");

    /**
     * Axis positive direction is towards lower pixel column.
     */
/// @UML (identifier="columnNegative", obligation=CONDITIONAL)
    public static final AxisDirection COLUMN_NEGATIVE = new AxisDirection("COLUMN_NEGATIVE", COLUMN_POSITIVE);

    /**
     * Axis positive direction is towards higher pixel row.
     */
/// @UML (identifier="rowPositive", obligation=CONDITIONAL)
    public static final AxisDirection ROW_POSITIVE = new AxisDirection("ROW_POSITIVE");

    /**
     * Axis positive direction is towards lower pixel row.
     */
/// @UML (identifier="rowNegative", obligation=CONDITIONAL)
    public static final AxisDirection ROW_NEGATIVE = new AxisDirection("ROW_NEGATIVE", ROW_POSITIVE);

    /**
     * Axis positive direction is right in display.
     */
/// @UML (identifier="displayRight", obligation=CONDITIONAL)
    public static final AxisDirection DISPLAY_RIGHT = new AxisDirection("DISPLAY_RIGHT");

    /**
     * Axis positive direction is left in display.
     */
/// @UML (identifier="displayLeft", obligation=CONDITIONAL)
    public static final AxisDirection DISPLAY_LEFT = new AxisDirection("DISPLAY_LEFT", DISPLAY_RIGHT);

    /**
     * Axis positive direction is towards top of approximately vertical display surface.
     */
/// @UML (identifier="displayUp", obligation=CONDITIONAL)
    public static final AxisDirection DISPLAY_UP = new AxisDirection("DISPLAY_UP");

    /**
     * Axis positive direction is towards bottom of approximately vertical display surface.
     */
/// @UML (identifier="displayDown", obligation=CONDITIONAL)
    public static final AxisDirection DISPLAY_DOWN = new AxisDirection("DISPLAY_DOWN", DISPLAY_UP);

    /**
     * Increasing ordinates values go right, usually on a horizontal plane.
     * This is used for rendering coordinate reference systems.
     *
     * @deprecated Use {@link #DISPLAY_RIGHT} instead.
     */
    public static final AxisDirection RIGHT = DISPLAY_RIGHT;

    /**
     * Increasing ordinates values go left, usually on a horizontal plane.
     * This is used for rendering coordinate reference systems.
     *
     * @deprecated Use {@link #DISPLAY_LEFT} instead.
     */
    public static final AxisDirection LEFT = DISPLAY_LEFT;

    /**
     * Increasing ordinates values go top, usually on a horizontal plane.
     * This is used for rendering coordinate reference systems.
     *
     * @deprecated Use {@link #DISPLAY_UP} instead.
     */
    public static final AxisDirection TOP = DISPLAY_UP;

    /**
     * Increasing ordinates values go bottom, usually on a horizontal plane.
     * This is used for rendering coordinate reference systems.
     *
     * @deprecated Use {@link #DISPLAY_DOWN} instead.
     */
    public static final AxisDirection BOTTOM = DISPLAY_DOWN;

    /**
     * The opposite direction for this axis, or <code>null</code> if the opposite
     * direction has not yet been specified.
     */
    private transient AxisDirection opposite;

    /**
     * Constructs an enum with the given name. The new enum is
     * automatically added to the list returned by {@link #values}.
     *
     * @param name The enum name. This name must not be in use by an other enum of this type.
     */
    public AxisDirection(final String name) {
        super(name, VALUES);
    }

    /**
     * Constructs an axis direction which is the opposite of the specified direction.
     */
    private AxisDirection(final String name, final AxisDirection opposite) {
        this(name);
        if (opposite.opposite != null) {
            throw new IllegalArgumentException(String.valueOf(opposite));
        }
        this.opposite = opposite;
        opposite.opposite = this;
    }

    /**
     * Returns the list of <code>AxisDirection</code>s.
     */
    public static AxisDirection[] values() {
        synchronized (VALUES) {
            return (AxisDirection[]) VALUES.toArray(new AxisDirection[VALUES.size()]);
        }
    }

    /**
     * Returns the list of enumerations of the same kind than this enum.
     */
    public /*{AxisDirection}*/ CodeList[] family() {
        return values();
    }

    /**
     * Returns the opposite direction of this axis.
     *
     * @deprecated Use {@link #opposite} instead.
     */
/// @Extension
    public AxisDirection inverse() {
        return (opposite!=null) ? opposite : this;
    }

    /**
     * Returns the opposite direction of this axis. The opposite direction of
     * {@linkplain #NORTH North} is {@linkplain #SOUTH South}, and the opposite
     * direction of {@linkplain #SOUTH South} is {@linkplain #NORTH North}.
     * The same applies to {@linkplain #EAST East}-{@linkplain #WEST West},
     * {@linkplain #UP Up}-{@linkplain #DOWN Down} and
     * {@linkplain #FUTURE Future}-{@linkplain #PAST Past}, <cite>etc.</cite>
     * If this axis direction has no opposite, then this method returns <code>null</code>.
     */
/// @Extension
    public AxisDirection opposite() {
        return opposite;
    }

    /**
     * Returns the "absolute" direction of this axis.
     * This "absolute" operation is similar to the <code>Math.abs(int)</code>
     * method in that "negative" directions like ({@link #SOUTH}, {@link #WEST},
     * {@link #DOWN}, {@link #PAST}) are changed for their "positive" counterparts
     * ({@link #NORTH}, {@link #EAST}, {@link #UP}, {@link #FUTURE}).
     * More specifically, the following conversion table is applied:
     * <br>&nbsp;
     * <table cellpadding="9"><tr>
     * <td width='50%'><table border="1" bgcolor="F4F8FF">
     *   <tr bgcolor="#B9DCFF">
     *     <th nowrap width='50%'>&nbsp;&nbsp;Direction&nbsp;&nbsp;</th>
     *     <th nowrap width='50%'>&nbsp;&nbsp;Absolute value&nbsp;&nbsp;</th>
     *   </tr>
     *   <tr><td width='50%'>&nbsp;{@link #NORTH}</td> <td width='50%'>&nbsp;{@link #NORTH}</td> </tr>
     *   <tr><td width='50%'>&nbsp;{@link #SOUTH}</td> <td width='50%'>&nbsp;{@link #NORTH}</td> </tr>
     *   <tr><td width='50%'>&nbsp;{@link #EAST}</td>  <td width='50%'>&nbsp;{@link #EAST}</td>  </tr>
     *   <tr><td width='50%'>&nbsp;{@link #WEST}</td>  <td width='50%'>&nbsp;{@link #EAST}</td>  </tr>
     *   <tr><td width='50%'>&nbsp;{@link #UP}</td>    <td width='50%'>&nbsp;{@link #UP}</td>    </tr>
     *   <tr><td width='50%'>&nbsp;{@link #DOWN}</td>  <td width='50%'>&nbsp;{@link #UP}</td>    </tr>
     * </table></td>
     * <td width='50%'><table border="1" bgcolor="F4F8FF">
     *   <tr bgcolor="#B9DCFF">
     *     <th nowrap width='50%'>&nbsp;&nbsp;Direction&nbsp;&nbsp;</th>
     *     <th nowrap width='50%'>&nbsp;&nbsp;Absolute value&nbsp;&nbsp;</th>
     *   </tr>
     *   <tr><td width='50%'>&nbsp;{@link #DISPLAY_RIGHT}</td> <td width='50%'>&nbsp;{@link #DISPLAY_RIGHT}</td> </tr>
     *   <tr><td width='50%'>&nbsp;{@link #DISPLAY_LEFT}</td>  <td width='50%'>&nbsp;{@link #DISPLAY_RIGHT}</td> </tr>
     *   <tr><td width='50%'>&nbsp;{@link #DISPLAY_UP}</td>    <td width='50%'>&nbsp;{@link #DISPLAY_UP}</td>    </tr>
     *   <tr><td width='50%'>&nbsp;{@link #DISPLAY_DOWN}</td>  <td width='50%'>&nbsp;{@link #DISPLAY_UP}</td>    </tr>
     *   <tr><td width='50%'>&nbsp;{@link #FUTURE}</td>        <td width='50%'>&nbsp;{@link #FUTURE}</td>        </tr>
     *   <tr><td width='50%'>&nbsp;{@link #PAST}</td>          <td width='50%'>&nbsp;{@link #FUTURE}</td>        </tr>
     * </table></td></tr>
     *   <tr align="center"><td width='50%'>{@link #OTHER}</td><td width='50%'>{@link #OTHER}</td></tr>
     * </table>
     */
/// @Extension
    public AxisDirection absolute() {
        final AxisDirection opposite = this.opposite;
        if (opposite != null) {
            if (opposite.ordinal() < ordinal()) {
                return opposite;
            }
        }
        return this;
    }
}
