public class NonStaticToStaticDiffCalss {
    public static void main(String[] args) {
        W d=new W();
        d.a=34;
        System.out.println(d.a);
    }
}

class W{
    int a;
}

/*OUTPUT:
 34
 */
