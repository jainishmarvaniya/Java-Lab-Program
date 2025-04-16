import java.util.Scanner;

class student{
	double spi;
	String sname;

	public void stuDet(double spi,String sname){
          this.spi=spi;
          this.sname=sname;
	}
	public void depri(){
		System.out.println("student name: "+sname);
		System.out.println("student spi: "+spi);
	}
}
	class StudentCol{
	 	static String CollegeName="DU";
	 	int RollNo=150;

	 	 //static void student1(){
	 		//this.CollegeName=CollegeName;
	 		//this.RollNo=RollNo;
	 		//System.out.println("student College: "+CollegeName);
	 		//System.out.println("student RollNo: "+RollNo);

	 	//}
	 	void student2(){
	 		this.CollegeName=CollegeName;
	 		this.RollNo=RollNo;
	 		System.out.println("student College: "+CollegeName);
	 		System.out.println("student RollNo: "+RollNo);
	 	}
	}


public class C7{
	public static void main(String[] args){
         
         Scanner sc=new Scanner(System.in);

         student s1=new student();

         System.out.println("Enter student name: ");
         String sname=sc.nextLine();

         System.out.println("Enter student spi: ");
         double spi=sc.nextDouble();

         s1.stuDet(spi,sname);
         s1.depri();

         StudentCol stu1=new StudentCol();

        // stu1.student1();
         stu1.student2();
	}
}