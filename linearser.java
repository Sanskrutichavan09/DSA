public class linearser {
    public static int linearscerch(int number[],int key){
        
        for(int i=0;i<number.length;i++){
           if(number[i]==key){
            return i;
           }
        }return -1;

    }
    public static void main(String args[]){
        int number[]={12,23,34,45,7,23};
        int key=34;
        int index=linearscerch(number, key);
        if(index==1){
            System.out.println("found key"+index);
        }else{
            System.out.println("not found"+index);
        }
    }
    
}
