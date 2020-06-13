package euler;
/*
 A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a^2 + b^2 = c^2
For example, 3^2 + 4^2 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 */
public class Program9 {

	public static void main(String[] args) {
	   int circum=1000,a=0,b=0,c=0;
	   boolean loop=false;
	   for(a=1;a<1000;a++)
	   {
		   for(b=1;b<1000;b++)
		   {
			   c=circum-a-b;
			   if(a*a+b*b==c*c)
			   {
				   loop=true;
				   break;
			   }
		   }
		   if(loop)
		   {
			   break;
		   }
	   }
	   System.out.println(a*b*c);
	}

}
Output:31875000