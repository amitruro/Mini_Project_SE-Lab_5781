package geometries;

import primitives.Point3D;
import primitives.Vector;

public class Sphere implements Geometry {
    public Point3D _center;
    public double _radius;

    // Constructor
    public Sphere(Point3D point3D, double rad) {
        _center = point3D;
        _radius = rad;
    }

    @Override
    public Vector getNormal(Point3D point3D) {
        Vector n = point3D.subtract(_center);
        return n.normalized();
    }
}