package main;

public class MyGreetingRun implements MyGreetings {
	
	public static void main(String[] args) {
		MyGreetings mygt = (str)-> "Hello"+str;
		String mg = mygt.ProcessName("Manik");
		System.out.println(mg);
	}
	@Override
	public String ProcessName(String str) {
		return null;
	}
	
}
