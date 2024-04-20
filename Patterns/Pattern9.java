

class Pattern9{
    
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(i==j || j==0 || j==4 || i==0 || i==4){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
                
            }
            System.out.println();
        }
    }
}
/*output:
 *  *  *  *  * 
 *  *        *
 *     *     *
 *        *  *
 *  *  *  *  *

 */
