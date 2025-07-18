public class bitmanupulation { 
    public static int fasttype(int a,int n){
        int ans=1;
        while(n>0){
            if((n&1)!=0){
                ans=ans*a;
            }
            a=a*a;
            n=a>>1;
        }
        return ans;

        
    }
    public static int countsetbit(int n){
        int count=0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static boolean power2ornot(int n){
        return (n &(n-1))==0;
    }
    public static int rangeithbit(int n,int i,int j){
        int a =((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitmask = a|b;
        return n & bitmask;
    }
    public static int clearlastithbit(int n,int i){
        int bitmask=(~0)<<i;
        return n & bitmask;
    }
    public static int updateithbit(int n,int i, int newbit){
         n =clearithbit(n,i);
        int bitmask=newbit<<i;
        return n |bitmask;
    }
    public static int clearithbit(int n,int i){
        int bitmask =~(1<<i);
        return n & bitmask;
    }
    public static int setithbit(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;
    }
    public static int getithbit(int n,int i){
        int bitmask=1<<i;
        if((n & bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static void main(String args[]){
        System.out.println(fasttype(5, 3));
        System.out.println(countsetbit(10));
        System.out.println(power2ornot(4));
        System.out.println(rangeithbit(10, 2, 4));
        System.out.println(clearlastithbit(15, 2));
        System.out.println(updateithbit(10, 2, 6));
        System.out.println(clearithbit(10, 1));
        System.out.println(setithbit(10, 2));
        System.out.println(getithbit(10, 2));
        OddorEven(3);
        OddorEven(8);
        OddorEven(5);
    }
    public static void OddorEven(int n){
        int bitmask=1;
        if((n & bitmask)==0){
            System.out.print("number is even ");
        }else{
            System.out.print("number is odd ");
        }
        System.out.println();
    }
    
}
