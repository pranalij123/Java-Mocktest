import java.util.Scanner;
public class AreaOfShape{
    public static void circle(double r){
        double result=3.14*r*r;
        System.out.println("Area of circle is "+result);
    }
    public static void square(float l){
        float result=l*l;
        System.out.println("Area of square is "+result);
    }
    public static void rectangle(float len,float w ){
            float result=len*w;
            System.out.println("Area of rectanle is "+ result);
    }
    public static void cylinder(double r1 ,double h1){
        double result=(2*3.14*r1*h1)+(2*3.14*r1*r1);
            System.out.println("Area of cylinder is "+result);
    }
    public static void traingle(double b,double height){
            double result =0.50 *b*height;
            System.out.println("Area of traingle is "+result);
    }
    public static void cone(double redi,double h){
         double b=(redi*redi)+(h*h);
         double re=0;
         double i=0;
         for(;i<b;i++){
            re=i*i;
            if(re==b){
                break;
            }
         }
            double result1= (3.14*redi);
            double result2=(redi+i);
            double result=result1*result2;
            System.out.println("area of cone is "+result);
    }
    
    public static void sphere(double redius){
            double result= 4*3.14*redius*redius;
            System.out.println("Area of sphere is "+result);
    }
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Find  Area");
       System.out.println("1.Circle");
       System.out.println("2.square");
       System.out.println("3.rectangle");
       System.out.println("4.cylinder");
       System.out.println("5.traingle");
       System.out.println("6.cone");
       System.out.println("7.sphere");
       System.out.println("Enter your choice:");
       int choice=sc.nextInt();
       switch(choice){
        case 1:
        System.out.println("enter radius of circle");
        double r= sc.nextDouble();
        circle(r);
        break;

        case 2:
        System.out.println("enter side of square");
        float l= sc.nextFloat();
        square(l);
        break;

        case 3:
        System.out.println("enter lenght and width  of square respectively");
        float len= sc.nextFloat();
        float w= sc.nextFloat();
        rectangle(len, w);
        break;

        case 4:
        System.out.println("enter radius and heoght  of cylinder respectively");
        double r1= sc.nextFloat();
        double h1= sc.nextFloat();
        cylinder(r1,h1);;
        break;

        case 5:
        System.out.println("enter base and height of traingle ");
        double b= sc.nextFloat();
        double height= sc.nextFloat();
        traingle(b, height);
        break;

        case 6:
        System.out.println("enter redius and hight  of cone respectively");
        double redi= sc.nextFloat();
        double h= sc.nextFloat();
        cone(redi, h);
        break;

        case 7:
        System.out.println("enter radius of sphere");
        double redius= sc.nextFloat();
        sphere(redius);
        break;
     default:System.out.println("entered choice is invalid");

       }
   
}

}

/*output:Find  Area
1.Circle
2.square
3.rectangle
4.cylinder
5.traingle
6.cone
7.sphere
Enter your choice:
1
enter radius of circle
2
Area of circle is 12.56


*/
