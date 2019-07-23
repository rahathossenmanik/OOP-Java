package main;

public class ControllStatement{
	public static void main(String args[]){
		  outer: for(int i=0;i<3;i++){
			  System.out.print("Pass "+i+": ");
			  inner: for(int j=0;j<100;j++){
				  if(j==10)break outer;
				  if(j%2==0)continue inner;
				  System.out.print(j+" ");
			  }
			  System.out.println("This will not print.");
		  }
		  System.out.println("Loops complete.");
	}
}