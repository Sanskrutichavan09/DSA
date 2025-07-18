public class practiceSAKSHI {
    public static void num(int n){
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter);
                counter++;

            }
            System.out.println();
        }
    }
    public static void number(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void star(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
     
        // for(int i=1;i<=4;i++){
        //     System.out.println("*****");
        // }
       // star(4);
       //number(4);
       num(4);
    }
    
    
}
