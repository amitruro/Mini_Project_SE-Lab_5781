package geometries;

import primitives.Point3D;

public class Triangle extends Polygon {

    /* Constructor by Polygon*/
    private Triangle(Point3D x1, Point3D x2, Point3D x3) {
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