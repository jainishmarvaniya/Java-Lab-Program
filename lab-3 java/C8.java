import java.util.Scanner;
public class C8{
	public static void main (String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a starting range: ");
		int a=sc.nextInt();

		System.out.println("Enter a ending range:");
		int b=sc.nextInt();
		int flag=0;
		int temp;
		if(a>b)
		{
           temp=a;
           a=b;
           b=temp;
		}
		for(int i=a;i<=b;i++)
		{
             for(int j=2;j<i;j++)
             {
                if(i%j==0)
                {
                  flag=1;
                  break;  
                }	
             }
             if(flag==0)
                {
                	System.out.println(i);
                }
               flag=0; 
		}
	}
}