public class Main {

	public static void main(String[] args) {
		
		int sumOfSquares = 0;
		int squareOfSum = 0;
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			
			sumOfSquares += i * i;
			
		}
		
		for (int i = 1; i <= 100; i++) {
			
			sum += i;
			
		}
		squareOfSum = sum * sum;
		
		System.out.println(squareOfSum - sumOfSquares);
	}

}
