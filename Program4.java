package euler;
/*
 A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Program4 {

	public static void main(String[] args) {
		int m=1,l=0,b=0;
		for(int i=999;i>=100;i-=1)
		{
			for(int j=999;j>=100;j--) {
			int p=i*j,d,rev=0;
			
			int k=p;
			while(p!=0)
			{
				d=p%10;
				rev=rev*10+d;
				p=p/10;
			}
			if(rev==k&&rev>m)
			{
				m=rev;
				l=i;
				b=j;
			}
		}}
		System.out.println(l+"*"+b+"="+m);
	}

}
//Output:906609
