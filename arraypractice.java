public class arraypractice {
    public static int getlargest(int number[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<=number.length;i++){
            if(largest<number[i]){
                largest=number[i];
            }
            
        }
        return largest;
    }
    
    // public static String linearstring(String menu[],String key){
    //     for(int i=0;i<=menu.length;i++){
    //         if(menu[i].equals(key)){
    //             return i;
    //         }
    //     }

    //    return -1;
    // }
    public static int linearsearch(int number[],int key){
        for(int i=0;i<=number.length;i++){
            if(number[i]==key){
                return i;
            }
            
        }
        return -1;
    }

    public static void main(String args[]){
        // int menu[]={samosa,vadapav,biryani,panipuri,pasta,pestry};
        // int key=biryani;
        // int index=linearstring(menu, key);
        // if(index.equals(-1)){
        //     System.out.println("not found");
        // }else{
        //     System.out.println("found");
        // }
        int number[]={2,4,6,8,10,12,14,16};
        int key=12;
        getlargest(number);
        int index=linearsearch(number, key);
            if(index==-1){
                System.out.print("not found");
            }else{
                System.out.print("found = "+index);
            

        }

    }
    
}
