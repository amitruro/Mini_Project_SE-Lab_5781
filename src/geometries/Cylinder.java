package geometries;

import primitives.Point3D;
import primitives.Ray;
import primitives.Vector;

public class Cylinder extends Tube {
    final double _height;

    /**
     * constructor for Cylinder
     *
     * @param ray
     * @param rad
     * @param height
     */
    public Cylinder(Ray ray, double rad, double height) {
        super(ray, rad);
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
}