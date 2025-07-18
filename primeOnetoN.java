
import java.io.*;
import java.util.Scanner;

public class primeOnetoN {
    public static void main(String args[]){
        int i , count, j,total=0;
        Scanner sc =  new Scanner (System.in);
        int n=sc.nextInt();
        for(i=1;i<=n;i++){
            count = 0;
           for(j=1;j<=i;j++){
            if(i%j==0){
                count++;
            }
            else if(count == 2){
                System.out.println(i);
                total = total+1;
            }
           }
           System.out.println("total prime num : "+total);

        }
    }
    
}
