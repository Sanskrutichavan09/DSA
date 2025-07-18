import java.util.Scanner;

public class userinheritance {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the brand name = ");
        String brand = sc.nextLine();
        System.out.println("enter the year = ");
        int year = sc.nextInt();
        System.out.println("enter the passenger_seat = ");
        int passenger_seat = sc.nextInt();
        a mycar=new a(brand,year,passenger_seat);
        System.out.println("enter your choice ");
         int choice=sc.nextInt();
        

        switch(choice){
            case 1:mycar.Break();
             break;


            case 2:mycar.Accelator();
             break;


            
            case 3:mycar.gare();
             break;

            default:
            System.out.println("your choice is invalid");
            

        }
        
        
    }
    
}
 class a{
    private String brand;
    private int year;
    private int passenger_seat;

        //constract 
        public a(String brand,int year,int passenger_seat){
            this.brand=brand;
            this.year=year;
            this.passenger_seat=passenger_seat;
        }

        //getter method 
        public String getbrand(){
            return brand;
        
        }

        public int getyear(){
            return year;
        }

        public int getpassenger_seat(){
            return passenger_seat;
        }

        public void displayinfo(){
            System.out.println("name of the brand = "+brand);
            System.out.println("brand year = "+year);
            System.out.println("passenger seat number = "+passenger_seat);
           
         }
        }

         class car extends a{
            public car(String public void break(){
            super.displayinfo();
            System.out.println("your choice is brand = "+brand);public void break(){
                super.displayinfo();
                System.out.println("your choice is brand = "+brand);
    
             }
    

         }
brand,int year,int passenger_seat);
            super(brand,year,passenger_seat);

         }//override
         public void Break(){
            super.displayinfo();
            System.out.println("your choice is brand = ");

         }
         public void Accelator(){
            super.displayinfo();
            System.out.println("your choice is accelator = ");

         }
         public void gare(){
            super.displayinfo();
            System.out.println("your choice is gare = ");

         }


       
 
