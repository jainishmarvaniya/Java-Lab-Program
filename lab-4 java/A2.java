import java.util.Scanner;

public class A2{
	public static void main(String[] args){


		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a size:");

		int size=sc.nextInt();

		int sum=0;

		int a[]=new int[size];

		for(int i=0;i<a.length;i++){

			System.out.println("Enter a Element:");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++){

		    sum=sum+a[i];
		}


		 double avg=sum/(double)a.length;

		System.out.println("array average:"+avg);
	}
}