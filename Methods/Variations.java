

class Variations{
    public static void add(int a,int b){
        System.out.println(a+b);
    }
    public static void add(int a,int b,int c)//change in length
    {
        System.out.println(a+b+c);
    }
    public static void add(int a,boolean b)//change in data types
    {
        System.out.println("a+b");
    }
    public static void add(boolean a,int b)//change in sequance
    {
        System.out.println("a+b");
    }
    public static void main(String[] args) {
      add(2,4);
      add(3,6,7);
      add(4,true);
      add(false,2);
    }
}
/*output
   6
16
a+b
a+b
 */
