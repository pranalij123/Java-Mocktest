//A number is a perfect square or a square number if its square root is an integer, which means it is an integer's product with itself
//4=2*2

public class PerfectSquare {
    public static void main(String[] args) {
        
        int n = 17;
        int i=1;
        int r = 0;
        
        for (int y = r; y< n; y++) {
            r = i * i;
            if (r == n) {
                System.out.println("It's a perfect square");
                break;
            } else if (r > n) {
                System.out.println("It's not a perfect square");
                break;
            }
i++;
            
        }
    }
}
/*output:
It's not a perfect square
*/
