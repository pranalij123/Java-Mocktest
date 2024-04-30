
public class StaticToStatic {
    static int a=28;
   public static void main(String args[]){
    System.out.println(a);//static to static we can call directly
    System.out.println(StaticToStatic.a);//we can call it using class name as reference
   }
}

/*OUTPUT:
 28
 28
 */
