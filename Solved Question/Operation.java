package main;

public class Operation {
	public static void main(String[] args) {
		String s1 = "CSE";
		String s2 = "CSE";
		String s3 = new String("CSE");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		
		String str = new String("Hello");
		System.out.println(str);
		str.concat(" World");
		System.out.println(str);
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);
		sb.append(" World");
		System.out.println(sb);
	}
}
