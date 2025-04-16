import java.util.Scanner;

public class A4{

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("enter a number 1:");

		int a=sc.nextInt();

		System.out.println("enter a number 2:");

		int b=sc.nextInt();

		System.out.println("enter a number 3:");

		int c=sc.nextInt();

		int maxnumber;

		maxnumber=(a>b)?(a>c)?a:c:(b>c)?b:c;

		System.out.println("maxnumber:"+maxnumber);
	}
}