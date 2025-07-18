import java.util.Scanner;

public class leapyear {
    public static void main(String args[]){
        //useing scanner of leap year
        System.out.println("enter your number");
        int year;
        Scanner sc=new Scanner(System.in);
         year=sc.nextInt();

         if((year%4==0) || (year%400==0)&&(year%100==0)){
            System.out.println(" this is the leap year ="+year);
         }else{
            System.out.println("non leap year =" +year);
         }
        


    }
   
    public static boolean isleap(int year){
        //withot scaneer
        boolean isleap=false;

        if(year%4==0){
            isleap=true;
            
        }
        if(year%100==0){
            if(year%400==0){
                isleap=true;
            }else{
                isleap=false;
            }
        }
        return isleap;

    }

    
}
