//A strong number is a positive integer whose sum of factorials of its digits equals the number itself. In other words, if we take the digits of a number and calculate the factorial of each digit, then sum those factorials, and the result is the same as the original number, then that number is called a strong number
//ex: 145= 1+(4*3*2*1)+(5*4*3*2*1)=145
import java.util.Scanner;

class StrongNo {
     public static int factorial(int a){
        int fact=1;
        for(int i=a;i>=2;i--){
            fact *=i;
        }
       return fact;
     }
     public static int digit(int n){
        int a=0;
        int sum=0;
        while(n>0){
            a=n%10;
            sum+=factorial(a);
            n /=10;
        }
        return sum;
     }
     public static String strong(int n){
      int sum=digit(n);
      if(sum==n){
        return (n+" is Strong number");
      }
      else{
        return (n+" is not Strong number");
      }
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println(strong(n));
    }
}
/*
 * output:
   Enter a number:
   145
   145 is Strong number
 */
