

class Method{
   public static void demo(){
    System.out.println("hi from demo()");
   }
   public static void demo(int a){
    System.out.println("hi from demo1(int a)");
   }
   public static void demo(double e){
    System.out.println("hii from (double a)");
   }
    public static void main(String[] args) {
      demo();
      demo(2);
      demo(23.23);
    }
}
/*output
   hi from demo()
hi from demo1(int a)
hii from (double a)
 */
