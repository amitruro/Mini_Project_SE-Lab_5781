package geometries;

import primitives.Point3D;
import primitives.Ray;
import primitives.Vector;

public class Tube implements Geometry {
    final Ray _axisRay;
    final double _radius;

    /**
     * constructor for Tube
     *
     * @param ray ray of Tube
     * @param rad radius of Tube
     */
    public Tube(Ray ray, double rad) {
        _axisRay = ray;
        _radius = rad;
    }

    /**
     * getter
     *
     * @return axis of the ray of Tube
     */
    public Ray getAxisRay() {
        return _axisRay;
    }

    /**
     * getter
     *
     * @return radius of Tube
     */
    public double getRadius() {
        return _radius;
    }

    /**
     * get the normal of Tube
     * Finding point O (O is projection of P on cylinder's ray):
     * 𝑡 = 𝑣 ∙ (𝑃 − 𝑃0)
     * 𝑂 = 𝑃0 + 𝑡 ∙ 𝑣
     *
     * @param point
     * @return normal of Tube
     */
    @Override
    public Vector getNormal(Point3D point) {
        Point3D p0 = _axisRay.getP0();
        var p_p0 = point.subtract(p0);
        Vector v = _axisRay.get_dir();
        double t = v.dotProduct(p_p0);
        Point3D O = p0.add(v.scale(t));
        return point.subtract(O).normalize();
    }
}