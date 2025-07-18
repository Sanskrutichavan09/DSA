public class bitwiseOperater {
    public static void main(String[] args) {
        int x=20;
        int y=21;
        int a=x&y;
        System.out.println("bitwise AND = "+a);
        int b=x|y;
        System.out.println("bitwise OR = "+b);
        int c=x^y;
        System.out.println("bitwise XOR = "+c);
        int d=~x;
        System.out.println("NOT = "+d);
        int e=x<<3;
        System.out.println("left shif = "+e);
        int f=x>>1;
        System.out.println("right shift ="+f);
    }
    
}
