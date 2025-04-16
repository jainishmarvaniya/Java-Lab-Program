import java.util.Scanner;

public class B4{
	public static void main(String[] args){

	  Scanner sc=new Scanner(System.in);

      System.out.println("Enter a string:");

      String a=sc.nextLine();

      int len=a.length();

      System.out.println(len);

      for(int i=(a.length())/2;i<a.length();i++){

      	  System.out.print(a.charAt(i));
      }

	}
}