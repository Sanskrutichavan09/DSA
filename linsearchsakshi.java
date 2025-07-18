public class linsearchsakshi {
    public static void linsrach(int number[],int key){
        for(int i=0;i<=number.length;i++){
            if(number[i]==key){
                System.out.println("key is found");
                 
                
            }

        }
        System.out.println("key is not found");

    }
    public static void main(String args[]){
        int number[]={3,56,7,8,4,10,6};
        int key=10;
        linsrach(number, key);


    }
    
}
