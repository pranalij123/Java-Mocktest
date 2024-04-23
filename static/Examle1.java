class Examle1{
     static int a;
    static {
      add();
    }
    public static void add(){
        System.out.println(23);
    }
    
    public static void main(String args[]){
    System.out.println("from main()");
    }

    static{
        System.out.println("from block 2");
    }
    }
    /*output:
    23
    from block 2
    from main()
     */
