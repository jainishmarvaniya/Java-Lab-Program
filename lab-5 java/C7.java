import java.util.Scanner;
public class C7{
	public static void main (String[]args){
		Scanner sc =new Scanner(System.in);
		System.out.print("enter a Size");
		int size=sc.nextInt();
		int[]a=new int [size];
		int i;
		for(i=0;i<a.length;i++)
		{
			System.out.print("enter a element ");
			a[i]=sc.nextInt();
		}
         System.out.print("enter pivot element"); 
			int k=sc.nextInt();
		  int []ans=new int[size];
          for(i=0;i<a.length;i++)
          {
                 if(i>=k)
                 {
                 	ans[i-k]=a[i];
                 }
                 else
                 { 
                 	int temp=0;
                 	temp=(((a.length-k)+1)+i);
                 	ans[temp]=a[i];
                 }  
          }
          int flag=0;
          System.out.print("enter a Search element ");
          int t=sc.nextInt(); 
          for(i=0;i<ans.length;i++)
          {
                if(t==ans[i])
                {
                	System.out.print("find index=>"+i);
                	flag=1;
                	break;
                }
          }
          if(flag==0)
          {
          	System.out.print("not find");
          }
	}
}