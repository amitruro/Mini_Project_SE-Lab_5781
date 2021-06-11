package geometries;

public abstract class RadialGeometry {
    final double _radius;

    public RadialGeometry(double rad) {
        _radius = rad;
    }

    /**
     * getter
     *
     * @return radius of Sphere
     */
    public double getRadius() {
        return _radius;
    }
}
