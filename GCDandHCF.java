import java.io.*;
import java.util.Scanner;


public class GCDandHCF {
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int g = 0;
        for(int i = 1 ; i<=a ; i++){
            if(a%i==0 && b%i==0){
                System.out.println(i);
                g=i;
            }
            

        }
        System.out.println("GCF is : "+g);
    }
   
    
}
