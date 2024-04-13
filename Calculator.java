import java.util.Scanner;
class Calculator{
public static void add(int a, int b){

int c=a+b;
System.out.println(c);
}

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter first number");
int a=sc.nextInt();
System.out.println("enter second number");
int b=sc.nextInt();
System.out.println("1.addition ");
System.out.println("2.Substraction");

System.out.println("3.Multiplication ");

System.out.println("4.Division");
System.out.println("enter your choice:");
int n=sc.nextInt();
switch(n){
case 1:
     System.out.println("addition ");
     add(a,b);
     break;
case 2:
     System.out.println("Substraction ");
     sub(a,b);
     break;
case 3:
     System.out.println("multiplication ");
     mul(a,b);
     break;
case 4:
     System.out.println("division ");  
      divide(a,b);
      break;
default:
       System.out.println("Entered choice is invalid");
}
}

public static void sub(int a,int b){
int c=a-b;
System.out.println(c);
}
public static void mul(int a,int b){
int c=a*b;
System.out.println(c);
}

public static void divide(int a,int b){
int c=a/b;
System.out.println(c);
}

}

/*output:
enter first number
2
enter second number
1
1.addition
2.Substraction
3.Multiplication
4.Division
enter your choice:
1
addition
3

*/
