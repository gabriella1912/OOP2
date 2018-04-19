
public class NumberPairer {

	public NumberPairer() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		int NumberOfTwinPrimes=0;
		NumberOfTwinPrimes=calculatePairs();
		
		System.out.println(NumberOfTwinPrimes);

	}

	
	public static int calculatePairs() {
		int TwinPrimeNumber=0;
		
		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= 100; j++) {
				if (isPrime(i)&& isPrime(j) && (i-2==j)) {
					TwinPrimeNumber++;
				}
			}
		}
		
		return TwinPrimeNumber;
		
		
	}
	
	private static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2) {
        	System.out.println(i);
            if (num % i == 0) return false;}
        return true;
}
	
	
}
