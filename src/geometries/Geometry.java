package geometries;

import primitives.Point3D;
import primitives.Vector;

public interface Geometry extends Intersectable {
    /**
     * @param point3D point on geometric object
     * @return normal vector on this point
     */
    Vector getNormal(Point3D point3D);
}