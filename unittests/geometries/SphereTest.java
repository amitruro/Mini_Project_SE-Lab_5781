package geometries;

import org.junit.jupiter.api.Test;
import primitives.Point3D;
import primitives.Vector;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Testing Sphere
 *
 * @author Amit
 */
class SphereTest {

    @Test
    void getNormal() {
        Sphere sp = new Sphere(new Point3D(0, 0, 0), 1);
        Vector V = sp.getNormal(new Point3D(0, 1, 0));
        assertEquals(V, new Vector(0, 1, 0));
    }
}