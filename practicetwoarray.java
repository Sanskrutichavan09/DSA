public class practicetwoarray {
    
    public static void main(String args[]){
    //    int array [][]={{4,7,8},{8,8,7}};

    //    int count7=0;
    //     for(int i=0;i<array.length;i++){
    //         for(int j=0;j<array[0].length;j++){
    //             if(array[i][j]==7){
    //                count7++;
    //             }
                
    //         }
    //     }
    //     System.out.println("count 7 is = "+ count7);
    int nums[][]={ {1,4,9},{11,4,3},{2,2,3} };
    int sum=0;
       
        for(int j=0;j<=nums[0].length;j++){
           
                sum +=nums[0][j];
            }
        
       
        System.out.println(" sum is="+sum);
    }
    
}
