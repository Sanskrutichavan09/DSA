public class addBinaryString {

    static String binary_add(String x, String y){
        int num1 = Integer.parseInt(x,2);
        int num2 = Integer.parseInt(y,2);
        int add = num1+num2;
        String result = Integer.toBinaryString(add);
        return result;
    }
    public static void main(String[] args) {
        String x="1010";
        String y = "1011";
        System.out.println(binary_add(x, y));
    }
}