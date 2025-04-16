import java.util.Scanner;

class Bank_Account{
	int accountNo;
	String userName;
	String email;
	String accountType;
	int accountBalance;

	public Bank_Account(){
		
	}

	public void getAccountDetails(int accountNo,String userName,String email,String accountType,int accountBalance){
		this.accountNo=accountNo;
		this.userName=userName;
		this.email=email;
		this.accountType=accountType;
		this.accountBalance=accountBalance;
	}

	public void displayAccountDetails(){
		System.out.println("accountNo: "+accountNo);
		System.out.println("userName: "+userName);
		System.out.println("email: "+email);
		System.out.println("accountType: "+accountType);
		System.out.println("accountBalance: "+accountBalance);
	}

}

public class A4{

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		Bank_Account ba1=new Bank_Account();

		Bank_Account ba2=new Bank_Account();

		System.out.println("Enter account Number :");
		int accountNo=sc.nextInt();

		sc.nextLine();

		System.out.println("Enter user name: ");
		String username=sc.nextLine();

		System.out.println("Enter email :");
		String email=sc.nextLine();

		System.out.println("Enter account Type :");
		String accountType=sc.nextLine();

		System.out.println("Enter account balance :");
		int accountbalance=sc.nextInt();


        ba1.getAccountDetails(accountNo,username,email,accountType,accountbalance);

        ba1.displayAccountDetails();
	}
}