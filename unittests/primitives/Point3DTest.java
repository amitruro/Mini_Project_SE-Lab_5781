package primitives;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point3DTest {
    Point3D pt1 = new Point3D(7d, 1.999999999999999999d, 4d);
    Point3D pt2 = new Point3D(0d, 2d, 4d);

    @Test
    void testEquals() {
        assertEquals(pt1, pt2);
        System.out.println(pt1);
        System.out.println(pt2);
    }

    @Test
    void testToString() {
        System.out.println(pt1.toString());
        System.out.println(pt1);
    }

    @Test
    void distanceSquared() {
        double result = pt1.distanceSquared(pt2);
        assertEquals(23, result, 20);
        System.out.println(result);
    }

    @Test
    void distance() {
        assertEquals(pt1.distance(pt2), (pt1.distanceSquared(pt2))); // distanceSquared = (distance)^2
    }
}