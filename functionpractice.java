import java.util.Scanner;

public class functionpractice {
    public static void primeRange(int n){
        for(int i=2;i<=n;i++){
            if(isprime(i)){
                System.out.print(i +" ");
                
            }
           
        }
       System.out.println();

    }


    public static boolean primeis(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean isprime(int n){

        boolean isprime=true;

        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isprime=false;
                break;
            }
           
        }
         return isprime;
    }
    public static int biocoeff(int n ,int r){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nmr=factorial(n-r);

        int biocoeff=fact_n/(fact_r*fact_nmr);
        return biocoeff;




    }
    public static int factorial(int n){
        
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;

        }
                    return f;
    }

    public static int product(int a,int b){
        int multiply=a*b;
        return multiply;
    }

    public static void parameters(){// parameters or formal parameters  input



    }

    //calculate 
    public static void calculate(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        int sum=a+b;
        System.out.println("sum of the a & b="+ sum);

    }



    public static void main(String args[]){
        
        //calculate();//arguments or actuval parameters     output     calling statements 
        
        
       // int mul=product(2, 3);
      //  System.out.println("multiply of a & b="+ mul);
          System.out.println(factorial(7));
         //System.out.println(biocoeff(5, 2));
       // System.out.println(isprime(12));
         //System.out.println(primeis(4));
          
        // primeRange(10);


    }
}
