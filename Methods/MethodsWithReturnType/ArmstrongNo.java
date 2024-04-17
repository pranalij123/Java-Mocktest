//write program to check whether given number is armstrong number or not
//first calculate number of digit ,ex 153 ,no of digit =3
//take power of every digit equal to number of digit,1^3,5^3,3^3
//add result of every digit,1+125+27=153
//if result is equal to original number then it is armstrong no ,153==153

public class ArmstrongNo{
     public static int digits(int num){
        int n=0;
        while(num>0){
            n++;
            num=num/10;
            
        }
        return n;
     }
     public static int powerOfDigit(int powr, int num){
        int result=0;
        while(num>0){
            int power=powr;
            int b=num%10;//1st iteration 3,2nd 5,3rd 1
             int product=1;
            while( power>0){
              product=product*b;
              power--;
            }
            result=result+product;

            num=num/10;
     }
     return result;
    }
    public static void main(String[] args) {
        int num =153;
      
       int power=digits(num);
       int result=powerOfDigit( power,  num);
     
if(result==num){
System.out.println("amstrong number");

}
else{
System.out.println(" not amstrong number");


}
       
}
}
/*output:
amstrong number
*/
