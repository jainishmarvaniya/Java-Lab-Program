import java.util.Scanner;

public class A2{

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("enter a number:");

		int n=sc.nextInt();

		int i=0;

		if(n%2==0){

			System.out.println("Even number");
		}
		else{

			System.out.println("odd number");
		}
	}
}