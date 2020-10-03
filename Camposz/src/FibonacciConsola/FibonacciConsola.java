package FibonacciConsola;

public class FibonacciConsola 
{

	public static void main(String[] args) 
	{
		int v1=0;
		int v2=1, v3;
		int i=1;
		System.out.println("Serie Fibonacci");
		while (i<10) 
		{
		v3=v1+v2;
		v1=v2;
		v2=v3;
		i++;
		System.out.println(v3);

		}
	}

}
