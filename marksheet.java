import java.util.Scanner;

public class marksheet {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String sub1="AI";
        String sub2="OOP";
        String sub3="DS";
        String sub4="CLOUD";
        String sub5="ML";

        System.out.print("enter student name = ");
        String student_name=sc.nextLine();

        System.out.print("enter student clss name = ");
        String  class_name=sc.nextLine();

        int sub_1=sc.nextInt();
        System.out.println("enter sub 1 mark="+sub_1);

        int sub_2=sc.nextInt();
        System.out.println("enter sub 2 mark="+sub_2);

        int sub_3=sc.nextInt();
        System.out.println("enter sub 3 mark="+sub_3);

        int sub_4=sc.nextInt();
        System.out.println("enter sub 4 mark="+sub_4);

        int sub_5=sc.nextInt();
        System.out.println("enter sub 5 mark="+sub_5);

        

        int totalmark=sub_1 +sub_2 + sub_3 + sub_4 + sub_5;
        float percentage=totalmark/5;


       
       
        System.out.println("total mark is "+totalmark);
        System.out.println("percentage % is = "+percentage);

        







        

        

        

        


    }
    
}
