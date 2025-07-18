public class solidRhombus {
    public static void solid(int n){
        //outer
        for(int i=1;i<=5;i++){
            //space
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }System.out.println();
        }
    }
    public static void main(String args[]){
        solid(5);
    }
}
