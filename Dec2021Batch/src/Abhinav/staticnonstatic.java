package Abhinav;

public class staticnonstatic {
	
	static int a=10;                  // static variable 
	       int b=20;                  // non static variable
	       
	       staticnonstatic(){            // user define constructor without argument
	    	   a=23;
	    	   b=75;
	       }
	       
	       
	       staticnonstatic(int z){   // user define cons with argumnt
	    	   a=56;
	    	   b=60;
	       }
	       
	       staticnonstatic(char h){    // user define constr char type arg
	    	  
	       }
	       
	       public static void main(String[] args) {
			System.out.println(a);      // a will directly call bcoz static int
			//System.out.println(b);    // not call bcoz non static
			
			staticnonstatic x = new staticnonstatic();
			System.out.println(x.b);
			System.out.println(x.a);  // a ki value reassign hogi not initialise
			
			staticnonstatic y = new staticnonstatic(58);
			System.out.println(y.b);
			System.out.println(y.a);
			
			staticnonstatic z = new staticnonstatic('#');
			
			System.out.println(a);
			System.out.println(z.b);
		}
	       
	

}
