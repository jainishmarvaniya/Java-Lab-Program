import java.util.Scanner;

public class A2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number 1:");
        double a=sc.nextDouble();
        System.out.println("enter a numer 2:");
        double b=sc.nextDouble();
        sc.nextLine();
        System.out.println("enter a string:");
        String s=sc.nextLine();
        double ans;
       if(s.equals("+")){
           ans=a+b;
           System.out.println("ans"+ans);
       }
       else if(s.equals("-")){
           ans=a-b;
           System.out.println("ans"+ans);
       }
       else if(s.equals("*")){
           ans=a*b;
           System.out.println("ans"+ans);
       }
       else{
           ans=a/b;
           System.out.println("ans"+ans);
    }
}
}