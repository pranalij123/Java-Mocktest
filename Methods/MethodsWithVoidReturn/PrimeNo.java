import java.util.Scanner;

class PrimeNo{

    public static void prime(int n) {
        int count = 0;
        if (n == 2) {
            System.out.println(n + " is prime number");
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(n + " is prime number");
            } else {
                System.out.println(n + " is not  prime number");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        prime(n);
    }
}
/*
 * output:
 * Enter a number:
 * 3  is prime number
 
 */
