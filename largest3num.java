 import java.util.Scanner;
 public class largest3num {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a : ");
        int a = sc.nextInt();
        System.out.println("enter b : ");
        int b = sc.nextInt();
        System.out.println("enter c : ");
        int c = sc.nextInt();

        if(a>b){
            System.out.println(" a is greatest : "+a);
        }else if (b>c){
            System.out.println(" b is greatest : "+b);
        }else{
            System.out.println(" c is greated"+c);
        }
    }
}
