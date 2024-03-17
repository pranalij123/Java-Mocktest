/*In number theory, a perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself.*/
//ex 6=1+2+3

public class PerfectNumber{
    public static void main(String[] args) {
        
        int a=6;
        int res=1;
        for(int i=2;i<=a/2;i++){
            if(a%i==0){
            res=res+i;
            }
        }
        if(a==res)
        System.out.println("its a perfect number");
        else{
            System.out.println("it is not perfect number");
        }
}
    
}
/*output:
its a perfect number
*/
