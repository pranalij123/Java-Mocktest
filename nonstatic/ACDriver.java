class AC {
    String name;
    double price;
    int maxTemp;
    int minTemp;
    public  void displayAC() {
        System.out.println(name);
        System.out.println(price);
        System.out.println(maxTemp);
        System.out.println(minTemp);
    }
}
public class ACDriver{
    public static void main(String[] args) {
        AC a= new AC();
        a.displayAC();
        a.name="Blue star";
        a.price=10;
        a.maxTemp=37;
        a.minTemp=13;
        a.displayAC();
        AC b=new AC();
        b.displayAC();
    }
}
/*OUTPUT:
null
0.0
0
0
Blue star
10.0
37
13
null
0.0
0
0
 
 */
