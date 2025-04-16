import java.util.Scanner;
class Member{
	String name="jainish";
	int age=18;
	String phoneNo="7016069465";
    String address="sanala road rajpar";
    int salary=50000;
}

class Empolyee extends Member{
	String specialization="15 years experiance";

	public void printDetail(){
		System.out.println("Employee name is: "+name);
		System.out.println("Employee age is: "+age);
		System.out.println("Employee phoneNo is: "+phoneNo);
		System.out.println("Employee address is: "+address);
		System.out.println("Employee salary is: "+salary);
		System.out.println("Employee specialization is: "+specialization);
	}
}

class Manager extends Member{
	String department="humaniti and science department";

	public void printDetail1(){
		System.out.println("Manager name is: "+name);
		System.out.println("Manager age is: "+age);
		System.out.println("Manager phoneNo is: "+phoneNo);
		System.out.println("Manager address is: "+address);
		System.out.println("Manager salary is: "+salary);
		System.out.println("Manager department is: "+department);
	}
}

public class B3{
	public static void main(String[] args){

      Scanner sc=new Scanner(System.in);

      
       Empolyee m1=new Empolyee();
       m1.printDetail();

       Manager m2=new Manager();

       m2.printDetail1();



	}
}