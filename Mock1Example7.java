/* write a java programm to check if the user given number is divisible by 5  or 7 if divisble by 5 check  if the sum of digits of given number is  also divible or not.
 if number is divisible by 7 b then  print the alternate digit of  given  number.*/

 import java.util.*;
 
 
 class Mock1Example7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temperature");
        int a=sc.nextInt();
        int b=a;
        
            if(a%5==0){
                int m=0;
                
                do{
               int r=a%10;
               m=m+r;
              a= a/10;
                }while(a>0);
                if(b%m==0){
                    System.out.println("yes it is divisible");
                }
                else{
                    System.out.println("number is not divisible by sum of digit");
                }
            }
            if(a%7==0){

                do{
                    int y=b%10;
                    System.out.println(y);
                    b=b/10;
                    b=b/10;

                }while(b>0);
        }
        else{
            System.out.println("number is not divisible by 5 or ");
        }
       
        
        
    }
}
/*output:

output:
Enter number
35
number is not divisible by sum of digit
5
*/
