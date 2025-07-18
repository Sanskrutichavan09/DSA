public class object {
    public static void main(String args[]){
        object sc=new object();
        int result = sc.addnum(34,56);
        System.out.println("output = "+result);
        int call_sum=sc.call(12,22);
        System.out.println("output call = "+ call_sum);
}
    public int addnum(int x,int y){
        int sum=x+y;
        return sum;

    }
    public int call(int a,int b){
        int callprint=addnum(a,b);
        // System.out.println("callprint"+callprint);
        return callprint;
    }
    
}
