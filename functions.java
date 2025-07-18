import java.util.Scanner;

public class functions {
    
    public static void main(String args[]){
        hello();
        calulate();

    }

    public static void hello(){
        System.out.println("hello world");
    }

    public static void calulate(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("sum is:" + sum);
    }
}
