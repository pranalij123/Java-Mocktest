
//write progam to check that given number is tech number or not
//divide number in two equal number,123345-> First number=123,second number=345
//add that two numbers as result  123+345=468
//square that result
//if result==original number then number is tech number

public class TechNo {

    public static void main(String[] args) {
//tech number       
       int n=123345;
int t=n;
int result1=0;
    int count=0;
    while(n>0){
count++;
n=n/10;

}
if(count%2==0){
int div=1;
for(int i=1; i<=count/2;i++){

div=div*10;
}
int f_number=t/div;
int s_number=t%div;
System.out.println(f_number);
System.out.println(s_number);

int result=f_number+s_number;
 result1=result*result;
System.out.println(result1);

if(t==result1){
System.out.println("tech number");
}
else{
System.out.println(" not tech number");
}
}



else{
System.out.println("odd number");

}
}
}
/*output:
123
345
219024
 not tech number
*/




       

