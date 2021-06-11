package geometries;

import primitives.Point3D;
import primitives.Ray;

import javax.swing.*;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Geometries implements Intersectable {
    private List<Intersectable> _intersectables = new LinkedList<>();

    public Geometries(Intersectable... intersectables) {
        add(intersectables);
    }

    public void add(Intersectable... list) {
        Collections.addAll(_intersectables, list);
    }

    /*public void remove(Intersectable... intersectables) {
        //todo
    }*/

    @Override
    public List<Point3D> findIntersections(Ray ray) {
        List<Point3D> result = null;

        //TODO
        for (Intersectable geo : _intersectables) {
            List<Point3D> geoPoints = geo.findIntersections(ray);
            if (geoPoints != null) {
                if (result == null) {
                    result = new LinkedList<>();
                }
                result.addAll(geoPoints);
            }
        }
        return result;
    }
}