/*  write a java programm to  take user input and  print the  count of digits in that number.*/


import java.util.*;
 
 
 class Mock1Example2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int a=sc.nextInt();

        int m=0;
       do{
       int  r=a%10;
       m++;
       a=a/10;
       }while(a>0);
    
        System.out.println("number of digit:"+m);
       
        
        
    }
}
/*output:
Enter number
45677
number of digit:5

*/
