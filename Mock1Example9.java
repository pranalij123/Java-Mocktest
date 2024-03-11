/*write a programm to  take user input number and  print sum of all natural number  till  user given number

(note :without using loop).
*/
import java.util.*;
 
 
 class  Mock1Example9.java {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
System.out.println("enter number natural number");
int a=sc.nextInt();
      if(a>0){
int n=(a*(a+1))/2;
System.out.println(n);
      }
    }
}

/*output:
enter number related to month
23
276
*/
