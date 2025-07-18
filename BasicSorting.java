public class BasicSorting {
    public static void countingSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest, arr[i]);
        }
            int count[]=new int[largest+1];
            for(int i=0;i<arr.length;i++){
                count[arr[i]]++;

            }
            int j=0;
            for (int i=0;i<arr.length;i++){
                while(count[i]>0){
                    arr[j]=i;
                    j++;
                    count[i]--;
                }
            }

            
        }


    
    
    public static void insertionsort(int arr[]){
        
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 &&arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
        }

    }
    public static void selectionsort(int arr[]){

        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos] > arr[j]){
                    minpos = j;
                }
            }
             //swap
        int temp=arr[minpos];
        arr[minpos]=arr[i];
        arr[i]=temp;

        }

    }
     public static void priarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
        
     }


    // BUBBLE SORT




    public static void bubblesort(int Arr[]){
        for(int turn=0;turn<Arr.length-1;turn++){
            for(int j=0;j<Arr.length-1-turn;j++){
                if(Arr[j]>Arr[j+1]){//chaking current element is bigger than next element
                    //swap
                    int temp=Arr[j];
                    Arr[j]=Arr[j+1];
                    Arr[j+1]=temp;

                }
            }
        }
    }
     public static void printarr(int Arr[]){
        for(int i=0;i<Arr.length;i++){
            System.out.print(Arr[i]+" ");
        }
        System.out.println();
     }
    
    public static void main(String args[]){
       // int Arr[]={5,4,1,3,2};
       // int arr[]={5,4,1,3,2};
        int arr[]={1,4,1,3,2,4,3,7};
         //bubblesort(Arr);
         //printarr(Arr);
         //selectionsort(arr);
         //insertionsort(arr);
         //countingSort(arr);

        // priarr(arr);
         



    }
}
