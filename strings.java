public class strings{
    public static boolean ispalindron(String str){
        for(int i=0;i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                //not palindron  formula n-1-i   n is index lenght - 1- i
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String str="chanchu";
        System.out.println(ispalindron(str));
    }
}
