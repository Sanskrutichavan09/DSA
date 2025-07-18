public class practiceBASICSORTING {
    public static void selectiondort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos] < arr[j]){
                    minpos = j;
                }
            }
            //swap
       int temp=arr[minpos];
       arr[minpos]=arr[i];
       arr[i]=temp;

       }

    }
    public static void main(String args[]){
        
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        //bubble(arr);
        selectiondort(arr);
        printbubble(arr);
                
    }
    
    public static void bubble(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
    }
    public static void printbubble(int arr[]){
    for(int k=0;k<arr.length;k++){
        System.out.print(arr[k]+" ");
        

}System.out.println();
   
    }
   

    

    
}
