import java.util.Scanner;

public class A1{

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("enter a mark subject 1:");

		int a=sc.nextInt();

		System.out.println("enter a mark subject 2:");

		int b=sc.nextInt();

        System.out.println("enter a mark subject 3:");

		int c=sc.nextInt();

		System.out.println("enter a mark subject 4:");

		int d=sc.nextInt();

		System.out.println("enter a mark subject 5:");

		int e=sc.nextInt();

		int tm;
	
	     double pr;

	     tm=a+b+c+d+e;

	     pr=tm/5;

	     if(pr>=60){

	     	System.out.println("first class");
	     }

	     else if(pr<59 && pr>50){

	     	System.out.println("second class");
	     }

	     else if(pr<49 && pr>40){

	     	System.out.println("third class");
	     }

	     else{

	     	System.out.println("fail");
	     }

	}
}