import java.util.Scanner;

public class B5{

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

        System.out.println("enter a meter:");

		double m=sc.nextDouble();

		double f;

		f=m/(3.28084);

		System.out.println(f);

		System.out.println("enter a feet:");

		double c=sc.nextDouble();

		double d;

		d=(3.28084)*c;

		System.out.println(d);


	}
}