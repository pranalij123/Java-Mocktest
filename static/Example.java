
class Example{
     static int a;
    static {
    System.out.println("from block 1");
    }
    
    public static void main(String args[]){
    System.out.println("from main()");
    }

    static{
        System.out.println("from block 2");
    }
    }
    /*output:
     from block 1
     from block 2
     from main()
     */
