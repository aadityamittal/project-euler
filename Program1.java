package euler;
//find sum of multiples of 3 || 5 below 1000
public class Program1 {

	public static void main(String[] args) {
		
		int result=Sum(3,999)+Sum(5,999)-Sum(15,999);
		System.out.println(result);
	}
	static int Sum(int n,int p)
	{
		return n*(p/n)*((p/n)+1)/2;
	}
}
//Output:233168
