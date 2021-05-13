package geometries;

import primitives.Point3D;

public class Triangle extends Polygon {

    /**
     * constructor for Triangle (by Polygon)
     *
     * @param x1 point 1 of Triangle
     * @param x2 point 2 of Triangle
     * @param x3 point 3 of Triangle
     */
    Triangle(Point3D x1, Point3D x2, Point3D x3) {
        super(x1, x2, x3);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "vertices=" + vertices +
                ", plane=" + plane +
                '}';
    }
}