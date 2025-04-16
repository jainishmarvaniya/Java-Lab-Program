import java.util.Scanner;

public class Sum{

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("enter a number 1:");

		int a=sc.nextInt();

		System.out.println("enter a number 2:");
 
 		int b=sc.nextInt();

        int c=a+b;

		System.out.println("sum is"+c);


	}
}