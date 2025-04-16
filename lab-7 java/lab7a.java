import java.util.Scanner;
class Student{
    int idno;
	int noofSubject;
    String []grade;
    int []credit;
    String []code;
    double spi;
}

public Student(int idno,int noofSubject,String[] grade,int[] credit,String[] code){
	this.idno=idno;
	this.noofSubject=noofSubject;
	this.grade=grade;
	this.credit=credit;
	this.code=code;
	
}

public int grade(String grade_obtained){
	switch(grade_obtained){
	 case "A++":return 10;
     	
     case "A+":return 9;
     	

     case "A":return 8;
     	

    case "B++":return 7;
       
         case "B":return 6;
        	

         case "B":return 5;
       
 case "C":return 4;
         	

         case "D":return 3;
       
         case "E":return 2;
       
         case "F":return 1;
         	
    default:{return 1;
    }

	}

}


void clacspi(){
double total_subject_credit=0;
double total_point=0;

for(int i=0;i<this.noofSubject;i++){
	total_subject_credit+=credit[i];
	total_point+=credit[i]*grade(grade_obtained[i]);
}

spi=total_point/total_subject_credit;
System.out.println("spi" +spi);
}


public class lab7a{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);\

 System.out.println("Enter size: ");
 int size=sc.nextInt();

  Student [] stu=new Student[size];

 
  	System.out.println("Enter id number: ");
int idno=sc.nextInt();

System.out.println("Enter Number of Subject: ");
int noofSubject=sc.nextInt();

String []grade=new String[noofSubject];
int []credit=new int[noofSubject];
String []code=new String[noofSubject];

 for(int j=0;j<noofSubject;j++){
        	
        	System.out.println("Enter a code:");
            code[j]=sc.nextLine();
            
            
        	System.out.println("Enter a grade:");
        	grade[j]=sc.nextLine();



        	
        	System.out.println("Enter a credit:");
        	credit[j]=sc.nextInt();

        	
        }
        Student s1=new Student(idno,noofSubject,grade,credit,code);

        s1.clacspi();
         
        

}
}

