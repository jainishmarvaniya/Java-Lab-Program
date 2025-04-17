interface Playable{
    void play();
}

class Football implements Playable{
      public void play(){
          System.out.println("football play method called: ");
      }
}

class Vollyball implements Playable{
       public void play(){
          System.out.println("vollyball play method called: ");
      }
}

class Basketball implements Playable{
        public void play(){
          System.out.println("basketball play method called: ");
      }
}

public class C6{
    public static void main(String[] args){
           Football f1=new Football();
           Vollyball v1=new Vollyball();
           Basketball b1=new Basketball();

           f1.play();
           v1.play();
           b1.play();
    }
}