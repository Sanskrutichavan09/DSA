package Array;

public class reverse {
    public static void main(String[] args) {
        int arr[] = {12,23,84,34,65};

        int first = 0;
        int last = arr.length-1;

        while(first<last){
            int temp = arr[last];
             arr[last] = arr[first];
             arr[first] = temp;
             first++;
             last--;
  
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + "  ");
         }
        
    }
    
}
