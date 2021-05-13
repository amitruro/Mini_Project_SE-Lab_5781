package primitives;

public class Ray {
    final Point3D p0;
    final Vector _dir;

    /**
     * constructor for Ray
     *
     * @param point3D point of RaY
     * @param vector  vector of RAY
     */
    public Ray(Point3D point3D, Vector vector) {
        p0 = point3D;
        _dir = vector.normalized();
    }

    /**
     * getter
     *
     * @return point of Ray
     */
    public Point3D getP0() {
        return p0;
    }

    /**
     * getter
     *
     * @return vector of Ray
     */
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