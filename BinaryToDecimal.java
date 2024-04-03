public class BinaryToDecimal {
    public static void main(String args[]){
    int n=1010110;
    int a=1;
    int num=0;
    while(n>0){
        int rem=n%10;
        num=num+a*rem;
        a=a*2;
        n=n/10;
    }
    System.out.println(num);
}
}

/*output:

86

*/
