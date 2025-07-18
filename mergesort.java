public class  mergesort{
    public static void main(String args[]){
        int arr[]={6,3,9,5,2,8};
        mergesorts(arr, 0, arr.length-1);
        printarr(arr);


    }
    
    public static void merge(int arr[],int si,int ei,int mid){
        int temp[]=new int[ei-si+1];//array ke index 0 based hote he isliye size me +1 krna padata he ...
        int i=si;//left part
        int j=mid+1;//right part
        int k=0;//temp array

        while (i<=mid && j<=ei) {
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
            
        }
        //left part some missing part
        while (i<=mid) {
            temp[k++]=arr[i++]; 
        }
        //right part some missing part
        while (j<=ei) {
            temp[k++]=arr[j++];
            
        }
        //copy temp to my orignal array
        for(k=0,i=si;k<temp.length;k++,i++){
           arr[i] =temp[k];

        }

    }
    public static void mergesorts(int arr[],int si,int ei ){
        //basecase
        if(si>=ei){
            return;
        }
        //kaam
        int mid=si+(ei-si)/2;
        mergesorts(arr, si, mid);//left part
        mergesorts(arr, mid+1, ei);//right part
        merge(arr, si, mid,ei);
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"");
        }
        System.out.println();
    }
}