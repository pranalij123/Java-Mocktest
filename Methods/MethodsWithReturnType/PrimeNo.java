import java.util.Scanner;

class PrimeNo{

    public static String prime(int n) {
        int count = 0;
        if (n == 2) {
            return (n + " is prime number");
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 0) {
                return (n + " is prime number");
            } else {
                return (n + " is not  prime number");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println(prime(n));
    }
}
/*
 * output:
 *Enter a number:
  4
 4 is not  prime number
 */
