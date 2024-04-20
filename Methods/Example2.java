class Example2{
    public static void demo(){
    demo1();
    System.out.println("a");
    
    }
    
    public static void main(String args[]){
    System.out.println("Hi from main()");
    demo();//method call stetment
    }
    
    public static void demo1(){
    int a=10;
    System.out.println(a);
    }
    }
    /*output:
     Hi from main()
    10
    a
     */
