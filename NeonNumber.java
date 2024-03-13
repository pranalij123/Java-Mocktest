//write a program to check whether given number is neon or not

public class NeonNumber {

    public static void main(String[] args) {
//neon number  
  int num=9;
int square=num*num;//9*9=81
int copy1=num;

int result=0;

while(square>0){
int rem=square%10;//1st iteration rem=1, 2nd iteration rem=8
result=result+rem;//1st iteration result=1,2nd iteration result=1+8=9
square=square/10;
}
System.out.println(result);



if(result==copy1){
System.out.println("neon number");
}
else{
System.out.println(" not neon number");

}
       
}
}
/*output:
9
neon number
*/




       

