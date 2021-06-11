package geometries;

import org.junit.jupiter.api.Test;
import primitives.Point3D;
import primitives.Ray;
import primitives.Vector;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Testing Cylinder
 *
 * @author Amit
 */
class CylinderTest {

    /**
     * Test method for {@link geometries.Cylinder#getNormal(primitives.Point3D)}
     */
    @Test
    void getNormal() {
        // Test point not on base
        Cylinder cylinder = new Cylinder(1d, new Ray(new Point3D(1, 0, 0), new Vector(0, 1, 0)), 2d);
        Vector temp = cylinder.getNormal(new Point3D(2, 1, 0));
        assertEquals(temp, new Vector(1, 0, 0), "ERROR: the method (for side) is incorrect");

        // Test point on bottom
        temp = cylinder.getNormal(new Point3D(2, 0, 0));
        assertEquals(temp, new Vector(0, 1, 0), "ERROR: the method for bottom base is incorrect");

        // Test point on top
        temp = cylinder.getNormal(new Point3D(2, 2, 0));
        assertEquals(temp, new Vector(0, 1, 0), "ERROR: the method for top base is incorrect");
    }
}