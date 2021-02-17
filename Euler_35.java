import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
	
		int a = 2;

		long counter = 0L;

		ArrayList<Integer> List = new ArrayList<Integer>();
		
		while (a < 1000000) {
			if(isRotPrime(a)) {
				List.add(a);
				counter++;
			}
			System.out.println("Checking number: " + a + ", circular primes: " + counter);
			a++;
		}
		System.out.println(List);
		
	}
	
	public static boolean isRotPrime(int a) {
		
		int d = digits(a);
		int i = 1;

		while (i <= d) {
			if (!isPrime(a)) {
				return false;
			}		
			a = rotate(a);
			i++;
		}
		System.out.println(a + " is a rotational prime!");
		return true;
		
	}
	
	public static boolean isPrime(long a) {
		long d = 2;
		a = Math.abs(a);
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
	
	public static int digit(long a, int n) {
		
		int c = (int) a % (int) Math.pow(10, n);
		
		c = (int) (c / (int) Math.pow(10, n - 1));
		
		return c;
		
	}
	
	public static int digits(long a) {
		return (int) Math.floor(Math.log10(a)) + 1;
	}
	
	public static int rotate(int a) {
		int d = digits(a);
		int b = 0;
		int newd = 0;
		
		for (int i = d; i > 1; i--) {
			b+= Math.pow(10, i - 1) * digit(a, i - 1);
		}
		b += digit(a,d);
		
		newd = digits(b);
		
		if (newd < d) {
			
			b *= 10;
			
		}
		
		return b;
	}
}


