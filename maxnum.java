public class maxnum {
    public static void main(String args[]){
        int arr[]={2,5,6,3,4,1};
        int sum=0;
        int max=arr[0];
        
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(arr[i]>max){
                max=arr[i];
            }
        }
       
        System.out.println
        ("the maximun number is = "+max);
        System.out.print("sum of the element is = "+sum);
    }
    
}
