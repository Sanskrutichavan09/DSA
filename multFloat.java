import java.io.*;
import java.util.Scanner;

import javax.xml.validation.SchemaFactoryLoader;

public class multFloat {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter 1st num");
       
        float a = sc.nextFloat();
        System.out.println("1st num is : "+ a);

        System.out.println("enter secound num");
       
        float b = sc.nextFloat();
        System.out.println("2nd num is :"+b);

        float mul = a * b ;
        System.out.println("multiple is =" + mul);
        




    }
    
}
