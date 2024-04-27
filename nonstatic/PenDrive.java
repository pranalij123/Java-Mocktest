public class PenDrive {
    public static void main(String[] args) {
     Pen n=new Pen();
     System.out.println(n.brand);
     System.out.println(n.price);
     System.out.println(n.type);
     System.out.println("*******************");
    
     n.brand="Rorito";
     n.price=5;
     n.type="Gell";
     System.out.println(n.brand);
     System.out.println(n.price);
     System.out.println(n.type);
     System.out.println("*******************");
     Pen t=new Pen();
     t.brand="Cell";
     t.price=10;
     t.type="ball";
     System.out.println(t.brand);
     System.out.println(t.price);
     System.out.println(t.type);
     System.out.println("*******************");
    }
}
class Pen{
    String brand;
    double price;
    String type;

}

/*output:
 null
0.0
null
*******************
Rorito
5.0
Gell
*******************
Cell
10.0
ball
*******************
 */
