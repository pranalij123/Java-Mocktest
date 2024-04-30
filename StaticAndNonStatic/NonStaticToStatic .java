public class NonStaticToStatic {
    int a=20;
    public static void main(String[] args) {
        NonStaticToStatic d=new NonStaticToStatic();
        System.out.println(d.a);
    }
}

/*OUTPUT:
 20
 */
