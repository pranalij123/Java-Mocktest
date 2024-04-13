import java.util.Scanner;
public class CurrencyConvertor{
    public static void usDoller(float a){
        double r=a/83.61;
        float r1=(float) r;
        System.out.println(a+"Rs means "+r1+" $");
    }
    public static void euro(float a){
        double r=a/89.23;
        float r1=(float) r;
        System.out.println(a+"Rs means "+r1+" euro");
    }
    public static void austrilianDoller(float a){
        double r=a/54.25;
        float r1=(float) r;
        System.out.println(a+"Rs means "+r1+" AU$");
    }
    public static void kuwaitiDinar(float a){
        double kwd=a/270.69;
        float r1=(float) kwd;
        System.out.println(a+"Rs means "+r1+" KWD");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value in Rupees");
        float a=sc.nextFloat();
        System.out.println("In which currency do you want to convert it?");
        
        System.out.println("1.Us Doller");
        System.out.println("2.Euro");
        System.out.println("3.Austrilian Doller");
        System.out.println("4.Kuwaiti Dinar");
        System.out.println("enter your choice");
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
            usDoller(a);
                break;
            case 2:
            euro( a);
                break;    
            case 3:
            austrilianDoller(a);
                break;
            case 4:kuwaitiDinar( a);
                
                break;
            default:
                System.out.println("entered choice is invalid");
        }
    }
}
/*output:
nter the value in Rupees
200
In which currency do you want to convert it?
1.Us Doller
2.Euro
3.Austrilian Doller
4.Kuwaiti Dinar
enter your choice
1
200.0Rs means 2.3920584 $

*/
