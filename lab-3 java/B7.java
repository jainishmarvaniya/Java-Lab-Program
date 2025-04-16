import java.util.Scanner;

public class B7{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a Number:");
		int n=sc.nextInt();

		int temp=n;

		int rem=0,r=0;

		while(n!=0){
            rem=n%10;
            r=r*10+rem;
            n=n/10;
		}

		System.out.println("r : "+r);
		System.out.println("n : "+n);
		if(r==temp){

			System.out.println("palidrome number");
		}
		else{

			System.out.println("not palidrome number");
		}
	}
}