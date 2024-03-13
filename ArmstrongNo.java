//write program to check whether given number is armstrong number or not
//first calculate number of digit ,ex 153 ,no of digit =3
//take power of every digit equal to number of digit,1^3,5^3,3^3
//add result of every digit,1+125+27=153
//if result is equal to original number then it is armstrong no ,153==153

public class Rst {

    public static void main(String[] args) {
        int num =153;
       int copy1=num;
   int copy2=num;
      int count=0;
      int result=0;
      int rem=0;
      while(num>0){
       rem=num%10;
       count++;//3
       num=num/10;
      }
      while(copy2>0){
      int b=copy2%10;//1st iteration 3,2nd 5,3rd 1
       int product=1;
      int power=count;
      
      while( power>0){
        product=product*b;
        power--;
      }
      result=result+product;

      copy2=copy2/10;
    }
if(result==copy1){
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
