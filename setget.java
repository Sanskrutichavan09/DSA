public class setget {
    private String name;
    private int age;
    public setget(String name,int age){
        this.name=name;
        this.age=age;
    }

  public String getName(){
    return name;
  }
  public void setName(String name){
   this.name=name;
  }
  public int getAge(){
    return age;
  }
  public int setAge(int age){
   if(age>=0){
    this.age=age;
   }else{
    System.out.println("age cannot be ");
   }
  }
}
