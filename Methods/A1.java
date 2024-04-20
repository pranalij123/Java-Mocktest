

class A1{
    static int a;
    public static void demo(){
        System.out.println(a);
        a=10;
        System.out.println(A.a);
    }
        public static void main(String[] args) {
      
      demo();
      a=5;
      A.demo();;
    }
}
/*output
 0
10
5
10
 */
