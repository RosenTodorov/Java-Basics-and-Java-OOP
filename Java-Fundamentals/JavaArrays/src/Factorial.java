
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f = 234.56F;
		short s = (short)f;
		int b1 = (int) f;
		char c = (char)70000;
		int b = c;
		byte a = (byte)130;
		String x = "    hi   x  ";
		
		long longNumber = 20;
		int intNumber = (int) longNumber;
		System.out.println(intNumber);

		int intNumber1 = 10;
		long longNumber1 = intNumber1;
		System.out.println(longNumber1);
		
		float floatNumber = 10.5f;
		double doubleNumber = floatNumber;		
        System.out.println(doubleNumber);

        double doubleNumber1 = 11.5;
        float floatNumber1 = (float) doubleNumber1;
        System.out.println(floatNumber1);
		
		System.out.println(s);	  
		System.out.println(b1);
		System.out.println(b);	
		System.out.println(a);	
		System.out.println(x.trim());	
		
		for (int i = 0, j = 0; i < 3;) {
			   System.out.println(i++ + ".."); //prints 0..1..2
		}


	    for (int i = 0; i < 3;) {
			   System.out.println(++i + ".."); //prints 1..2..3
	    }
	    
	    int j;
	    for (j = 0; j < 10;) {
	    	j++;
	    }
	    
	    switch(j){
	       case 0: j = j + 1;
	       case 1: j = j + 2;
	       break;
	       case 10: j = j + 10;
	       break;
	       default: System.out.println("No Answer");
	       break;
	    }
	    System.out.println(j);
	  
	    int u = 10;    
	    if((--u < 10)? true : false) {
	    	System.out.println("One");
	    }
	    if (u < 10) {
	    	System.out.println("Two");
	    }
	}
}
