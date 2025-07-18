public class starpatt {
    public static void diamand(int n){
        for (int i=1;i<=n;i++){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=2*(i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd haif
        for(int i=n;i>=1;i--){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=2*(i)-1;j++){    // odd valus formula      2*x-1;
                System.out.print("*");

            }
            System.out.println();

        }





    }

    public static void hallowrhombus(int n){
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //halloregtangle- star
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
              System.out.println();
        }System.out.println("_____________________________________________________________________________________________________");
    }

    public static void Solid(int n){
            for(int i=1;i<=n;i++){
                //space
                for(int j=1;j<=(n-i);j++){
                    System.out.print(" ");
                }
                //star
                for(int j=1;j<=n;j++){
                    System.out.print("*");
                }
                System.out.println();

            }System.out.println("-----------------------------------------------------------------------------------------------");

         }


    public static void butterfly(int n ){
// 1st haif
           for(int i=1;i<=n;i++){
            //star
               for(int j=1;j<=i;j++){
                System.out.print("*");
               }


            //space
                 for(int j=1;j<=2 * (n-i);j++){
                    System.out.print(" ");
                 }


            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }System.out.println("---------------------------------------------------------------------------------------");
         

     //2nd haif
     
                for(int i=n;i>=1;i--){
                    
            //star
               for(int j=1;j<=i;j++){
                System.out.print("*");
               }


            //space
                 for(int j=1;j<=2*(n-i);j++){
                    System.out.print(" ");
                 }


            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }System.out.println("______________________________________________________________________________________________________________");
    
    }


    






    public static void binarytriangle(int n){

        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j) %  2 == 0){ //even number
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }System.out.println();
        }System.out.println("_________________________________________________________________________________________________________");

    }

         

    public static void floyds_triangle(int n){
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();

        }System.out.println("__________________________________________________________________________________________________________");
    }









    public static void haif_pyramid_number(int n){
        //inverted haif pyramid with number
              
         for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i+1;j++){

                System.out.print( j +" ");
                
            }
            System.out.println();

            
         }System.out.println("-----------------------------------------------------------------------------------------------------------");

    }









    public static void rotatedhaifpyramis(int n){
        //INVERTED AND ROTATED HAIF PYRAMID

          for(int i=1; i<=n; i++){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }System.out.println();


          }System.out.println("------------------------------------------------------------------------------------------------");



    }
    
    
    
    
    
    
    
    
    // HALLOW RECTANGLE

    public static void hallorectangle(int tolrows,int tolcols){
        //outerlook
        for(int i=1;i<=tolrows;i++){
            //innerloop
            for(int j=1;j<=tolcols;j++){
                if(i == 1 || i == tolrows || j == 1 || j == tolcols ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                } 
            }
            System.out.println();    
        }  
        System.out.println("------------------------------------------------------------------------------");

   }
   



    
    
    public static void main(String args[]){
        //star pattern
        for(int i=1;i<=4;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            
                
        }
        System.out.println("---------------------------------------------------------");
        //inverted star pattern

         int n=4;
        for(int k=1;k<=n;k++){
            for(int l=1;l<=n-k+1;l++){   // formula star print inner loop l=n-i+1; means n is the total number min to i (outerloop) and add 1
                System.out.print("*");
            }
            System.out.println();

    }
    System.out.println("-------------------------------------------------------------------");

    
    
    
    
    
    // haif pyramid

    for(int a=1;a<=n;a++){
        //inner loop
        for(int b=1;b<=a;b++){
            System.out.print(b);
        }
        System.out.println();  
    }
    System.out.println("------------------------------------------------------------------------------");
    
    
    
    
    
    
    
    
    
    
    char ch='A';
    for( int o=1;o<=4;o++){
        for(int p=1;p<=o;p++){
            System.out.print(ch);
            ch++;
        }
        System.out.println();
    }
    System.out.println("-----------------------------------------------------------------------------------------------------");
    hallorectangle(4, 5);
    rotatedhaifpyramis(n);
    haif_pyramid_number(5);
    floyds_triangle(5);
    binarytriangle(5);
    butterfly(5);
    Solid(5);
    hallowrhombus(5);
    diamand(4);
    
}
}
    



