public class BikeDriver {
    public static void main(String[] args) {
        Bike b= new Bike();
        b.name="Hero";
        b.price=60000;
        b.displayBike();
    }
}

class Bike{
    String name;
    double price;
    public void displayBike(){
        String name="honda";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(price);
    }
}
/*output:
 honda
Hero
 */
