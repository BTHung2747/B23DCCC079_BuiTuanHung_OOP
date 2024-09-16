/*
 * Bài 1
 */
public class dient {
    public static void main(String[] args) {
	    if (args.length < 2) {
	      System.out.println("Vui lòng nhập hai giá trị a và b từ tham số dòng lệnh.");
	      return;
	    }

	    if (args.length > 2) {
	      System.out.println("Vui lòng chỉ nhập hai giá trị a và b.");
	      return;
	    }

	    try {
	      int a = Integer.parseInt(args[0]);
	      int b = Integer.parseInt(args[1]);

	      if (a > 0 && b > 0) {
	        int cv = (a + b) * 2;
	        int dt = a*b;
	        System.out.println("Chu vi là: " + cv);
	        System.out.println("Diện tích là:"+dt);
	      } else {
	        System.out.println("Giá trị a và b phải là số dương.");
	      }
	    } catch (NumberFormatException e) {
	      System.out.println("Vui lòng nhập số hợp lệ cho a và b.");
	    }
	  }
}
