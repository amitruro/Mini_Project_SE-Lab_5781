package primitives;

import static primitives.Point3D.ZERO;

public class Vector {
    Point3D _head;

    // Constructors
    public Vector(Coordinate x, Coordinate y, Coordinate z) {
        _head = new Point3D(x, y, z);
        if (_head.equals(ZERO)) {
            throw new IllegalArgumentException("head of vector cannot be Point(0, 0, 0)");
        }
    }

    public Vector(double x, double y, double z) {
        _head = new Point3D(x, y, z);
        if (_head.equals(ZERO)) {
            throw new IllegalArgumentException("head of vector cannot be Point(0, 0, 0)");
        }
    }

    public Vector(Point3D head) {
        this(head._x, head._y, head._z);
    }

    //Getter
    public Point3D getHead() {
        return _head;
    }

    // Adding vectors formula: u⃗ + v⃗ = ⟨u1+v1,u2+v2⟩
    public Vector add(Vector vector) {
        double x = _head._x.coord + vector._head._x.coord;
        double y = _head._y.coord + vector._head._y.coord;
        double z = _head._z.coord + vector._head._z.coord;
        return new Vector(x, y, z);
    }

    // Subtracting Vectors formula: u⃗ − v⃗ = u⃗ + (−v⃗ )=⟨u1-v1,u2-v2⟩
    public Vector subtract(Vector vector) {
        double x = _head._x.coord - vector._head._x.coord;
        double y = _head._y.coord - vector._head._y.coord;
        double z = _head._z.coord - vector._head._z.coord;
        return new Vector(x, y, z);
    }

    // Vector multiplication in scalar formula: a(A + B) = aA + aB
    public Vector scale(double scale) {
        return new Vector(_head._x.coord * scale, _head._y.coord * scale, _head._z.coord * scale);
    }

    // Dot product formula: a · b = ax × bx + ay × by + az * bz
    public double dotProduct(Vector vector) {
        return (_head._x.coord * vector._head._x.coord +
                _head._y.coord * vector._head._y.coord +
                _head._z.coord * vector._head._z.coord);
    }

    // Cross product formula: u⃗ x v⃗ = (y1 * z2 - y2 * z1, z1 * x2 - z2 * x1, x1 * y2 - x2 * y1)
    public Vector crossProduct(Vector vector) {
        double x = _head._y.coord * vector._head._z.coord - vector._head._y.coord * _head._z.coord;
        double y = _head._z.coord * vector._head._x.coord - vector._head._z.coord * _head._x.coord;
        double z = _head._x.coord * vector._head._y.coord - vector._head._x.coord * _head._y.coord;
        return new Vector(x, y, z);
    }

    // Vector length squared formula: ||u⃗||^2 = x^2 + y^2 + z^2
    public double lengthSquared() {
        return _head._x.coord * _head._x.coord + _head._y.coord * _head._y.coord + _head._z.coord * _head._z.coord;
    }

    // Vector length formula: ||u⃗|| = (x^2 + y^2 + z^2)^0.5
    public double length() {
        return Math.sqrt(lengthSquared());
    }

    // Normalize a vector calculate: u = (x/(x^2 + y^2 + Z^2)^(1/2), y/(x^2 + y^2 + z^2)^(1/2), z/(x^2 + y^2 + z^2)^(1/2))
    public Vector normalize() {
        double length = length();
        double x = _head._x.coord / length;
        double y = _head._y.coord / length;
        double z = _head._z.coord / length;
        this._head = new Point3D(x, y, z);
        return this;
    }

    // Normalize a vector calculate: u = (x/(x^2 + y^2 + Z^2)^(1/2), y/(x^2 + y^2 + z^2)^(1/2), z/(x^2 + y^2 + z^2)^(1/2))
    public Vector normalized() {
        double length = length();
        Vector vector1 = new Vector(_head._x.coord / length, _head._y.coord / length, _head._z.coord / length);
        return vector1;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "_head=" + _head +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector vector = (Vector) o;
        return _head.equals(vector._head);
    }
}