import java.util.Scanner;

public class repeat1 {
    public static void main(System args[]){
    sum(a, b);
       
    }

    public static int sum(int a,int b){
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        int add=a+b;
        System.out.println("add is" +add);
        return add;
    }
}
