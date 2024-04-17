//A strong number is a positive integer whose sum of factorials of its digits equals the number itself. In other words, if we take the digits of a number and calculate the factorial of each digit, then sum those factorials, and the result is the same as the original number, then that number is called a strong number

import java.util.Scanner;

class DuckNo{
     public static void duck(int n){
        int n1=n;
        while (n>0) {
            int rem=n%10;
            if(rem==0){
                System.out.println(n1+" is duck number");
                break;
            }
            n=n/10;
        }
       
        if(n==0){
            System.out.println(n1+" is not duck number");
        }

     }
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        duck(n);
    }
}
/*output:
Enter a number:
2013
2013 is duck number

 */
