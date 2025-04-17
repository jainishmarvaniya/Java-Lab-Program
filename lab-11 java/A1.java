class MyThread extends Thread{
   
    public void run(){
        while(true){
                 System.out.println("run Method call");
    
              try{
                  sleep(1000);
                 }catch(Exception e){
                       e.printStackTrace();
                }
           } 
    }
  }

class MyThread1 implements Runnable{

    public void run(){
        while(true){
              System.out.println("Runnable Method called");

             try{
               Thread.sleep(1000);
              }catch(Exception e){
                 e.printStackTrace();
              }
        }
    }
}


public class A1{
    public static void main(String[] args){

        MyThread m1=new MyThread();
        m1.start();

        Thread t1=new Thread( new MyThread1());
        t1.start();
    }
}