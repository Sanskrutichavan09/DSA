import java.util.Scanner;

public class pyramid {
    public static void main(strings args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();


        for(int i=1;i<=n;i++){
            for(int k=5;k>i;k++){
                System.out.println("_");
            }
            for(int j=1;j<=i;j++){
                System.out.println("*");
            }
            System.out.println();
        }
        

    }
   
}
