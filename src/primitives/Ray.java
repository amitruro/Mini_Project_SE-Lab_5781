package primitives;

public class Ray {
    final Point3D _p0;
    final Vector _dir;

    /**
     * constructor for Ray
     *
     * @param point3D point of RaY
     * @param vector  vector of RAY
     */
    public Ray(Point3D point3D, Vector vector) {
        _p0 = point3D;
        _dir = vector;
    }

    /**
     * getter
     *
     * @return point of Ray
     */
    public Point3D getP0() {
        return _p0;
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
        return _p0.equals(ray._p0) && _dir.equals(ray._dir);
    }

    public Point3D getPoint(double t1) {
        return _p0.add(_dir.scale(t1));
    }
}