import java.util.Scanner;

class vowel{
	
	String s1;

	vowel(String s1){
		this.s1=s1.toLowerCase();	
	}

	    int a=0;
        int e=0;
        int i=0;
        int o=0;
        int u=0;

	public void noofvowel(){
		for(int i=0;i<s1.length();i++){
             char a=s1.charAt(i);

             switch(a){
             case 'a' :
             	
             	a++;
                break;

             case 'e' :
             	
             	e++;
                break;

             case 'i' :
             	
             	i++;
                break;

             case 'o' :
             	
             	o++;
                break;

             case 'u' :
             	
             	u++;
                break;
             }
		}

		System.out.println("a"+a);
		System.out.println("e"+e);
		System.out.println("i"+i);
		System.out.println("o"+o);
		System.out.println("u"+u);
	}
}

public class B3{

	public static void main(String[] args){

      Scanner sc=new Scanner(System.in);



      while(true){

         System.out.println("Enter a String: ");
      	String s2=sc.nextLine();

      	if(s2.equalsIgnoreCase("quit")){
             break;
      	}

      	vowel v1=new vowel(s2);
         
         v1.noofvowel();


      }

      
	}
}