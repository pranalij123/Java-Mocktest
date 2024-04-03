/* in binary number if number of 1's are even then that is evil number*/


public class EvilNumber {
    public static void main(String args[]){
    int n=1010110;
    int count=0;
    while(n>0){
        int rem=n%10;
        if(rem==1){
            count++;
        }
        n=n/10;
    }
    if(count%2==0){
        System.out.println("its a evil number");
    }
    else{
        System.out.println("it is not evil number");
    }
}
}

/*output:
its a evil number

*/
