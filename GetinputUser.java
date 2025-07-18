import java.util.Scanner;

public class GetinputUser {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);

       System.out.println(" enter int");
       int a = sc.nextInt();
       System.out .println(" integer number is "+ a);

       System.out.println(" enter string");
       String aa = sc.nextLine();
       System.out.println(" strig num is :"+ aa);


       System.out.println("enter float");
       float b = sc.nextFloat();
       System.out.println(" float num is "+ b);
    }
}
