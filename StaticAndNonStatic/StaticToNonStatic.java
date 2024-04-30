public class StaticToNonStatic {
    static int t=23;
    public void display(){
        System.out.println(t);
    }
    public static void main(String[] args) {
        StaticToNonStatic f= new StaticToNonStatic();
        f.display();
    }
}
/*OUTPUT:
23
 */
