import java.util.Scanner;

public class snt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        for (int i = 0; i < t; i++) {
            long N = sc.nextLong();
            if (isPrime(N)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }

    // Function to check if a number is prime
    public static boolean isPrime(long N) {
        if (N < 2) {
            return false;
        }
        for (long k = 2; k * k <= N; k++) {
            if (N % k == 0) {
                return false; // Not a prime number
            }
        }
        return true; // Prime number
    }
}
