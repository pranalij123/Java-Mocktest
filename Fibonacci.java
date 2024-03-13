//write a progamm to print fibonacci serise
//ex 0 1 1 2 3 5 8 12...
//addition of previous two numbers will be next number

public class Rst {

    public static void main(String[] args) {      
int a=7;//number of fibonacci numbers

int sum=0;
int i=0;
int j=1;
System.out.print(i+" ");
System.out.print(j+" ");
for(int p=1;p<=a;p++){
   sum=i+j;
if(sum<10){
   System.out.print(sum+" ");
}
   i=j;
   j=sum;

}

}
}



/*output:
0 1 1 2 3 5 8
*/

       

