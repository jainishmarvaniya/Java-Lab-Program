import java.util.Scanner;

     public class B6{

         public static void main(String[] args){
       
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a year:");

        int year=sc.nextInt();

        if(year%400==0){

        	System.out.println("leap year");
        }

        else if(year%100==0){

        	System.out.println("not leap year");
        }
        else if(year%4==0){

        	System.out.println("leap year");
        }
        else{

        	System.out.println(" not leap year");
        }


  }
}