import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a = ");
        int a=sc.nextInt();
        System.out.print("enter b = ");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("input addition of a + b = "+ c);
    }
    
}
