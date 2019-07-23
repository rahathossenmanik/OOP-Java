package main;

public @interface MyAnnotation {
	int UserAge() default 20;
	String UserName();
	String Address();
	String Dept() default "CSE";
}
