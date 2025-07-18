public class binscerch {
    public static int binarysearch(int number[],int key){
        int start=0,end=number.length-1;

        while(start<=end){
            int mid=(start+end)/2;
            if(number[mid]==key){
               return mid;
            }else if(number[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
               
            }  
          
        }
        
         return -1;
    }
    
     public static void main(String[] args) {
        int number[]={3,5,7,9,0,13,45,23,};
        int key =13;
        System.out.println("binary search is found ="+binarysearch(number, key));
    }

    
}
