/*Duck number is number which contain atlist one 0 */
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
