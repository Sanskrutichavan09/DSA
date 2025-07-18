public class practiceBASIC_SORTING {
    
    public static void bubblesort(int arr[]){
        //BUBBLE SORT

        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    //swap 
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void printarr(int arr[]){
        for(k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }System.out.println();
    }
    public static void main(String args[]){

          int arr[]={3,6,2,1,8,7,4,5,3,1};
          bubblesort(arr);
          printarr(arr);

    }

    
}
