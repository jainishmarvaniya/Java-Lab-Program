import java.util.Scanner;
class Book{
	private String authorName;

	Book(String authorName){
		this.authorName=authorName;
	}

	 void display(){
		System.out.println("Author Name is: "+authorName);
	}

	public String getAuthorName(){
		  return authorName;
	}
}
class BookPublication extends Book{
     private String title;
     BookPublication(String title,String authorName){
      	  super(authorName);
          this.title=title;
     }

     void display(){
     	super.display();
		System.out.println("BookPublication title is: "+title);
	}
}
class PaperPublication extends Book{
	   private String title;
       
       PaperPublication(String title,String authorName){

       	    super(authorName);
       	    this.title=title;
       }
       void display(){
     	super.display();
		System.out.println("paperPublication title is: "+title);
	}

}

public class A2{
	public static void main(String[] args){
           
       Scanner sc=new Scanner(System.in);

       if(args[1].equals("book")){
           Book b;
           b=new BookPublication(args[2],args[0]);
           b.display();
       }
       else if(args[1].equals("paper")){

       	   Book b;
       	   b=new PaperPublication(args[2],args[0]);
       	   b.display();
       }
       else{
       	   System.out.println("input invalid: ");
       	   return;
       }
	}
}