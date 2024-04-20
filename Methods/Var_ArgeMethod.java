
//Var-arg method
class Var_ArgeMethod{
    public static void add(int...a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.println(sum);
    }
    
    public static void main(String[] args) {
      
      add(1);
      add(2,4);
      add(34,56,89);

    }
}

/*output
1
6
179
 */
