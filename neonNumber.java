public class neonNumber {
    public static void main(String args[]){
        int n=9;
        System.out.println(neon(n));
    }
   public static boolean neon(int n){
    int squre=n*n;
    int sum=0;
    while(squre>0){
        int r=squre%10;
        sum +=r;
        squre=squre/10;
    }
   }
}
