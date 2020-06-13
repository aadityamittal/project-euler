package euler;
//largest prime factor
public class Program3 {

	public static void main(String[] args) {
		long n=600851475143L;
		long result=0;
		long [] a=new long[2];
		for(long i=2;i*i<n;i++)
		{  
			if(n%i==0) {
				a[0]=i;
				a[1]=n/i;
				for(int k=0;k<2;k++)
				{
					boolean isPrime=true;
					for(int j=2;j*j<a[k];j++)
						if(a[k]%j==0)
							{isPrime=false;break;}
					if(isPrime&&a[k]>result)
						result=a[k];
				}
			}
		}System.out.println(result);
		//Also any nos can be expressed as prdt of primes
		int zz=find(n);
		System.out.println(zz);
	}
static int find(long p)
{
	int counter=2,largestfactor;//2 is the smallest prime number
	while(counter*counter<=p) {
		if(p%counter==0)
		{
			p=p/counter;   
			//System.out.println(counter);
		}
		else counter++;
	}return (int)p;
}
}
//Output:6857
