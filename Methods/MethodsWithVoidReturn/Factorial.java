//write programm to print factorial of given number
import java.util.Scanner;
class Factorial{
    public static void fact(int n){
        int factorial=1;
        for(int i=n;i>=2;i--){
            factorial=factorial*i;
        }
        System.out.println("Factorial of "+n+" is :"+factorial);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        fact(n);
    }
}
/*output:
 Enter a number:
3
Factorial of 3 is :6
 */
