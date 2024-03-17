/*two numbers whose common factor is 1 only are called co prime numbers */
/*ex 5=1,5
12=1,2,3,4,6
*/

public class CoPrime {
    public static void main(String[] args) {
        
        int a=10;
        int b=11;
        int small=a<b?a:b;
        int count=0;
        for(int i=2;i>0;i++){
            if(a%i==0 && b%i==0){
            count++;
            if(count>0){
                break;
            }
            }
        }
        if(count==0){
            System.out.println("co-prime");
        }
        else{
            System.out.println("not prime");
        }
}
    
}
/*output:
co-prime
*/
