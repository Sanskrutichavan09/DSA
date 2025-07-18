public class selectiosort {
    public static void main(String args[]){
        int arr[]={3,5,4,2,1};
        for(int i=0;i<arr.length;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                
                if(arr[minpos]>arr[j]){
                  minpos=j;
                }
                //swap
                int temp=arr[minpos];
                arr[minpos]=arr[i];
                arr[i]=temp;
            }
            
          
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
