import java.util.Scanner;

class mh1 extends Thread{
     int arr[];
     public void run(){
     	 Scanner sc=new Scanner(System.in);

     	System.out.println("Enter a row: ");
     	  int m=sc.nextInt();

     	  System.out.println("Enter a collum: ");
     	  int n=sc.nextInt();
     	  int arr[][]=new int[m][n];

     	  for(int i=0;i<m;i++){
     	  	for(int j=0;j<n;j++){
                 
                  System.out.println("Enter a Element: "); 
                  arr[i][j]=sc.nextInt();
     	  	}
     	  }

     	  for(int i=0;i<arr.length;i++){
     	  	  mh2 m1=new mh2(arr[i]);

     	  	  m1.start();
     	  }
     } 
}

class mh2 extends Thread{
    int arr[];
    int sum=0;
	mh2(int[] arr){
       this.arr=arr;
	}
    public void run(){
	for(int i=0;i<arr.length;i++){
        
        sum+=arr[i];
	}

	System.out.println("sum of Row is: "+sum);
    }
}

public class C6{
	public static void main(String[] args){

       mh1 m=new mh1();
       m.start();
	}
}