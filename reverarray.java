public class reverarray {
    public static void reverce(int number[]){
      int start=0,end=number.length-1;

      while(start<end){

       int temp=number[end];
       number[end]=number[start];
       number[start]=temp;


        start++;
        end--;
      }
     
    }
    public static void main(String args[]){
        int number[]={4,5,7,2,8,6};
        reverce(number);

        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
       System.out.println();
      
    }
   
    
}
