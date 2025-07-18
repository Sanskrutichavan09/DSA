public class calculater {
   //using constaructer
    int a=10,b=20;
    public static void main(String args[]){
        calculater c = new calculater(3,4);
        System.out.println("adition = "+c.getvalue());
        System.out.println("substraction = "+c.get_1());
        System.out.println("multiplication = "+c.get_2());
        System.out.println("division = "+c.get_3());
    }
     public calculater(int a,int b){
        this.a=a;
        this.b=b;
     }
     public int getvalue(){
        return a+b;
     }
    
     public int get_1(){
        return a-b;
     }
     public int get_2(){
        return a*b;
     }
     public int get_3(){
        return a/b;
     }
}
