import java.util.Scanner;

public class C5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number 1:");
        double a=sc.nextDouble();
        System.out.println("enter a numer 2:");
        double b=sc.nextDouble();
        System.out.println("enter a numer 3:");
        double c=sc.nextDouble();
        if(a>b){
            if(a>c){
                System.out.println(a);
            }
            else{
                System.out.println(c);
            }
        }
        else{
            if(b>c){
                System.out.println(b);
            }
            else{
                System.out.println("largest number:"+c);
            }
        }
    }
}