public class NthPrimeNumber {

    public static void main(String[] args) {
        
int n=4;

int count2=1;
if(n==1){
 System.out.println(n+"th prime number:"+2);
}
else{
for(int a=3;true;a++)

{
int count=0;
    for(int i=2;i<a;i++){
        if(a%i==0){
            count++;
        }
    }
    if(count==0){
        count2++;
        if(count2==n){
            System.out.println(n+"th prime number:"+a);
            break;
        }
    }
}
}

}
}
/*output:
4th prime number:7

*/
