class count{
	static int NoOFobject=0;

count(){
	NoOFobject++;
}
}
public class B6{
	public static void main(String[] args){

      count co1=new count();
      count co2=new count();
      count co3=new count();
      count co4=new count();
      count co5=new count();
      count co6=new count();


      System.out.println("Number of object is created: "+count.NoOFobject);
         
	}
}