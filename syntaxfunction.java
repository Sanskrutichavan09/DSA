import java.util.Scanner;

public class syntaxfunction {
    public static void main(String args[]){
        //System.out.println(sum(a,b)); 
        
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sum(a,b);
       // System.out.println("add is" + add);

        

    }

    public static void sum(int a,int b){
        System.out.println(a+b);
        
         
        //System.out.println("add is" + add);
       

    }
}
