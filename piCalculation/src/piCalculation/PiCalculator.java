package piCalculation;

public class PiCalculator{

	public PiCalculator() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		// Wallis Formula= (2n/2n-1)*(2n/2n+1)
		
	 
		double pi=2;
				
		for (double i=1 ; i <=10000; i++) {
			
			double WallisLeft=(2*i)/(2*i-1);
			double WallisRight=(2*i)/(2*i+1);
			
			pi=pi*WallisLeft*WallisRight;
			System.out.println("current pi: "+pi);
		
		}
		
		System.out.println("The value of estimated pi is: "+ pi +
				"/n the value of real pi is:"+ Math.PI);

		
	}
	
	

}
