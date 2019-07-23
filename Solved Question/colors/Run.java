package main.colors;

public class Run {
	public static void main(String[] args) {
		A a = new B();
		a.two();
		
		B b = new B();
		b.one(4);
		b.one();
		
		Red r = new B();
		r.turnRed();
		
//		Blue bb = new Blue();		Error! You cannot create object of interfaces.
//		bb.turnBlue();
		
//		C c = new A();				Error! There is not any “two()” method in C.
//		c.two();
		
//		A aa = new B();				Error! There is not any “turnBlue()” method in A.
//		aa.turnBlue();
		
		A ab = new C();
		ab.two();
	}
}
