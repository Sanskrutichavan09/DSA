public class getlargest {
    public static int linearsearch(int number[],int key){
        for(int i=0;i<=number.length;i++){
            if(number[i]==key){
                System.out.println(" key is found");
                return i;
            }
        }
        return -1;

    }
    public static int getlarge(int number[]){
        int largest=Integer.MIN_VALUE;

        for(int i=0;i<number.length;i++){
            if(largest<number[i]){
                largest=number[i];
            }
           
        }
         return largest;
    }
    public static void main(String args[]){
        int number[]={3,4,5,6,7,9};
        int key=6;
        System.out.println("largest number is that ="+getlarge(number));
        int index=linearsearch(number, key);
            if(index==-1){
                System.out.println("not found");
            }else{
                System.out.println("key is foun= "+index);
            }
        
        

    }
    
}
