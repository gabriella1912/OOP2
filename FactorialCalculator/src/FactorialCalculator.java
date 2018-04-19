
public class FactorialCalculator {

	public FactorialCalculator() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		calculateFactorial(100);
		
		System.out.println();

	}

	public static void calculateFactorial(int limit) {
		long product=1;
		for (int i = 1; i < limit; i++) {
			
			product*=i;
		System.out.println(product);
		}
	}
	
}
