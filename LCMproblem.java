import java.util.Scanner;

public class LCMproblem {
    public static void main(String args[]){
        int u=25,v=15;
        System.out.println("LCS IS"+ u+"and "+"GSD IS "+ v+"is the"+LCD(u,v));
    }
    public static int LCD(int u,int v){
        return (u/GCD(u,v))*v;
    }
    
    //LCM means latest  common mltiplication
    public static int GCD(int u,int v){
        Scanner sc=new Scanner(System.in);
        int u=sc.nextInt();
        int v=sc.nextInt();

        if(u==0){
            return v;
            return GCD(v%u,u);
        }
        
    }
    
}
