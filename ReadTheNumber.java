  import java.io.*;
  import java.util.Scanner;

  
  @SuppressWarnings("unused")
  class ReadTheNumber{
    @SuppressWarnings("resource")
    public static void main(String args[]){
        int num;
        System.out.println("enter the num : ");
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();
        System.out.println("entered number is : "+ num);

    }
}