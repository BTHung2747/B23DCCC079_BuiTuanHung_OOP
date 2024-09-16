public class Rectangle {
    
        private long width;
        private long height;
        public Rectangle(long width, long height) {
            this.width = width;
            this.height = height;
        }
        
        public long getPerimeter() {
            return 2 * (width + height);
        }
        public long getArea() {
            return width * height;
        }

        public static void main(String[] args) {
            Rectangle rect = new Rectangle(4, 10);
            System.out.println("Chu vi hình chữ nhật: " + rect.getPerimeter());
            System.out.println("Diện tích hình chữ nhật: " + rect.getArea());
        }
    }
    
