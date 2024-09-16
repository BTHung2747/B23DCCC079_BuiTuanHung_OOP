//bai3
public class Common {
    // Phương thức tĩnh kiểm tra giá trị là số nguyên dương
    public static boolean isPositive(int value) {
        return value > 0;
    }
}
public class Circle {
    private int radius;

    // Constructor
    public Circle(int radius) {
        if (Common.isPositive(radius)) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Radius phải là số nguyên dương.");
        }
    }

    // Getter cho radius
    public int getRadius() {
        return radius;
    }

    // Setter cho radius với kiểm tra
    public void setRadius(int radius) {
        if (Common.isPositive(radius)) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Radius phải là số nguyên dương.");
        }
    }

    // Phương thức tính chu vi
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Phương thức tính diện tích
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        // Tạo đối tượng Circle
        Circle circle = new Circle(5);

        // In chu vi và diện tích
        System.out.println("Chu vi hình tròn: " + circle.getPerimeter());
        System.out.println("Diện tích hình tròn: " + circle.getArea());
    }
}
public class Rectangle {
    private int width;
    private int height;

    // Constructor
    public Rectangle(int width, int height) {
        if (Common.isPositive(width) && Common.isPositive(height)) {
            this.width = width;
            this.height = height;
        } else {
            throw new IllegalArgumentException("Width và height phải là các số nguyên dương.");
        }
    }

    // Getter và Setter cho width
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (Common.isPositive(width)) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("Width phải là số nguyên dương.");
        }
    }

    // Getter và Setter cho height
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (Common.isPositive(height)) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("Height phải là số nguyên dương.");
        }
    }

    // Phương thức tính chu vi
    public int getPerimeter() {
        return 2 * (width + height);
    }

    // Phương thức tính diện tích
    public int getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        // Tạo đối tượng Rectangle
        Rectangle rectangle = new Rectangle(4, 6);

        // In chu vi và diện tích
        System.out.println("Chu vi hình chữ nhật: " + rectangle.getPerimeter());
        System.out.println("Diện tích hình chữ nhật: " + rectangle.getArea());
    }
}
javac Common.java Circle.java Rectangle.java
java Circle
java Rectangle
