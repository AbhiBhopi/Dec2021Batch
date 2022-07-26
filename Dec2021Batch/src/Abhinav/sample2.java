package Abhinav;

public class sample2 {
	
	public static void addition(int a,int b) {
		int c = a+b;
		System.out.println("addition = "+c);
		
	}
	
	public void multiplication(int a, int b) {
		
		int c = a*b;
		System.out.println("multiplication = "+c);
	}
	

	public static void main(String[] args) {
		
		addition(10,30);
		
		sample2 x = new sample2();
		x.multiplication(30,40);
		
		

}
}