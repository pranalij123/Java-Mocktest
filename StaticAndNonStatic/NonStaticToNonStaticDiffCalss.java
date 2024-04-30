public class NonStaticToNonStaticDiffCalss {
    public void display(){
        V d=new V();
        System.out.println(d.y);
    }

    public static void main(String[] args) {
        NonStaticToNonStaticDiffCalss s= new NonStaticToNonStaticDiffCalss();
        s.display();
    }
}

class V{
    int y;
}

/*OUTPUT:
  0
 */
