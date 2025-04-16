import java.util.Scanner;

public class A1{
	public static void main(String[] args){
     
      Scanner sc=new Scanner(System.in);

      System.out.println("Enter a string:");

      String a=sc.nextLine();

      int len=a.length();

      int v=0;
      int c=0;



      for(int i=0;i<(a.length());i++){

      	char x=a.charAt(i);



      	if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||x=='A'||x=='E'||x=='I'||x=='O'||x=='U'){

              v++;
      	}
      	else{

      		c++;
      	}
      }

          System.out.println("no of vowel:"+v);
          System.out.println("no of consonant:"+c);

          System.out.println("lenth of String:"+len);

	}
}