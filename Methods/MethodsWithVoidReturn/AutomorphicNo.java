/* square which contain squareroot as last digit of that square 
ex. 5*5=25   here 25 contain 5 */
import java.util.Scanner;

class AutomorphicNo{
     public static void automorphic(int n){
        int square=n*n;
        int copy=n;
        int no=0;
        int count=0;
        while (n>0) {
            count++;
            n/=10;
        }
        int c=count;
        while (count>0) {
            int rem=square%10;
            no=no*10+rem;
            count--;
        }
        int no1=0;
        while(c>0){
            int rem=no%10;
            no1=no1*10+rem;
            c--;
        }
        if(copy==no1){
            System.out.println(copy+" is automorphic no");
        }
        else{
            System.out.println(copy+" is not automorphic no");
        }

     }
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
         automorphic(n);
    }
}
/*output:
 Enter a number:
5
5 is automorphic no
 */
