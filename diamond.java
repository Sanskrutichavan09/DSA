public class diamond {
    public static void diamond_pattern(int n){
        //outer loop
        for(int i=1 ; i<=n; i++){
            //space
            for(int j=1 ; j<=(n-i); j++){
                System.out.print(" ");
            }
            //star
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i=n; i>=1; i--){
            //space
            for(int j=1 ; j<=(n-i); j++){
                System.out.print(" ");
            }
            //star
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
       
    }
    public static void main(String args[]){
        diamond_pattern(5);
    }
}
