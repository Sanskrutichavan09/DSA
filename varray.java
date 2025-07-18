public class varray {
    public static void main(String args[]){

        int sum2=addnumber(10,12);
       System.out.println("int number add = "+sum2);
       int sum1=addnumber(1,2,3,4,5,5);
        System.out.println(sum1);

    //    double sum3= addnumber(2.3,5.5);
    //    System.out.println("varray number = "+sum3);
    System.out.println(addnumber(4,5,5,84,54));
   SSystem.out.println(addnumber(2.3,4.5,57.7,8.7,78.9));
    
    }

    public static int addnumber(int a, int b){
        return a+b;
    }
    public static double addnumber(double a, double b){
        return a+b;
    }
    public static double addnumber(double.... a){
        double sum=0;
        for(double:a){
            sum+=num;
        }
        return sum;
    }
    public static int addnumber(int... a){
        int sum=0;

        for(int num :a){
            sum+=num;
        }
       return sum;
    }
    
}
