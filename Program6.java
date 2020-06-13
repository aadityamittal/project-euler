package euler;
/*
 Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 1^2+2^2+3^2+...+n^2=n(n+1)(2n+1)/6
 1+2+3+...+n=n(n+1)/2
 */
public class Program6 {

	public static void main(String[] args) {
		int n=100;double k=Math.pow((n*(n+1)/2),2),l=n*(n+1)*(2*n+1)/6;
		System.out.println("(1+2+3+...+n)^2="+k);
		System.out.println("1^2+2^2+3^2+...+n^2="+l);
		System.out.println("Reqd difference="+(k-l));
	}

}
Output:25164150