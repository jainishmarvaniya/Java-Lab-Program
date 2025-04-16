 final class Variable{
	 final int x=10;
	 final int y=5;

	public void printvariable(){
		System.out.println("x="+x);
		System.out.println("y="+y);
	}
}

	 class Variable1 extends Variable{

		public void printvariable(){
			System.out.println("x"+x);
		}

	}

public class A5{
	public static void main(String[] args){

		Variable v1=new Variable();

		final int x=7;

		System.out.println(x);

		v1.printvariable();

	}
}