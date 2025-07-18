public class operaters {
    public static void main(String args[]){
        int x=6;
        int y=20;
        int a=x|y;
        System.out.println(a);
        //addition 
        int p=2;
        int q=3;
        int b=p+q;
        System.out.println("addition of = "+b);
        //greater check
        int s=20;
        int r=15;
        boolean c=s>r;
        System.out.println(c);

        int g=15;
        int h=g++ + ++g + g++ + g++ + ++g;
        System.out.println("output of g = "+ g);
        System.out.println("output of h = "+ h);
        
        int l=15;
        int o=l++ + ++l * l-- + l-- - --l;
        System.out.println("output of l = "+ l);
        System.out.println("output of o = "+ o);
    }
    
}
