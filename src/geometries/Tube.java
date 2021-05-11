package geometries;

import primitives.Point3D;
import primitives.Ray;
import primitives.Vector;

public class Tube implements Geometry {
    Ray _axisRay;
    double _radius;

    public Ray getAxisRay() {
        return _axisRay;
    }

    //Getter
    public double getRadius() {
        return _radius;
    }

    //Constructor
    public Tube(Ray ray, double rad) {
        _axisRay = ray;
        _radius = rad;
    }

    @Override
    public Vector getNormal(Point3D point) {
        var p1 = point.subtract(_axisRay.getP0());
        double v = _axisRay.get_dir().dotProduct(p1);
        Point3D O = _axisRay.getP0().add(p1.scale(v));

        Vector N = point.subtract(O);

        return N.normalize();
    }
}