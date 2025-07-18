public class add {
    public static void main(String args[]){
        int sum=0;
        int n=565;
        int ri=n%10;
        int d=n/10;
        sum=sum+ri;
        int r1=d%10;
        int d1=d/10;
        sum=sum+r1;
        int s1=d1%10;
        // int s2=d1/10;
        sum=sum+s1;
        System.out.println("sum is addition = "+sum);
        

    }
    
}
