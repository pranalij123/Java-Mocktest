

class A {
    static int a;
    static double b;
    static String c;
    
        public static void main(String[] args) {
      
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
      B.test();

    }
}
class B{
    public static void test(){
    System.out.println(A.a); 
    System.out.println(A.b);
     System.out.println(A.c);
}
}
/*output
 0
0.0
null
0
0.0
null
 */
