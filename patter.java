public class patter {

    public static void main(String[] args) {
        int n = 5;

// *
// **
// ***
// ****
// *****
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
          
        }
        System.out.println("_______________________________-");
     for( int i=1;i<=n;i++){
        for(int j=1;j<=n-i+1;j++){
            System.out.print("*");
        }
        System.out.println();
     }
        System.out.println("__________________________________________");

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.err.println("__________________________________________________");

        
for (int i = 1; i <= n; i++) {
 
    for (int j = 1; j < i; j++) {
        System.out.print(" ");
    }
    
    for (int j = 1; j <= n - i + 1; j++) {
        System.out.print("*");
    }
   
    System.out.println();
}
System.out.println("_____________________________________");

for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}

System.out.println("_______________________________");
  for(int i=1;i<=n;i++){
    for(int j=n;j>=i;j--){
        System.out.print("*");
    }
    System.out.println();
  }
  System.out.println("________________________________________");

  for(int i=1;i<=n;i++){
    for(int j=n;j>=i;j--){
        System.out.print(" ");
    }
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
  }
  System.out.println("________________________________________");

// *****
// *****
// *****
// *****
// *****

for(int i=1;i<=n;i++){
    for(int j=1;j<=n;j++){
        System.out.print("*");
    }
    System.out.println();
}
System.out.println("___________________________________");
//     *
//    ***
//   *****
//  *******
// *********
for(int i=1;i<=n;i++){
    //space

    for(int j=1;j<=n-i;j++){
        System.out.print(" ");
    }
    for(int j=1;j<=2*i-1;j++){
        System.out.print("*");
    }
    System.out.println();
}


    }
}