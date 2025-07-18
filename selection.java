public class selection {
    public static void selsectionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
             int minpos=i;
            for(int j=i+1;j<arr.length;j++){
               
                if(arr[minpos] > arr[j]){
                    minpos=j;
                }
            }
            //swap
            int temp=arr[i];
            arr[i]=arr[minpos];
            arr[minpos]=temp;
        }
    }
    public static void printart(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){

        int arr[]={4,5,7,6,2};
        selsectionsort(arr);
        printart(arr);
    }
    
}
