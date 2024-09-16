import java.util.ArrayList;
import java.util.List;

public class bai5 {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle1(5, 3));
        shapes.add(new Circle1(2));
        shapes.add(new Rectangle1(4, 6));

        double totalArea = 0;
        double totalPerimeter = 0;

        for (Shape shape : shapes) {
            totalArea += shape.getArea();
            totalPerimeter += shape.getPerimeter();
        }

        System.out.println("Tổng diện tích: " + totalArea);
        System.out.println("Tổng chu vi: " + totalPerimeter);
    }
}