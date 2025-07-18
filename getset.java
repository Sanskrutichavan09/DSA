

public class getset {
    
    public static void main( String args[]){
        pen p1=new pen(); 
        p1.setcolor("blue");
        {
            System.out.println(p1.getcolor());
        }
        p1.setTip(5);
        {
            System.out.println(p1.getTip());

        }
        p1.setcolor("yellow");
        {
            System.out.println(p1.getcolor());

        }
    }
    
}
class pen{
    private String color;
    private int Tip;

    String getcolor(){
        return this.color;
    }
    int getTip(){
        return this.Tip;
    }
    void setcolor(String newcolor){
        this.color=newcolor;
    }
    void setTip(int Tip){
        this.Tip=Tip;
    }
}
