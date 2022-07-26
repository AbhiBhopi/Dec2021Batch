package Abhinav;

public class Testdefault1 implements doc{       // interface method  implementation in class
	public void mart() {
		System.out.println("All shops open");   // declare body to interface method now body change
	}

	
	public static void main(String[] args) {
		Testdefault1 x = new Testdefault1();      // object of Testdefault1 class
		Testdefault y = new Testdefault();       // object of Testdefault class
		
		x.mart();
		x.Dmart();
		
		y.mart();
		y.Dmart();
	}
}
