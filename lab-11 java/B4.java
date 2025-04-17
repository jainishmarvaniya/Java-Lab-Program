class  Odd extends Thread{
     int n=20;
	public void run(){
       
       for(int i=1;i<n;i++){
       	  if(i%2!=0){
             
              System.out.println(i);
       	  }
       }
	}
}

class  Even extends Thread{
     int n=20;
	public void run(){
       
       for(int i=1;i<n;i++){
       	  if(i%2==0){
             
              System.out.println(i);
       	  }
       }
	}
}

public class B4{
	public static void main(String[] args){
         

         Odd od1=new Odd();
         Even ev1=new Even();

         od1.start();
         ev1.start();
	}
}