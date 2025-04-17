import java.util.Scanner;

public class A1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a no of student: ");
        int n=sc.nextInt();

        int marks[] =new int[4];

        int total=0;
        try{
        for(int i=0;i<n;i++){

            System.err.println("Enter a student mark");
            marks[i]=sc.nextInt();

            total+=marks[i];
        }
             total=total/n;

            System.err.println("total="+total);
        }


        catch(ArithmeticException ae){
            System.err.println("cannot student count zero");

        }

        catch(ArrayIndexOutOfBoundsException aie){
            System.err.println("enter no of student 5");
        }

        System.out.println("Byeee");
    }
}