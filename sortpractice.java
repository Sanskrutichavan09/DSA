public class sortpractice {
    public static void countsort(int arr[]){
       
            int largest=Integer.MIN_VALUE;
             for(int i=0;i<arr.length;i++){
                largest=Math.max(largest, arr[i]);

        }
        int count=new int [largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count>=0){
                arr[j]=i;
                count[i]--;
            }
        }
    }
    public static void insertionsort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    public static void selectionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int mispos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[mispos]>arr[j]){
                    mispos=j;
                }
            }
            //swap
            int temp=arr[i];
            arr[i]=arr[mispos];
            arr[mispos]=temp;
        }

    }
    public static void printart(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void bubblesort(int arr[]){
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
    public static void main(String args[]){
        int arr[]={2,4,6,1,7,8};
       // bubblesort(arr);
      // selectionsort(arr);
      insertionsort(arr);
        printart(arr);
    }
    
}
