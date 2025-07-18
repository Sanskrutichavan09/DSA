public class incresingRecursion {
    public static void incresing(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        incresing(n-1);
       System.out.print(n+" ");
    }
    public static void main(String args[]){
        int n=10;
        incresing(n);
    }
    
}
