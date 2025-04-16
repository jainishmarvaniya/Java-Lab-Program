import java.util.Scanner;
class Circle{
	double redis;
	Circle(double redis){

        this.redis=redis;

	}
	public double area(){

          return( (Math.PI)*redis*redis);
	}
}
public class A1{
	public static void main (String[]args){
              Scanner sc=new Scanner(System.in);
              System.out.println("enter a redius ");
                 double n=sc.nextInt();
                Circle a=new Circle(n);
                double area=a.area();
                    System.out.println(area);      
                
	}
}