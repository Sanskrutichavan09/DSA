public class selectionpractice {
    public static void selection(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;

                }

            }
            //swap
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
    }
  
    public static void printarr(int arr[]){
        for(int turn=0;turn<arr.length;turn ++){
            System.out.println(arr[turn]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={4,9,7,4,6,2,3,1};
        selection(arr);
        printarr(arr);
    }
}