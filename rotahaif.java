public class rotahaif {
    public static void main(String args[]){
        haifparamid(4);


    }
    public static void haifparamid(int n){
        //outer loop
        for(int i=1;i<=n;i++)
        {   //space
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
       
        
    }

}
