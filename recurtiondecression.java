public class recurtiondecression {
    public static void decretion(int n){
        if(n==1){
            System.out.println(n);
            return  ;
        }
        System.out.print(n+" ");
        decretion(n-1);
       
    }
    public static void main(String args[]){
        int n =5;
       decretion(n);
    }
    
}
 