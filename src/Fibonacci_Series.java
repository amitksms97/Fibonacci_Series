import java.util.*;
public class Fibonacci_Series {

	int n;
	Scanner sc=new Scanner(System.in);
	public Fibonacci_Series() {
		System.out.println("Enter the limit");
		n=sc.nextInt();
	}
	public void computation()
	{
		int sum=0, p1=1, p2=0;
		for(int i=1; i<=n; i++)
		{
			sum=p1+p2;
			System.out.print(sum +" ");
			p1=p2;
			p2=sum;
		}
	}
	public static void main(String[] args) {
		Fibonacci_Series obj = new Fibonacci_Series();
		obj.computation();
	}

}
