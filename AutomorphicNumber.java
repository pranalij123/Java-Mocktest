/* square which contain squareroot as last digit of that square 
ex. 5*5=25   here 25 contain 5 */

public class AutomorphicNumber {

    public static void main(String[] args) {
        
int n=25;

int n1=n;
int p=n*n;

int c=0;
while(n>0){
    int rem=n%10;
    c++;
    n=n/10;
}
int div=1;
while(c>0){
 div=div*10;   
    c--;
}
int result=p%div;
if(result==n1){
    System.out.println("Automorphic number");
}
else{
    System.out.println("not Automorphic number");
}

}
}
/*output:
Automorphic number
*/
