public class hollowrectangle{
    public static void main(String args[]){
        hollow(4, 5);

    }
    public static void hollow(int tolrows,int tolcols){
        //outer loop
        for(int i=1;i<=tolrows;i++)
        {
            //inner loop
            for(int j=1;j<=tolcols;j++){
                if(i==1 || i==tolrows || j==1 || j==tolcols){
                    System.out.print("*");}
                else{
                    System.out.print(" ");
                 }   
                 
                }System.out.println();
            }
        }
    }
