public class Main {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		while(fibonacci(i) < 4000000) {
			
			if (fibonacci(i) % 2 == 0) {
				sum += fibonacci(i);
			}
			i++;
		}
		System.out.println(sum);
		
	}
	
	public static int fibonacci(int n) {
		if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 2;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
		
	}

}
