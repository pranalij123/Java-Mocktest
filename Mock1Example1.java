/* WRITE A Java program to  take input  of a number N  and check if the reverse of N is  same as that of   N
 if yes  print palindrome.

*/

import java.util.*;
 
 
 class Mock1Example1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int a=sc.nextInt();
        int b=a;
        int m=0;
       do{
       int  r=a%10;
       m=m*10+r;
       a=a/10;
       }while(a>0);
       if(b==m){
        System.out.println("palindrom");
       }
        
        
    }
}
/*Output:
Enter number
22222
palindrom
*/
