package geometries;

import primitives.Point3D;
import primitives.Vector;

public class Plane implements Geometry {
    final Point3D _q0;
    final Vector _normal;

    /**
     * constructor for Plane
     *
     * @param pt1 point 1
     * @param pt2 point 2
     * @param pt3 point 3
     */
    public Plane(Point3D pt1, Point3D pt2, Point3D pt3) {
        _q0 = pt1;

        Vector u = pt2.subtract(pt1);
        Vector v = pt3.subtract(pt1);

        Vector n = u.crossProduct(v);

        _normal = n.normalize();
    }

    /**
     * getter
     *
     * @return point of Plane
     */
    public Point3D getQ0() {
        return _q0;
    }

    /**
     * getter
     *
     * @return normal of Plane
     */
    public Vector getNormal() {
        return _normal;
    }

    /**
     * get the normal of Plane
     *
     * @param point3D
     * @return normal of Plane
     */
    @Override
    public Vector getNormal(Point3D point3D) {
        return _normal;
    }
}