package euler;
/*
 The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million
 */
public class Program10 {

	public static void main(String[] args) {
		long sum=2L,n=2000000,k=3;
		while(k<2000000)
		{
			if(isPrime(k))
				sum=sum+k;
			k=k+2;
		}
		System.out.println(sum);
	}
	static boolean isPrime(long m) {
		long c=3;
		while(c*c<=m)
		{
			if(m%c==0)
				return false;
			c+=2;
		}return true;
	}

}
//Output:142913828922
