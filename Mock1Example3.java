/*  write  a programm  to take user input  year and check if that year is   leap year or not.
*/

 import java.util.*;
 
 
 class Mock1Example3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year");
        int a=sc.nextInt();

        if(a%4==0){
            System.out.println("leap year");
        }
    
        else{
            System.out.println("not leap year");
        }
       
        
        
    }
}
/*output:
Enter year
2024
leap year

*/
