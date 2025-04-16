import java.util.Scanner;
public class A5{
	public static void main (String[] args){
		int i=1,j=0;
        System.out.println("Enter a string ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(i=1;i<=s.length();i++)
        {
        	for(j=0;j<i;j++)
        	{
               char a=s.charAt(j);     
               System.out.print(a);
        	}
        	System.out.println();
        }
	}
}