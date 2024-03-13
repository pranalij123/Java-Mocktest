//write a programm to print factorial of all numbers in given range

public class Rst {

    public static void main(String[] args) {
        int num = 2;
while(num<=9){
int copy1=num;
int fac=1;
        while (copy1> 0) {
             fac=copy1*fac;

            copy1--;

        }
System.out.println(fac);
num++;
    }
}
}
/*output:
2
6
24
120
720
5040
40320
362880

*/
