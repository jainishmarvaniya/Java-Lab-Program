import java.util.Scanner;
class Time{
	int hour;
	int minute;
	int secound;
     Time(int hour,int minute,int secound){
             this.hour=hour;
             this.minute=minute;
             this.secound=secound;
     }

  public void addition(int hour,int minute,int secound){
            this.secound+=secound;
              if(this.secound>=60){
              	this.secound-=60;
              	this.minute++;
              }
               this.minute+=minute;
              if (this.minute>=60){
                    this.minute-=60;
              	this.hour++;
              }
               this.hour+=hour;
              System.out.println(this.hour+" "+this.minute+" "+this.secound);
     }
}
public class A2{
	public static void main (String [] args){
		Scanner sc =new Scanner(System.in);
        System.out.println("Ente a Hour");
              int h=sc.nextInt();
        System.out.println("Ente a minute");
              int m=sc.nextInt();
        System.out.println("Ente a secound");
              int s=sc.nextInt();

              Time a=new Time(h,m,s);

               System.out.println("Enter a time you want to add ");
        System.out.println("Ente a Hour");
               h=sc.nextInt();
        System.out.println("Ente a minute");
               m=sc.nextInt();
        System.out.println("Ente a secound");
               s=sc.nextInt();

               a.addition(h,m,s);
	}
}