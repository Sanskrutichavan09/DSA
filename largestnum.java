public class largestnum {
    public static int largest(int number[]){
        int large=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            if(large<number[i]){
            large=number[i];
             
           
        } 
        return large; 
        
        }
         
      
    }
    public static void main(String args[]){
        int number[]={2,4,6,5,8,8};
        int key=5;
        System.out.println("largest is="+largest(number));

    }
    
}
