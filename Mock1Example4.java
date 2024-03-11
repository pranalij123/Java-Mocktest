/*  write a  programm to take a number from user and  check if the sum of digits of that number  can devide  the user input  number or not   (print divisible if  divisible   if not print  can not devide).*/

 import java.util.*;
 
 
 class Mock1Example4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int a=sc.nextInt();
       int b=a;
       int m=0;
    do{
       int  r=a%10;
        m=m+r;
        a=a/10;
    }while(a>0);
    if(b%m==0){
        System.out.println("yes it is divisible");
    }
    else{
        System.out.println("not divisible");
    }
       
        
        
    }
}

/*output:
Enter number
5678
not divisible


*/
