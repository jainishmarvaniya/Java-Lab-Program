class Random extends Thread{
    int num;
	public void run(){

		while(true){
		   num=(int)(Math.random()*100);
		  System.out.println(num);
        

        if(num%2==0){
        	Even e1=new Even(num);

        	e1.start();
        }else{
        	Odd o1=new Odd(num);

        	o1.start();
        }
        try{
        	sleep(1000);
        }catch(Exception e){
        	e.printStackTrace();
        }
		}
	}
}

class Even extends Thread{
     int num;

      Even(int num){
     	this.num=num;
     }

     public void run(){
         
         System.out.println("square is: "+num*num);
     }

}

class Odd extends Thread{
     int num;

      Odd(int num){
     	this.num=num;
     }

     public void run(){
         
         System.out.println("cube is: "+num*num*num);
     }

}
public class B5{
    public static void main(String[] args){
       
           Random r1=new Random();

           r1.start();
    }
}