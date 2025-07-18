public class practiceAbdul {
    public static int linear(int num[],int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
            
        }
        return -1;

    }
    public static void main(String args[]){
        int num[]={2,3,4,7,8,10,12,14};
        int key=8;
        int index=linear(num,key);
        if(index==-1){
            System.out.print("not found");
           
        }else{
            System.out.println("found = " +index);
        }
        
   }
}
