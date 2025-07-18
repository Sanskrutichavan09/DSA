public class substring {
    public static String printsubString(String str,int SI,int EI){
        String substr="  ";
        for(int i=SI;i<EI;i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){
        String str="helloworld";
        System.out.println(printsubString(str, 0, 6));
      // System.out.println(str.printsubString(0,6));
    }
    
}
