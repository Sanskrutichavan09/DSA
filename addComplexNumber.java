/**
 * addComplexNumber
 */
public class addComplexNumber {
    //global declare
    int real,image;
    public addComplexNumber(int r , int i){
        this.real = r;
        this.image = i;
    }
    //for the print 
    public void show(){
        System.out.println(this.real + "+i" +this.image);
    }
    public addComplexNumber add(addComplexNumber c1, addComplexNumber c2){
        int newreal = c1.real + c1.real;
        int newimage = c1.image + c1.image;
        return new addComplexNumber(newreal, newimage);

    }
    public static void main(String[] args) {
        addComplexNumber c1 = new addComplexNumber(4,5);
        addComplexNumber c2 = new addComplexNumber(10, 5);
        System.out.println("1st num is : ");
        c1.show();
        System.out.println("2nd num : ");
        c2.show();
        addComplexNumber res= c1.add(c1,c2);

        System.out.println("addition is ");
        res.show();
    }

    
}
