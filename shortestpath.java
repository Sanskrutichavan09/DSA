public class shortestpath {
    public static float getshortestpath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir =path.charAt(i);
            //north
            if(dir=='N'){
                y++;
            }
            //south
           else if(dir=='S'){
                y--;
            }
            //west
           else if(dir=='W'){
                x--;
            }
            //east
            else{
                x++;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return(float)Math.sqrt(X2+Y2);
       
        
    }
    public static void main(String args[]){
        String path="WNEENESENNN";
         System.out.println(getshortestpath(path));
    }
}
