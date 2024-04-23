class Example2{
     static int a;
    static {
        
        main(new String[]{});
    }
    
    
    public static void main(String args[]){
    System.out.println("from main()");
    }

    static{
        System.out.println("from block 2");
    }
    }
    /*output:
    from main()
    from block 2
    from main()
     */
