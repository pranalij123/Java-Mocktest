public class NonStaticToNonStatic {
    int a;
    public void display(){
        a=34;
        System.out.println(a);
    }

    public static void main(String[] args) {
        NonStaticToNonStatic s=new NonStaticToNonStatic();
        s.display();
    }
}

/*OUTPUT:
 34
 */
