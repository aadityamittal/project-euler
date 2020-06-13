package euler;

public class jap {
	public static void main(String[] arg) { 
      int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}; 
      System.out.println(lcm(a)); 	} 

	public static long lcm(int[] array){ 
	        long lcm = 1; 
	        int d = 2; 
	          
	        while (true) { 
	            int c = 0; 
	            boolean loop = false; 
	              
	            for (int i = 0; i < array.length; i++) { 
	  
	                if (array[i] == 0) { 
	                    return 0; 
	                } 
	               
	                if (array[i] == 1) { 
	                    c++; 
	                }  
	                if (array[i] % d == 0) { 
	                    loop = true; 
	                    array[i] = array[i] / d; 
	                } 
	            } 
	            if (loop) { 
	                lcm = lcm * d; 
	            } 
	            else { 
	                d++; 
	            }  
	            if (c == array.length) { 
	                return lcm; 
	            } 
	        } 
	    } 
	}
//Output:232792560


