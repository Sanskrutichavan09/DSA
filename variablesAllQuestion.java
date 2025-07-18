import java.util.Scanner;

public class variablesAllQuestion {
    public static void taxsum(float pencial,float pen,float eraser){
        
        float total=pencial+pen+eraser;
        System.out.println("sum of pentil,pen,erres=" + total);
        

        float newtotal = total + (0.18f * total);
        System.out.println("tax of bill = "+ newtotal);

        

    }

    public static void areaofsqure(int squre){
        int area=(squre*squre);
        System.out.println("area of suere=" +area);

    }
    public static void average(int p,int q,int r){
        int ave=p+q+r/3;
        System.out.println("average of sum="+ave);
        
    }

    public static void areaofcircle(int rad){
        int area=(int)3.14f*rad*rad;
        System.out.println(" area of circle is="+ area);
        
    }
    public static void production(int a, int b){
        // mulitiply of a & b

        int prod= a * b;
        System.out.println(" multiply of a & b ="+ prod);
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //pencil pen q
        float pencial=sc.nextInt();
        float pen=sc.nextInt();
        float eraser=sc.nextInt();

        taxsum(pencial, pen, eraser);


        // area of squre
        int squre=sc.nextInt();
        areaofsqure(squre);


        // average of 3
        int p=sc.nextInt();
        int q=sc.nextInt();
        int r=sc.nextInt();
        average(p, q, r);

        //are of circle question
        int rad=sc.nextInt();
        areaofcircle(rad);




//production question
        int a= sc.nextInt();
        int b=sc.nextInt();
        production(a,b);


        // sum of a & b
        int  c=3;
        int d=4;
        int sum=c+d;
        System.out.println("sum of a & b="+sum);
      
       
    }
    
}
