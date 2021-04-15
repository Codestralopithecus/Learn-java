package week1Lab;

public class AsymptoticAnalysis {

	static void timeComplexityCalculator(double n) {
		
		// f(n) = 5 * n^2 + 6n + 12
		
		double quadRate;  // quadratic term
		double linRate;   // linear term
		double cRate;	   // constant term
		
		quadRate = (5 * n * n / ((5 * n * n) + (6 * n) + 12)) * 100;
		linRate = (6 * n / ((5 * n * n) + (6 * n) + 12)) * 100;
		cRate = 12 / ((5 * n * n) + (6 * n) + 12) * 100;
		
		System.out.format("Where n = %.2f\n quad term    : %f %%\n linear term  : %f %%\n constant term: %.2f %%\n\n", n, quadRate, linRate, cRate);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("==== Welcome to Asymptotic Analysis ====\nFor f(n) = 5 * n^2 + 6n + 12,\n");
		
		timeComplexityCalculator(1);
		timeComplexityCalculator(10);
		timeComplexityCalculator(100);
		timeComplexityCalculator(1000);
		timeComplexityCalculator(10000);
		timeComplexityCalculator(100000);		
	}

}
