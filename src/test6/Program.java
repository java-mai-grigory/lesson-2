package test6;

public class Program {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		
		int N = 100;
		
		double dx; 
		
		double S = 0;
		dx = (double)(b - a) / N;   //Выполняем приведение числителя
		for(int i = 0; i < N; i++)
		{
			S += f(0.5 * dx  + i * dx);
		}
		
		System.out.println(4 * S * dx);;

	}
	
	public static double f(double x)
	{
		return Math.sqrt(1 - x * x);
	}

}
