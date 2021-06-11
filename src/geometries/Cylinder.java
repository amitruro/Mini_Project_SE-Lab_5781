package geometries;

import primitives.Point3D;
import primitives.Ray;
import primitives.Vector;

import java.util.List;

public class Cylinder extends Tube implements Geometry {
    final double _height;

    /**
     * constructor for Cylinder
     *
     * @param ray    of Cylinder
     * @param rad    of Cylinder
     * @param height of Cylinder
     */
    public Cylinder(double rad, Ray ray, double height) {
        super(rad, ray);
        _height = height;
    }

    /**
     * get the normal of Cylinder
     *
     * @param point3D
     * @return normal of Cylinder
     */
    @Override
    public Vector getNormal(Point3D point3D) {
        return null;
    }

    @Override
    public List<Point3D> findIntersections(Ray ray) {
        return super.findIntersections(ray);
    }
}