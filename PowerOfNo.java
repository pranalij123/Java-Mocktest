//write code to print power of number

public class PowerOfNo {

    public static void main(String[] args) {
        int base=3;
       int product=1;
      int power=2;
      while(power>0){
        product=product*base;
        power--;
      }
       
      System.out.println(product);
    
}
}
/*output:
9
*/
