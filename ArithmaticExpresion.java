public class ArithmaticExpresion {
    public static void main(String args[]){
        try{
            int result=10/0;
        }
        catch(ArithmaticExpresion e ){
            System.out.println("arithmatic expression = "+e.getmessage());
        }
    }
    
}
