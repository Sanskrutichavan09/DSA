public class subarr {
    public static void subarray(int number[]){
        
        for(int i=0;i<number.length;i++){
            int start=i;
            for(int j=i;j<number.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(number[k] + " ");
                }
               
            }
            System.out.println();
           
        }

        
    } 
    
   
    
    public static void main(String args[]){
        int number[]={2,3,5,7,8,9,4,10};
        subarray(number);

    }
    
}
