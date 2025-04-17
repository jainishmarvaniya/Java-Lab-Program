interface EventListner {
    void performEvent();
}

interface MouseListner extends EventListner{
    void mouseClicked();
    void mousePressed();
    void mouseReleased();
    void mouseMoved();
    void mouseDragged();
}

interface KeyListner extends EventListner{
    void keyPressed();
    void keyReleased();
}

class EventDemo implements MouseListner,EventListner{
      public void performEvent(){
        System.out.println("performEvent method called:  ");
     }
      public void mouseClicked(){
          System.out.println("mouseclicked method called:  ");
     }
      public void mousePressed(){
           System.out.println("mousepressed method called:  ");
     }
      public void mouseReleased(){
          System.out.println("mousereleased method called:  ");
      }
      public void mouseMoved(){
        System.out.println("mousemoved method called:  ");
      }
      public void mouseDragged(){
          System.out.println("mousedragged method called:  ");
      }
      public void keyPressed(){
          System.out.println("keypressed method called:  ");
      }
      public void keyReleased(){
            System.out.println("keyreleased method called:  ");
       }
}

public class A4{
    public static void main(String [] args){
    
    EventDemo ed=new EventDemo();

    ed.performEvent();
    ed.mouseClicked();
    ed.mousePressed();
    ed.mouseReleased();
    ed.mouseMoved();
    ed.mouseDragged();
    ed.keyPressed();
    ed.keyReleased();
}
}