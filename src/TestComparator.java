import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import java.util.Comparator;

public class TestComparator {
    public static void main(String[] args) {
        GeometricObject g1 = new GeometricObject(5, 5) {
            @Override
            public double getArea() {
                return 0;
            }

            @Override
            public double getPerimeter() {
                return 0;
            }
        };
        GeometricObject g2 = new GeometricObject(5) {
            @Override
            public double getArea() {
                return 0;
            }

            @Override
            public double getPerimeter() {
                return 0;
            }
        };

        GeometricObject g = max(g1, g2, new GeometricObjectComparator());

        System.out.println("The area of the larger object is " + g.getArea());
    }

    public static GeometricObject max(GeometricObject g1, GeometricObject g2, Comparator<GeometricObject> c) {
        if (c.compare(g1, g2) > 0)
            return g1;
        else
            return g2;
    }
}