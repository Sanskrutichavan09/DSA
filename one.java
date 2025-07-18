//import java.util.*;
// import java.ArithmeticException;

public class one {
    public static void main(String args[]){
        
        try{
            int a=10;
            int b=10;
            int result=a/b;
            System.out.println("result="+result);
        }
        catch(ArithmeticException e){
            System.out.println("arithmetic exception = "+e.getMessage());
        }
    }
    
}
