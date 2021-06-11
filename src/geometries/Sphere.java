package geometries;

import primitives.Point3D;
import primitives.Ray;
import primitives.Vector;

import java.util.List;

import static primitives.Util.alignZero;

public class Sphere extends RadialGeometry implements Geometry {
    final Point3D _center;

    /**
     * constructor for Sphere
     *
     * @param point3D center of Sphere
     * @param rad     radius of Sphere
     */
    public Sphere(double rad, Point3D point3D) {
        super(rad);
        _center = point3D;
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

    @Override
    public List<Point3D> findIntersections(Ray ray) {
        Point3D p0 = ray.getP0();
        Point3D O = _center;
        Vector V = ray.get_dir();

        if (p0.equals(O)) {
            throw new IllegalArgumentException("Ray p0 can't be equals to the center of the sphere");
        }

        Vector U = O.subtract(p0);
        double tm = V.dotProduct(U);
        double d = alignZero(Math.sqrt(U.lengthSquared() - tm * tm));
        if (d >= _radius) {
            return null;
        }

        double tn = Math.sqrt(_radius * _radius - d * d);
        double t1 = tm - tn;
        double t2 = tm + tn;

        if (t1 > 0 && t2 > 0) {
            return (List.of(ray.getPoint(t1), ray.getPoint(t2)));
        }

        if (t1 > 0) {
            return (List.of(ray.getPoint(t1)));
        }

        if (t2 > 0) {
            return (List.of(ray.getPoint(t2)));
        }

        return null;
    }
}