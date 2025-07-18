public class ObjectOrientedProgramming {
    public static void main(String args[]){
    //     Pen p1=new Pen();
    //     p1.setcolor("pink");
    //     System.out.println(p1.color);
    //    p1.setTip(4);
    //    System.out.println(p1.tip);
    student stud=new student();
    stud.calcgpa(cgpa("20","30","40")/3);
    System.out.println(stud.cgpa);

       
    }

    
}
 class Pen{
    String color;
    int tip;

    void setcolor(String newcolor){
        color=newcolor;
    } 
    void setTip(int newtip){
        tip=newtip;
    }
        
    }
    
class student{
    String name;
    int age;
    String cgpa;

    void calcgpa(int phy,int chem,int math){
        cgpa=(phy+chem+math)/3;
    }
}
