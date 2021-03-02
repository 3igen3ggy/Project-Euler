public class Main {
	
	public static void main(String[] args) {
	long a = 1009900000L;
	
	while (true) {
		long pow = a * a;
		if (digit(pow, 2) != 2 && digit(pow, 3) == 9) {
			a += 100;
		} else if (digit(pow, 2) != 2) {
			a += 1000;
		}
		if (digit(pow, 0) == 1 && digit(pow, 2) == 2 && digit(pow, 4) == 3 && digit(pow, 6) == 4 && digit(pow, 8) == 5 && 
				digit(pow, 10) == 6 && digit(pow, 12) == 7 && digit(pow, 14) == 8 && digit(pow, 16) == 9 && digit(pow, 18) == 0) {
			System.out.println("----> a: " + a + ", a^2: " + pow + " <----");
			break;
		}
		if (digit(pow,0) == 2) {
			break;
		}
		System.out.println("a: " + a + ", a^2: " + pow);
		a++;
		}
	}
	
	public static int digit(long n, int d) {
		String aux = String.valueOf(n);
		return Integer.parseInt(String.valueOf(aux.charAt(d)));
	}
}
