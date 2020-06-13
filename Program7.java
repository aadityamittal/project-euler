package euler;
/*
 By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number

All even numbers except 2 are non-primes
To check for prime we have to check just upto the square root of the number
 */
public class Problem7 {

	public static void main(String[] args) {
		int np=1;
		int n=1;
		while(np<10001)
		{
			n+=2;
			if(isPrime(n))
				np++;
		}
		System.out.println(n);
	}
	static boolean isPrime(int n)
	{
		if(n<=1)
			return false;
		else if(n==2)
			return true;
		else if(n%2==0)
			return false;
		else {
			int c=3;
			while(c*c<=n)
			{
				if(n%c==0)
					return false;
				c+=2;
			}
			return true;
		}
	}
}
//Output:104743