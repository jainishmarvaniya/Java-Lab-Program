interface Shape{
    public void getArea();
     
}

class Rectangle implements Shape{
     public void getArea(){
        System.out.println("Rectangle getArea Method called: ");
    }
}

class Circle implements Shape{
     public void getArea(){
        System.out.println("Circle getArea Method called: ");
    }
}

class Triangle implements Shape{
     public void getArea(){
        System.out.println("Triangle getArea Method called: ");
    }
}

public class B5{
    public static void main(String[] args){
          
          Rectangle r1=new Rectangle();
          Circle c1=new Circle();
          Triangle t1=new Triangle();

          r1.getArea();
          c1.getArea();
          t1.getArea();
    }
}