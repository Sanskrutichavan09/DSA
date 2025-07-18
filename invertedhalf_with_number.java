public class invertedhalf_with_number {
    public static void main(String args[])
    {
        invertedhalf(5);

    }
    public static void invertedhalf(int n){
        //outer loop
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
