public class insertionsort {
    public static void main(String args[]){
        int arr[]={5,6,8,2,4,1,7,3};
       
        for(int i=1;i<arr.length;i++){
            int key=arr[i];                                                                                                                                                                                                                                     6
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
               
            }
            arr[j+1]=key;
           
        }
        for(int i=1;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
      
        
        
    }
    
}
