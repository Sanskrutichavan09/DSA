public class GeekforgeekPATTERN {
    public static void pyramidNumber(int n){
        //outer
        int counter=1;
        for(int i=1;i<=n;i++){
            
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //number
           
            for(int j=1;j<=i;j++){
                System.out.print(counter);
                counter++;

                
                for(int k=3;k<=j;k++){
                    System.out.print(k);
                    
                }
            }
            
                
            
            }
            
            
            System.out.println();
        }
    
    public static void LeftTriangleStar(int n){
        //outer
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
        System.out.println("____________________________________________________________________________");
       
    }
    public static void RightTriangleStar(int n){
        for(int i=1;i<=n;i++){
             for(int j=1;j<=i;j++){
            System.out.print("*");
                
            }
            System.out.println();
        
           
        }
        
        
    }
    public static void main(String args[]){
        int n=5;
       // RightTriangleStar(n);
        //LeftTriangleStar(n);
        pyramidNumber(n);
        

    }
    
}
