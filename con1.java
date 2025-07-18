public class con1 {
    public String brand;
    public static void main(String[] args) {
        con1 newbrand= new con1("ii");
        System.out.println("brand : "+newbrand.getbrand());
       
    
         
        
      }
      public  con1(String brand){

        // String brand;
        this.brand=brand;
       
    
     }
    public String  getbrand(){
        return brand;

    }
}
