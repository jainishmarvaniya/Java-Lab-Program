import java.util.Scanner;

class Account{
    int depositmoney;
    int withdrawmoney;
    int totalmoney;
}

public class A2{
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a Total Money: ");
        int totalmoney=sc.nextInt();

        System.out.println("Enter a deposit Money: ");
        int depositmoney=sc.nextInt();

        totalmoney=(totalmoney+depositmoney);

        System.out.println("Enter a withdraw Money: ");
        int withdrawmoney=sc.nextInt();

         totalmoney=(totalmoney-withdrawmoney);

         if(totalmoney<0){
            System.out.println("your balance is insuficient");
         }

         if(totalmoney==0){
            System.out.println("your balance is zero");
         }

         if(totalmoney>0){
         System.out.println("totalmoney is: "+totalmoney);
         }
    }
}