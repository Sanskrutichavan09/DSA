import java.util.Scanner;

public class javabasicprogram {
    public static void main(String args[]){
        // // to read the number from standard input
        // int a= 5;
        // System.out.println("read this program = "+a);

        // //get input from the user
        Scanner sc=new Scanner(System.in);
        // int b=sc.nextInt();
        // System.out.println("user get input = "+b);

        // //multiply to floatig number
        // float p=sc.nextFloat();
        // float q=sc.nextFloat();
        // float multy=p*q;
        // System.out.println("multiple two floating number = "+multy);

        // //swap two number
        //  int c=5;
        //  int d=10;
        
        //  int temp=c;
        //  c=d;
        //  d=temp;
        // System.out.println("swap the number =" + c);
        // System.out.println("swap od d ="+ d);

        // //check even odd
        // int s=sc.nextInt();

        // if(s%2==0){
        //     System.out.println("number is the ="+"even");

        // }else{
        //     System.out.println("number is the ="+"odd");
        // }

        // // largest among number
        // int A=sc.nextInt();
        // int B=sc.nextInt();
        // int C=sc.nextInt();

        // if(A>B){
        //     if(A>C){
        //         System.out.println(" a is greater");
        //     }

        // }else if(B>C){
        //         System.out.println("b is greater");
        //     }else{
        //         System.out.println("c is greater");
        //     }


       // System.out.println(isprime(5));


       // prime range in 1 to n
       
       for(int n=2;n<=10;n++){
        if(n%2==0){
            System.out.println("not prime number ="+n);
        }else{
            System.out.println("prime number ="+ n);
        }
       }
        
    
    }
    // public static boolean isprime(int n){
    //     boolean isprime=true;
    //     for(int i=2;i<=n-1;i++){
    //         if(n%1==0){
    //             isprime=false;
    //             break;

    //         }
            
    //     }
    //      return isprime;
       
    // }

    
    
}
