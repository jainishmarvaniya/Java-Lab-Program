import java.util.*;
import java.lang.ArithmeticException;
public class B4{
    public static void main(String[] args){
       
       Scanner sc=new Scanner(System.in);

        try{
        System.out.println("Enter a Number 1: ");
        int a=sc.nextInt();

        System.out.println("Enter a Number 2: ");
        int b=sc.nextInt();

        int c=a/b;

        System.out.println("c is: "+c);

        }
        catch(InputMismatchException ime){
            System.out.println("Enter a Number in Integer");
        }
        catch(ArithmeticException ae){
            System.out.println("Number can not diveded into a zero");
        }
        
    }
}