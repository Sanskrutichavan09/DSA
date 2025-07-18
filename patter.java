public class patter {
    public static void main(String[] args) {
        //star pattern
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("______________________________________________________");

        //inverted star pattern
        int p=5;
        for(int i=0;i<p;i++){
            for(int j=1;j<=p-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("___________________________________________________");
        //haif pyreamid
        int q=5;
        for(int i=1;i<=q;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        //inverted and rotated star paramud\
        int a=5;
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a-1;j++){
                System.out.print(" ");

            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}
