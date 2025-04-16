import java.util.Scanner;

class complex{
	double real;
	double imaginary;

	complex(){
        real=0.0;
        imaginary=0.0;
	}

	complex(double imaginary,double real){
		this.real=real;
		this.imaginary=imaginary;
	}

	public void add(double imaginary,double real){
		this.real+=real;
		this.imaginary+=imaginary;
		if (imaginary >= 0) {
            System.out.println(this.real + " + " + this.imaginary + "i");
        } else {
            System.out.println(this.real + " - " + Math.abs(this.imaginary) + "i");
        }
	}

}

public class B5{

	public static void main(String [] args){

		Scanner sc=new Scanner(System.in);

		 System.out.println("Enter a complex number 1 : ");
         double complex1= sc.nextDouble();

         System.out.println("Enter a real number 1 : ");
         double real1= sc.nextDouble();

         complex c1=new complex(complex1,real1);


         System.out.println("Enter a complex number 2 : ");
         double complex2= sc.nextDouble();

         System.out.println("Enter a real number 2 : ");
         double real2= sc.nextDouble();

         complex c2=new complex(complex2,real2);

         c1.add(complex2,real2);
        
         

	}
}