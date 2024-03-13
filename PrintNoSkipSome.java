//print number from 20 t0 40 using loop by skipping 25 & 30

public class PrintNoSkipSome {
 
    public static void main(String[] args) {
       int start=20;
       
       while(start<=40){
            start++;
        if(start==25 || start==30){
            continue;
        }
        System.out.println(start);
       
        
       }
    }
}
/*output:
21
22
23
24
26
27
28
29
31
32
33
34
35
36
37
38
39
40
41
*/

