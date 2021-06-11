package geometries;

import org.junit.jupiter.api.Test;
import primitives.Point3D;
import primitives.Ray;
import primitives.Vector;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Testing Tube
 *
 * @author Amit
 */
class TubeTest {

    @Test
    void getNormal() {
        Ray ray = new Ray(new Point3D(0, 1, 2), new Vector(1, 1, 1));
        Tube tb = new Tube(2, ray);
        assertEquals(tb.getNormal(new Point3D(3, 2, 3)), new Vector(-1 / 3d, -2 / 3d, -2 / 3d));
    }
}