package akash;

public class TestClass  {
	

	
	public static void main(String[] args) {
		
		int a [] = {12,54,32,87,9,34,87};
		
		for(int i =0 ; i<a.length ; i++)
		{
			System.out.print(a[i] + ",");
		}
		
//		a[0]  = a [5]; lastIndex - 0
//		a[1]  = a [4]; lastIndex - 1
//		a[2]  = a [3]; lastIndex - 2
	
		for(int i = 0 ; i<(a.length/2) ; i ++)
		{
		int z ;
		z = a[i] ;
		a[i]= a[(a.length-1)-i];
		a[(a.length-1)-i] = z;
		
//		z = a[i] ;
//		a[i]= a[lastIndex-i];
//		a[lastIndex-i] = z;
		}
		
		System.out.println();
		for(int i =0 ; i<a.length ; i++)
		{
			System.out.print(a[i] + ",");
		}
		
//		int b = 34;
//		int c = 45;
//		System.out.println("b = "  +b);
//		System.out.println("c = "  +c);
//		
//		int x ;
//		x = b;
//		b  = c ;
//		c = x ;
//		System.out.println("b = "  +b);
//		System.out.println("c = "  +c);
//		
		
	
	
	}

}
