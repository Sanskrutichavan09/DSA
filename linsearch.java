public class linsearch{
    public static int linearsearch(int number[], int key){
        for(int i=0;i<=number.length;i++){
            if(number[i]==key){
                System.out.println("found key");
                
                return i;
            }
           
           
            }
             return -1;
             
    } 
            
    
    public static void main(String args[]){
        int number[]={4,5,2,6,8,9};
        int key=6;
        int index=linearsearch(number, key);
        if(index==-1){
            System.out.print("not found");
        }else{
            System.out.print("found key ="+index);
        }
       
        
       

    }
}