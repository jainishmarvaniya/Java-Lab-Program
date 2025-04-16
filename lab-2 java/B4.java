import java.util.Scanner;

public class B4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a temperature in fahrenhit:");
		double f=sc.nextDouble();
		double c=(f-32)*(5.0/9);

		System.out.println(c);

		System.out.println("enter a temperature in calsias:");
		 c=sc.nextDouble();
		 f=((9/5.0)*c)+32;

		System.out.println(f);
	}
}