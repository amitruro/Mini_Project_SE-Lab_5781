package geometries;

import primitives.Point3D;
import primitives.Vector;

public class Sphere implements Geometry {
    final public Point3D _center;
    final public double _radius;

    /**
     * constructor for Sphere
     *
     * @param point3D center of Sphere
     * @param rad     radius of Sphere
     */
    public Sphere(Point3D point3D, double rad) {
        _center = point3D;
        _radius = rad;
    }

    /**
     * getter
     *
     * @return center of Sphere
     */
    public Point3D getCenter() {
        return _center;
    }

    /**
     * getter
     *
     * @return radius of Sphere
     */
    public double getRadius() {
        return _radius;
    }

    /**
     * find normal of Sphere
     * n = normalize(P - O) [n = Sphere normal]
     *
     * @param P
     * @return
     */
    @Override
    public Vector getNormal(Point3D P) {
        Point3D O = _center;
        Vector n = P.subtract(O);
        return n.normalized();
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "_center=" + _center +
                ", _radius=" + _radius +
                '}';
    }
}