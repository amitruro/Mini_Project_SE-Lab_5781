package geometries;

import primitives.Point3D;
import primitives.Ray;
import primitives.Vector;

import java.util.List;

public class Tube extends RadialGeometry implements Geometry {
    final Ray _axisRay;

    /**
     * constructor for Tube
     *
     * @param ray ray of Tube
     * @param rad radius of Tube
     */
    public Tube(double rad, Ray ray) {
        super(rad);
        _axisRay = ray;
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
     * get the normal of Tube
     * Finding point O (O is projection of P on cylinder's ray):
     * 𝑡 = 𝑣 ∙ (𝑃 − 𝑃0)
     * 𝑂 = 𝑃0 + 𝑡 ∙ 𝑣
     * n = P - O
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
        Vector n = point.subtract(O);
        return n.normalize();
    }

    @Override
    public List<Point3D> findIntersections(Ray ray) {
        return null;
    }
}