public class Main {

	public static void main(String[] args) {
		long a = 600851475143L;
		
		for (long i = 2L; i < a / 2; i++) {
			
			if (a % i == 0 && isPrime(i)) {
				System.out.println(i);
			}
			
		}
		
		
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
