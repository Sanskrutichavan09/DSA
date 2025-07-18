public class hallow_rhombus {
    public static void hallow(int n){
        //outer loop
        for(int i=1;i<=n;i++)
        {
            //space
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=n;j++){
                //System.out.print("*");
                if(i==1||i==n || j==1||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
              
            }
            System.out.println();
        
        }
    }
    public static void main(String args[])
    {
        hallow(5);
    }
    
}
