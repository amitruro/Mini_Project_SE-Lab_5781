package geometries;

import primitives.Point3D;
import primitives.Ray;
import primitives.Vector;

public class Cylinder extends Tube {
    double _height;

    // Constructor
    public Cylinder(Ray ray, double rad, double height) {
        super(ray, rad);
        _height = height;
    }

    @Override
    public Vector getNormal(Point3D point3D) {
        return null;
    }
}