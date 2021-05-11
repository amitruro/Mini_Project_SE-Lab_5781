package primitives;

public class Ray {
    final Point3D p0;
    final Vector _dir;

    // Constructor
    public Ray(Point3D point3D, Vector vector) {
        p0 = point3D;
        _dir = vector.normalized();
    }

    public Point3D getP0() {
        return p0;
    }

    public Vector get_dir() {
        return _dir;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ray ray = (Ray) o;
        return p0.equals(ray.p0) && _dir.equals(ray._dir);
    }
}