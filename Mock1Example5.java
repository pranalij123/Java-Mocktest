/* write a java programm to print  all even multiple of 3 and 5 within ranged of 200.*/
 import java.util.*;
 
 
 class Mock1Example5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0;
       do{
        
        if(a%2==0)
        {
            if(a%3==0 && a%5==0){
                System.out.println(a);
            }
        }
        a++;
       }while(a<=200);
       
        
        
    }
}
/*output:
0
30
60
90
120
150
180

*/
