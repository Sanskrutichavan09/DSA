public class allFUNCTIONquestins {
    public static boolean iseven(int n){
        // boolean iseven=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    iseven=true;
                }else{
                    iseven=false;
                }
            }
            return iseven;
        }


    }
    public static int average(int a,int b,int c){
        int averange=a+b+c/3;
        return averange;
    }
    public static void dectobin(int n){
        int mynum=n;
        int pow=0; 
        int binnum=0;

        while(n>0){
            int rem=n%2;
            binnum=binnum+(rem*(int)Math.pow(10, pow));

            pow++;
            n=n/2;
        }
        System.out.println("decimal to binary is "+ mynum+ " =" + binnum);

    }
    public static void bintodec(int n){
        int mynum=n;
        int pow=0;
        int decnum=0;

        while(n>0){
            int lastdigit=n%10;
            decnum=decnum+(lastdigit*(int)Math.pow(2, pow));

            pow++;
            n=n/10;

        }
        System.out.println(" binary code is  "+ mynum+"=" + decnum);
    }
    public static boolean isprime(int n){
        boolean isprime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isprime=false;
            }
        }
        return isprime;

    }
    public static void primerange(int n){
        for(int i=2;i<=n;i++){
            if(primeornot(i)){
                System.out.print(i+" ");
            }

        }
        System.out.println();
    }
    public static boolean primeornot(int n){
        boolean primeornot=true;
        for(int i=2;i<=n-1;i++){
            if(n % i==0){
                primeornot= false;
            }
        }
        return primeornot;
    }
    public static int bionmialCoeficient(int n, int r){
       int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nmr=factorial(n-r);

        int bioCoeficient=fact_n/(fact_r*fact_nmr);
        return bioCoeficient;

    }

    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }

    public static int product(int a,int b){
        int multy=a*b;
        return multy;

    }
    public static void main(String args[]){
        int a=3;
        int b=2;
       // System.out.println(product(a, b));
       System.out.println("prod  ="+product(a, b));
      System.out.println("factorial  = "+factorial(5)); 
      System.out.println("binomial coeficial = "+ bionmialCoeficient(5, 2));
      System.out.println("check prime = "+primeornot(2));
      System.out.println("optimaze method isprime = "+ isprime(8));
     primerange(100);
     bintodec(101);
     dectobin(7);
     System.out.println("avrerage is ="+ average(2, 3, 2));
     System.out.println(" is even or not check ="+ iseven(5));
    }
}
