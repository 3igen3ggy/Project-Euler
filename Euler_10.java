public class Main {

	public static void main(String[] args) {

		long sum = 0L;
		
		for (long i = 2L; i < 2000000; i++) {
			
			if (isPrime(i)) {
				
				sum += i;
				System.out.println("i: " + i + ", sum: " + sum);
				
			}
			
		}
	
		System.out.println("Sum: " + sum);
	}
	
	public static boolean isPrime(long a) {
		long d = 2;
		if (a == 0 || a == 1) {
			return false;
		}
		while (d <= a / 2) {
			if (a % d == 0) {
				return false;
			}
			d++;
		}
		return true;
	}
	
}
