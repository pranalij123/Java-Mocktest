/* 4=1,2,4
   16=1,2,4,8,16
hcf=4
*/


public class HighestCommonFactor{

    public static void main(String[] args) {
        
int n=15;

int n1=20;
int small=n<n1? n:n1;

int i=small;
int hcf=0;
while(i>0)
{
 if(n%i==0 && n1%i==0 ) {
    System.out.println("hcf: "+i);
    break;
 } 
    i--;
}


}
}
/*output:
hcf: 5
*/
