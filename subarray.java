public class subarray {



    public static void subarr(int numbers[]){
        int tp=0;
        int sum=0;

        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k] + " ");
                }
                tp++;
                sum=i+j;
                System.out.println();
            }
            System.out.println();
        }
        
        System.out.println("total subarray is = " +tp);
        System.out.println("sum of all values = "+sum);
    }
    public static void main(String args[]){
        int numbers[]={ 2 , 4 , 6 , 8 , 10};
        subarr(numbers);

    }
}
