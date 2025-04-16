interface A{
	int a=5;
	void printa();
}
interface A1 extends A{
   int b=6;
	void printb();
}
interface A2 extends A{
    int c=7;
    void printc();
}
interface A12 extends A1,A2{
    int d=8;
	void printd();
}

class B implements A12{
     public void printa(){
     	System.out.println("A="+a);
     }

     public void printb(){
     	System.out.println("b="+b);
     }

     public void printc(){
     	System.out.println("c="+c);
     }

      public void printd(){
     	System.out.println("d="+d);
     }
}

public class Lab8A2{
	public static void main(String[] args){
        
        B b1=new B();

        b1.printa();
        b1.printb();
        b1.printc();
        b1.printd();


	}
}