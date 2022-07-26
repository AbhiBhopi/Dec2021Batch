package Abhinav;

public class Super1 extends Super{
	
	int a = 80;  // global 
	
	public void test() {
		
		int a = 100;// local
	    System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
	
	
		public static void main(String[] args) {
			
			Super1 x = new Super1();
			
			x.test();
	}

}
