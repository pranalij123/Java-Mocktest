//A number is called a sunny number if the number next to the given number is a perfect square
public class SunnyNumber {
    public static void main(String[] args) {
        
        int n=80;
        
        int r=0;
        int i=0;
       for(;i<n;i++){
        r=i*i;
        int w=r-1;
        if(w==n){
            System.out.println("Its sunny number");
            break;
        }
       }
      if(i==n)
      {
System.out.println("It is not sunny number");
      }

        }
}
    

/*output:
Its sunny number
*/
