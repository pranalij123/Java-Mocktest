
/*  take a number ,reverse it, add reverse and original number ,if addition is not palindrom number the number is lychrel number otherwise it is not lychrel
ex. 33,rev=33,add=33+33=66, 66 is palindrom hence it is not lychrel number
19,rev=91,add=19+91=110,110 is not palinf=drom hense 19 is lychrel number
*/

public class LychrelNumber{
    public static void main(String[] args) {
   int n=33;
   int copy=n;
   int rev=0;
   while(n>0){
    int r=n%10;
    rev=rev*10+r;
    n=n/10;
   }
   int res=copy+rev;
   int m=res;
   int rev1=0;
   while(res>0){
    int rem=res%10;
 rev1=rev1*10+rem;
res=res/10;
   }
   if(rev1==m){
    System.out.println("this is not lychrel number");
   }
   else{
    System.out.println("this is lychrel number");
   }

    }}
/*output:

this is not lychrel number
*/
