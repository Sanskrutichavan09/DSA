import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class functionquestionpaper {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        double num1=sc.nextDouble();
        System.out.println("enter second number");
        double num2=sc.nextDouble();
        System.out.println("enter thried number");
        double num3=sc.nextDouble();

        System.out.println("the average is"+avg(num1,num2,num3));


    }

    public static double avg(double a,double b,double c){
        return (a+b+c/3);

        
    }
}
