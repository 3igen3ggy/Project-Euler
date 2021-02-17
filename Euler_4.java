public class Main {

	public static void main(String[] args) {
		
		int maxpal = 0;
		
		for (int i = 100; i < 1000; i++) {
			
			for (int j = 100; j < 1000; j++) {
				
				if (palindrome(i * j) && i * j > maxpal) {
					
					maxpal = i * j;
					System.out.println("Maxpal: " + maxpal + " i: " + i + " j: " + j);
					
				}
			}
		}
	}
	
	public static boolean palindrome(int n) {
		boolean pal = false;
		int i = 0;
		int d = (int) Math.floor(Math.log10(n) + 1);
		while (i < d / 2) {
			if (digit(n, i + 1) != digit(n, d - i)) {
				pal = false;
				return pal;

			} else {
				pal = true;

			}
			i++;
		}
		return pal;
	}
	
	public static long digit (long N, int dig) {
		int i = 1;
		while (i < dig) {	
			N = N / 10;
			i++;
		}
		return N % 10;
	}

}
