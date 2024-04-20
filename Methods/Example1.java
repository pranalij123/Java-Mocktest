

class Example1{
    public static void demo(){
        System.out.println("hii from demo()");
    }
        public static void main(String[] args) {
      demo();//directly called
      Example1.demo();//called with the help of class name as reference
    }
}
/*output
 hii from demo()
hii from demo()
 */
