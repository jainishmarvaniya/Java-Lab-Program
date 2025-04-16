abstract class Vegetable{
	String color;

	public abstract String ToString(); 
}

class Potato extends Vegetable{
	Potato(){
		super.color="yellow";
	}
	public String ToString(){
		return super.color;
	}
}

class Brinjal extends Vegetable{
	Brinjal(){
		super.color="purple";
	}
	public String ToString(){
		return super.color;
	}
}

class Tomato extends Vegetable{
	Tomato(){
		super.color="red";
	}
	public String ToString(){
		return super.color;
	}
}

public class A1{
	public static void main(String[] args){

		Potato p1=new Potato();
		Brinjal b1=new Brinjal();
		Tomato t1=new Tomato();

		String s1=p1.ToString();
		String s2=b1.ToString();
		String s3=t1.ToString();

		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		System.out.println("s3="+s3);

	}
}