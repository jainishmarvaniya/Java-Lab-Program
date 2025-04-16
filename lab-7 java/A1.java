import java.util.Scanner;
class Student{
	int idno;
	int noOfSubject;
    String []grade;
    int []credit;
    String []code;

    Student(int idno,int noOfSubject,String grade[],int credit[],String code[]){
         this.idno=idno;
         this.noOfSubject=noOfSubject;
         this.grade=grade;
         this.credit=credit;
         this.code=code;
    }

    void  printDetail(){

    	  System.out.println( "id no: "+idno);
    	  System.out.println("no of subject: "+noOfSubject);

    	  for(int k=0;k<noOfSubject;k++){
                System.out.println("grade for subject: "+grade[k]);
                System.out.println("credit for subject: "+credit[k]);
                System.out.println("code for subject: "+code[k]);
    	  }

    }

    void spi(){
    	
    }
}

public class A1{
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a size: ");
		int size=sc.nextInt();

        Student [] stu=new Student[size];

        for(int i=0;i<size;i++){

        	System.out.println("Enter a idno: ");
        	int idno=sc.nextInt();

        	System.out.println("Enter a noOfSubject: ");
        	int noOfSubject=sc.nextInt();

        	String []grade=new String[noOfSubject];
            int []credit=new int[noOfSubject];
            String []code=new String[noOfSubject];

           

        for(int j=0;j<noOfSubject;j++){
        	sc.nextLine();

        	 
        	System.out.println("Enter a code:");
            code[j]=sc.nextLine();
            
            
        	System.out.println("Enter a grade:");
        	grade[j]=sc.nextLine();



        	
        	System.out.println("Enter a credit:");
        	credit[j]=sc.nextInt();

        	
        }
         stu[i]=new Student(idno,noOfSubject,grade,credit,code);

        stu[i].printDetail();
         
        }
          

	}
}
