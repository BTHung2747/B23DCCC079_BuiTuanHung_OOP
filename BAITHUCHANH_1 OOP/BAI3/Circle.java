
public class Circle {
    public class Common {
        public static boolean isPositive(int value) {
            return value > 0;
        }
        
        public static boolean isPositive(double value) {
            return value > 0;
        }
    }
    private double radius;
    private static final double PI = 3.1415926535;
    public Circle(double radius) {
        if (!Common.isPositive(radius)) {
            throw new IllegalArgumentException("Bán kính phải là số dương.");
        }
        else{
            this.radius=radius;
        }
    }
    public double getPerimeter(){
        return 2*PI*radius;
    }
    public double getArea(){
        return PI*radius*radius;
    }
    public static void main(String[] args) {
        Circle circle=new Circle(7);

        System.out.println("Chu vi: " + circle.getPerimeter());
        System.out.println("Diện tích: " + circle.getArea());
    }
}

