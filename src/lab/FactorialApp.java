package lab;

public class FactorialApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println(accumulatedsum(5));
		System.out.println(factorial(4));
		
		double[] array = {5, 12, 4, 10};
		System.out.println(min(array));
		System.out.println(max(array));
		System.out.println(ave(array));
	
	}
	
	public static int accumulatedsum (int n){
		if (n == 1){
			return 1;
		}
		
		int[] num = new int[n-1];

		int sum = 0;
		for (int x=0; x < n; x++){
					sum =  sum + num[x];
		}
		return sum;		
	}
	
	
	public static int factorial (int n){
		if (n == 0 || n == 1){
			return 1;
		}
		return (factorial(n-1) * n);
	}

	public static double min(double[] numbers){
		
		double minimum=numbers[0];
		
		for (int x=1; x < numbers.length; x++){
			if (numbers[x] < minimum){
				minimum = numbers[x];
			}
		}		
		return minimum;
		
	}
	
	public static double max(double[] numbers){
		
		double maximum=numbers[0];
		
		for (int x=1; x < numbers.length; x++){
			if (numbers[x] > maximum){
				maximum = numbers[x];
			}
		}		
		return maximum;
		
	}
	
	public static double ave(double[] numbers){
		
		double sum = 0;
		
		for (int x=0; x < numbers.length; x++){
			sum = sum + numbers[x];
		}		
		return (sum/numbers.length);
		
	}
	
	
}
