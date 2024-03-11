/* write  a program  to take temprature input from user and check if that is suitable for making house or not if house making criteria is
      condition 1: temprature shuld me more than 25
                2: temprature shuld   me multiple of 5 and 7
                 */
 import java.util.*;
 
 
 class Mock1Example6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temperature");
        double a=sc.nextDouble();
        if(a>25 && a%5==0 && a%7==0){
            System.out.println("Yes it is sutaible");
        }
        else{
            System.out.println("not sutaible");
        }
       
        
        
    }
}

/*output:
Enter temperature
34
not sutaible

*/
