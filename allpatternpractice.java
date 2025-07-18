public class allpatternpractice {
    public static void diamand(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //start
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //start
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();


        }System.out.println("____________________________________________________________________________________");

    }
    public static void hallow_solidrectangle(int n){
        for(int i=1;i<=n;i++){

        for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        

            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
           System.out.println();
        
        } System.out.println("____________________________________________________________________");

    }
    public static void solid_rhombus(int n){
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("______________________________________________________________________________________________");

    }
    public static void butterfly_pattern(int n){
        for(int i=1;i<=n;i++){
            //stars
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
        }
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

        }System.out.println("_______________________________________________________________________________");
    }
    
    public static void butterfly(int n){
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
        }

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
       

    
    public static void trinagle_pattern_binary(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0 ");
                }
                
            }
            System.out.println();
        }System.out.println("__________________________________________________________________________");
    }
    public static void floyds_triangle(int n){
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }System.out.println("______________________________________________________________________________");
    }

    public static void number_inverted_rotated_haif_pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        
        System.out.println("______________________________________________________________________________");
    }

    public static void inverted_rotated_haif_pyramid(int n){
        //inverted rotated haif
        for(int i=1;i<=n;i++){
            //space
            for( int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("____________________________________________________________________________________");
    }

    public static void hallowrectangle(int tolcol,int tolrow){
        // Hallow rectangle
        
        for(int i=1;i<=tolrow;i++){
            for(int j=1;j<=tolcol;j++){
                if(i==1 || i==tolrow || j==1|| j==tolcol){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }System.out.println("_____________________________________________________________________________");
    }
    //pattern 2 satrt



    /*
     * 
     * PATTERN 1st is complete now.
     * 
     */
    //character pattern
    public static void characterpattern(String args[]){
        char ch='A';
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();

        }System.out.println("________________________________________________________________________________");
    }
    //haif paramid
    public static void haifparamid(String args[]){

        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }System.out.println("________________________________________________________________________________");
    }
    //inverted pattern
    public static void invertedpattern(String args[]){
       int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }System.out.println("___________________________________________________________________________________");
    }
    // star pattern
    public static void star(String args[]){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
             System.out.println();
        }System.out.println("______________________________________________________________________________________");
       
        
    }
    public static void main(String args[]){
        
       star(args);
       invertedpattern(args);
       haifparamid(args);
       characterpattern(args);
       hallowrectangle(5, 4);
       inverted_rotated_haif_pyramid(5);
       number_inverted_rotated_haif_pyramid(5);
       floyds_triangle(5);
       trinagle_pattern_binary(5);
       butterfly(4);
       butterfly_pattern(7);
       solid_rhombus(5);
       hallow_solidrectangle(6);
       diamand(4);
    
    }
}
