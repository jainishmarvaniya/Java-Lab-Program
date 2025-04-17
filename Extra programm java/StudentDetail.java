import java.util.Scanner;

class Student{
	String name;
	int rollno;
	double spi;
	String course;

	public void setter(String name,int rollno,double spi,String course){
          this.name=name;
          this.rollno=rollno;
          this.spi=spi;
          this.course=course;
	}
	public void getter(){
		System.out.println("student name: "+name);
		System.out.println("student rollno: "+rollno);
		System.out.println("student spi: "+spi);
		System.out.println("student course: "+course);
	}
}

public class StudentDetail{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);
        
        Student s1=new Student();

        System.out.println("Enter a student Name: ");
        String name=sc.nextLine();

        System.out.println("Enter a student Rollno: ");
        int rollno=sc.nextInt();

        System.out.println("Enter a student Spi: ");
        double spi=sc.nextDouble();

        sc.nextLine();

        System.out.println("Enter a student Course: ");
        String course=sc.nextLine();

        s1.setter(name,rollno,spi,course);

        s1.getter();
	}
}