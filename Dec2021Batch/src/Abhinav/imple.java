package Abhinav;

public class imple implements A,b{
	
	public void q1() {
		System.out.println("run");
	}
	
	public void q2() {
		System.out.println("run");
	}
	public void m3() {
		System.out.println("run");
	}
	public void m4() {
		System.out.println("run");
	}
	
	public static void main(String[] args) {
		imple b = new imple();
		b.m3();
		b.m4();
		b.q1();
		b.q2();
	}
}
