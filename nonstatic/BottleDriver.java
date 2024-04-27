public class BottleDriver {
    public static void main(String[] args) {
        Bottle m=new Bottle();
    m.displayBottle();
    }
    
}
class Bottle{
    String brand="G-Pet";
    double capacity;
    String color;
    {
        capacity =1000;
        color="orange";
        System.out.println("non static block executed");
    }

    public void displayBottle(){
        System.out.println(brand);
        System.out.println(capacity);
        System.out.println(color);
    }
}

/*output:
 non static block executed
G-Pet
1000.0
orange
 */
