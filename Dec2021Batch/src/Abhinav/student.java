package Abhinav;

public class student {
	
	int a = 30;   // global variable
	
	public void m1() {
		int b=10;              // local variable
		System.out.println(a);
		System.out.println(b);
	}
	
	public void m2() {
		int c= 20;                    // local variable
		//System.out.println(b);
		System.out.println(c);
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		student x = new student();
		x.m1();
		x.m2();
		
	}
}
