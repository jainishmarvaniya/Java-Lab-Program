import java.util.Scanner;

class Cube{
	double height;
	double width;
	double depth;

	public void setter(double height,double width,double depth){
		this.height=height;
		this.width=width;
		this.depth=depth;
	}

	public void getter(){
		System.out.println("height is: "+height);
		System.out.println("width is: "+width);
		System.out.println("depth is: "+depth);
	}
	 public void Volume1(double height,double width,double depth){
		double ans=height*width*depth;
		System.out.println("The volume is: "+ans);
	}
}
public class Volume{
	public static void main (String[] args){

       Scanner sc=new Scanner(System.in);

        Cube c1=new Cube();

        System.out.println("Enter a height:");
        double height=sc.nextDouble();

        System.out.println("Enter a width:");
        double width=sc.nextDouble();

        System.out.println("Enter a depth:");
        double depth=sc.nextDouble();

        c1.setter(height,width,depth);

        c1.getter();

        c1.Volume1(height,width,depth);

	}
}