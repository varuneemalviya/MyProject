
class Hobbies{  
    void draw(){System.out.println("drawing...");}  
    }  
    class Activity extends Hobbies{  
    void sing(){System.out.println("singing...");}  
    }  
   
public class Main{
     public static void main(String[] args) {
        System.out.println("Git project!!");
        Activity h=new Activity();  
    h.sing();  
    h.draw();  
    }
}