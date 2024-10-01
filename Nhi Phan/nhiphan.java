
import java.util.Scanner;


public class nhiphan {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        String nhi_phan="";
        while (n>0){
            nhi_phan=(n%2)+ nhi_phan ;
            n= n/2;


        }
        System.out.println("hệ nhi phân là:" + nhi_phan);
        }
    }

