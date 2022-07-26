package Abhinav;

public class This {   // used to access global variable from same class
	
	int a =10;  // global variable
	
	public void test() {
		
		int a = 20;   // local variable 
		
		System.out.println(a);
		System.out.println(this.a);
	}
	
	public static void main(String[] args) {
		This x = new This();
		x.test();
	}

}
