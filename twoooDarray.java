import java.util.Scanner;

public class twoooDarray {
    public static boolean scearch(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.print("found at cell ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("key is not found");
        return false;
    }
    public static void main(String args[]){
       
        int matrix[][]=new int[3][3];
         int n=matrix[0].length, m=matrix[0].length;

        Scanner sc =new Scanner(System.in);
       
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }

        }
        //output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.err.print(matrix[i][j]+"  ");
            }
            System.out.println();
        
        }
        scearch(matrix, 5);
        
    }
    
    
}
