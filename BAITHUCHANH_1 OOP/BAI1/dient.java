/*
 * Bài 1
 */
import java.util.Scanner;

public class dient {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       long width = sc.nextLong(); 
       long height = sc.nextLong();
       long SXY=  width*height;
       long CV=(width+height)*2;
       if(SXY>0){
        System.out.println(".(Diện tích hình cn là)"+ SXY);
        System.err.println("Chu vi hình chữ nhật" + CV);
       }
       else{
        System.out.println(".(Lỗi)");
       }


    }

}