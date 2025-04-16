import java.util.Scanner;
public class B6{
	public static void main (String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int k=sc.nextInt();
           int n=((k/2)+1);

		for(int i=0;i<n;i++)
		{
           for(int j=0;j<n;j++)
           {
             
             System.out.print(" ");
              if(j>=((n-1)-i))
             { 
              System.out.print("*");
             }
           }
           System.out.println();
		}

		for(int i=n;i>0;i--)
		{
           for(int j=n;j>0;j--)
           {
             if(i<=j)
             {
             	System.out.print(" ");
             }
             else {
                System.out.print(" *");
             }
           }
           System.out.println();
		}
	}
}