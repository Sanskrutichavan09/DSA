public class RecursionBasic {
    public static int naturalsum(int n){
        if(n==1){
            return 1;
        }
        int smcal=naturalsum(n-1);
        int sn=n+smcal;
        return sn;

    }
    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int fnm1=fibonacci(n-1);
        int fnm2=fibonacci(n-2);
        int fb=fnm1+fnm2;
        return fb;


    }
    public static int natural(int n){
        if(n==1){
            return 1;
        }
        int snm1=natural(n-1);
        int sn=n+snm1;
        return sn;
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1=fact(n-1);
        int fn=n*fact(n-1);
        return fn;
    }
    public static void printinc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printinc(n-1);
        System.out.print(n+" ");
    }
    public static void printdec(int n){
        if(n==1){
            System.out.println(n);
            return ;
        }
        System.out.print(n +" ");
       printdec(n-1);
    }
    public static void main(String args[]){
        int n=7;
       // printdec(n);
      // printinc(n);
      //System.out.println(fact(n));
     // System.out.println(natural(n));
     //System.out.println(fibonacci(n));
     System.out.println(naturalsum(n));
    }
    
}
