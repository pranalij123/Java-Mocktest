public class DecimalToBinary{
    public static void main(String args[]){
    int n=9;
    int num=0;
    int a=1;
    while(n>0){
        int rem=n%2;
        num=num+a*rem;
        a=a*10;
        n=n/2;
    }
    System.out.println(num);
}
}

/*output:
1001
*/
