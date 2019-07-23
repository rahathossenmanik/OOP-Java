package main;

public class MaximumUsingCommandLineArgs {
	public static void main(String[] args){
 	 int max;
 	 max=Integer.parseInt(args[0]);
 	 for (int i = 0; i < args.length; i++ ){
 	    max = Math.max(max, Integer.parseInt(args[i]));   
 	 }
 	 System.out.println(max);
    }
}