public class practicebubblesort {
    public staticvoid main(String argd[]){
        int arr[]={5,3,4,2,1};
        bubble(arr);
        printbubble(arr);
                
        

    }
    public static void bubble(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
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
        System.out.println(arr[k]+" ");
        

}System.out.println();
   
    }
   }