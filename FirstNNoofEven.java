 
 //write programm to print first 10 even numbers
 
 class FirstNNoofEven {
    public static void main(String[] args) {
       int num=0;
       int count=0;
       while(true){
        if(num%2==0){
            System.out.println(num);
            count++;
        }
        num++;
        if(count==10){
            break;
        }
       }
    }
}
/*output:
0
2
4
6
8
10
12
14
16
18

*/
