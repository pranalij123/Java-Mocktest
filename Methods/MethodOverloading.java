

class MethodOverloading{
    public static void add(int a){
    System.out.println(a);
    }
    public static void add(float a){
        System.out.println(--a);
    }
    public static void add(int a,double b){
        System.out.println(a+b);
    }
    public static void add(double a,int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
       add(19); 
       add(12.23f);
       add(12,24.23);
       add(12.24,34);
    }
}
/*output
   19
11.23
36.230000000000004
46.24

 */
