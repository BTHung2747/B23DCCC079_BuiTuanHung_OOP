public class bai4 {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle1(5, 5);
        Shape shape2 = new Circle1(2);

        System.out.println("Chu vi hình chữ nhật: " + rectangle.getPerimeter());
        System.out.println("Diện tích hình chữ nhật: " + rectangle.getArea());

        System.out.println("Chu vi hình tròn: " + shape2.getPerimeter());
        System.out.println("Diện tích hình tròn: " + shape2.getArea());
    }
}
