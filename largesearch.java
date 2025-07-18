public class largesearch {
    public static int largenumber(int number[]){
        int large=Integer.MIN_VALUE;
        for(int i=0;i<=number.length;i++){
            if(large<number[i]){
                large=number[i];
              
                
            }  
            
        }   
        return large;      

    }
    public static void main(String args[]){
        int number[]={3,5,7,6,8,9,25,65,22,3};
         System.out.println(" found large number = "+ largenumber(number));
    }
    
}
