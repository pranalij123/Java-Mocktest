

class Example{
    static int a;
   
        public static void main(String[] args) {
      
      System.out.println(a);
     int a=10;
     Example.a=20;
     System.out.println(a);
     System.out.println(Example.a);

    }
}

/*output
0
10
2
 */
