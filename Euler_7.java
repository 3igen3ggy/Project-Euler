public class Main {

	public static void main(String[] args) {
		
		int i = 1;
		int n = 2;
		while (true) {
			
			if (isPrime(n)) {
				System.out.println(i + ": " + n);
				i++;
			}
			
			n++;
			if(i > 10001) {
				break;
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
