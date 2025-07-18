public class logicalOperation {
    public static void main(String args[]){
        int x=10;
        int y=20;
        int z=30;
        boolean a=(x>y) && (x>z);
        System.out.println(a);
        
        boolean b=(x<y) || (y>z);
            System.out.println(b);
            boolean c=!(x<y);
            System.out.println(c);
        
    }

    
}
