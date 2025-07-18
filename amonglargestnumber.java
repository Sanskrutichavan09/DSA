import java.util.Scanner;

public class amonglargestnumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER isleap(2000)=");
        int a=sc.nextInt();
        System.out.println("ENTER B NUMBER =");
        int b=sc.nextInt();
        System.out.println("ENTER C NUMBER =");
        int c=sc.nextInt();
        if((a>b)&&(a>c)){
            System.out.println("a is greatest number");
        }else if(b>c){
            System.out.println("b is greater");
        }else{
            System.out.println("c is greater");
        }
        System.out.println();
    }
    
}
