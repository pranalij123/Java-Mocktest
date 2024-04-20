

class VariableValue{
    static int a;
    public static void demo(){
        a=10;
        System.out.println(a);
    }
        public static void main(String[] args) {
      System.out.println(a);
      demo();
      System.out.println(a);
    }
}
/*output
 0
10
10

 */
