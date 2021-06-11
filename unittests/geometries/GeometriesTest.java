package geometries;

import org.junit.jupiter.api.Test;
import primitives.Point3D;
import primitives.Ray;
import primitives.Vector;

import static org.junit.jupiter.api.Assertions.*;

class GeometriesTest {

    @Test
    void findIntersections() {
        Geometries geos = new Geometries();
        geos.add(new Sphere(4, new Point3D(3, 3, 3)));
        assertNull(geos.findIntersections(new Ray(new Point3D(5, 6, 6), new Vector(3, 7, 3))));
    }
}