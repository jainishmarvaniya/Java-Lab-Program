import java.util.Scanner;

public class A5{

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("enter a number:");

		int n=sc.nextInt();

		int i,count=0;

		for(i=2;i<=n/2;i++){
          
          if(n%2==0){
          	count++;

          }
		}

		if(count==0){
			System.out.println("prime number");
		}
		else{
			System.out.println("not prime number");
		}
	}
}