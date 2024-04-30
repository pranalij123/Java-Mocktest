public class StaticToNonStaticDiffCalss {
    static int y=9;
    public static void main(String[] args) {
        H m=new H();
        m.display();
    }
}

class H{
    public void display(){
     
      System.out.println(StaticToNonStaticDiffCalss.y);  
    }
}

/*OUTPUT:
 9
 */
