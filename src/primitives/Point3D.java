package primitives;

public class Point3D {
    final Coordinate _x;
    final Coordinate _y;
    final Coordinate _z;

    public static final Point3D ZERO = new Point3D(0d, 0d, 0d);

    // Constructors
    public Point3D(Coordinate x, Coordinate y, Coordinate z) {
        this(x.coord, y.coord, z.coord);
    }

    public Point3D(double x, double y, double z) {
        _x = new Coordinate(x);
        _y = new Coordinate(y);
        _z = new Coordinate(z);
    }

    // Vector subtraction formula: pt2-pt1 = ((x2-x1), (y2-y1), (z2-z1))
    public Vector subtract(Point3D point3D) {
        if (point3D.equals(this))
            throw new IllegalArgumentException("cannot create Vector to Point(0,0,0)");
        return new Vector((_x.coord - point3D._x.coord), (_y.coord - point3D._y.coord), (_z.coord - point3D._z.coord));
    }

    // Adding a vector to a point
    public Point3D add(Vector vector) {
        double x = _x.coord + vector._head._x.coord;
        double y = _y.coord + vector._head._y.coord;
        double z = _z.coord + vector._head._z.coord;
        Point3D point3D = new Point3D(x, y, z);
        //if (point3D.equals(ZERO))
        //    throw new IllegalArgumentException("cannot create Vector to Point(0,0,0)");
        return point3D;
    }

    // The distance squared formula: d(p1,p2) = (x2 - x1)^2 + (y2 - y1)^2 + (z2 - z1)^2
    public double distanceSquared(Point3D point3D) {
        final double x1 = _x.coord;
        final double y1 = _y.coord;
        final double z1 = _z.coord;
        final double x2 = point3D._x.coord;
        final double y2 = point3D._y.coord;
        final double z2 = point3D._z.coord;
        return ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)) + ((z2 - z1) * (z2 - z1));
    }

    // The distance formula: d(p1,p2) = ((x2 - x1)^2 + (y2 - y1)^2 + (z2 - z1)^2)^(1/2)
    public double distance(Point3D point3D) {
        return Math.sqrt(distanceSquared(point3D));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point3D point3D = (Point3D) o;
        return _x.equals(point3D._x) && _y.equals(point3D._y) && _z.equals(point3D._z);
    }

    public Coordinate getX() {
        return _x;
    }

    public Coordinate getY() {
        return _y;
    }

    public Coordinate getZ() {
        return _z;
    }

    @Override
    public String toString() {
        return "(" + _x + ", " + _y + ", " + _z + ")";
    }
}