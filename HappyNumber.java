public class HappyNumber {
    public static void main(String[] args) {
        
        int n=100;
        
        
        if(n>9){
            while(true){
                int sum=0;
                while(n>0){
                    int rem=n%10;
                    sum=sum+(rem*rem);
                    n=n/10;
                }
                
                if(sum<10){
                    if(sum==1){
                        System.out.println("happy number");
                        break;
                    }
                    else{
                        System.out.println("not happy number");
                        break;
                    }
                }
                else{
                    n=sum;
                }
            }
        }
        else{
            if(n==1){
                System.out.println("happy number");
            }
            else{
                System.out.println("not happy number");
            }
        }
    }
}
/*output:
happy number

*/
