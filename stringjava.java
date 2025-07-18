import java.util.Scanner;

public class stringjava {
    
    public static void main(String args[]){
       
        String fullname="sanslruti";
        System.out.println(fullname.length());

        //concatenate
        String firstname="chanchu";
        String lastname="chavan";
        String full=firstname + " "+lastname;
        System.out.println(full);

        //scanner input
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the users name = ");
        String name;
        name=sc.next();
        System.out.println(name);

        //charAt
        System.out.println("chatAt of the fullname is = "+fullname.charAt(4));

       //compaarison
       String a="java";
       String b="java";
       boolean abs=a.equals(b);
       System.out.println("eual to the = "+ abs);


       //converting case
       String lowup="chechkuplow";
       String lowercase=lowup.toLowerCase();
       String uppercase=lowup.toUpperCase();

      
      
        







    }

   
    
}
