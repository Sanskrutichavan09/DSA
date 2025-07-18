public class inheritance {

    public static void main(String args[]){
        
        System.out.println("print subfunction of fish below : ");
        fish shark=new fish();
        shark.eat();
        shark.swin();


        System.out.println("print subfunction of lion : ");
        lion li=new lion();
        li.breathe();
        li.run();
       
    }
}
    class animal{
        
        void eat(){
            System.out.println("eats");

        }
        void breathe(){
            System.out.println("breathe");
        }
        void color(){
            System.out.println("multicolor");
        }
    }

    class fish extends animal{
    
        void swin(){
            System.out.println("swin in water");
        }
        
    }

    class lion extends animal{
        
        void run(){
            System.out.println("run fast in jumgle");
        }
    }

    class cat extends animal{
        void sleep(){
            System.out.println("sleeping cat");
        }
    }
    

