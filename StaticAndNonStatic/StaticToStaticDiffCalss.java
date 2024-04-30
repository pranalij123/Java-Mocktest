public class StaticToStaticDiffCalss {
    public static void main(String[] args) {
        System.out.println(A.y);//Static to static but in different class we can call it using class name as reference
    }
}

class A{
    static int y=89;
}

/*OUTPUT:
 89
 */
