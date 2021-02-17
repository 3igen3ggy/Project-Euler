
public class Main {
	public static void main(String[] args) {
		
		long a = 10L;
		int i = 0;
		long sums = 0;
		
		while (a < 1000000) {
			if (sumCheck(a)) {
				System.out.println(a);
				
				sums += sum(a);
			}
			a++;
		}

		
		System.out.println("Sum: " + sums);
	}
	
	public static int digit(long a, int n) {
		
		int c = (int) a % (int) Math.pow(10, n);
		
		c = (int) (c / (int) Math.pow(10, n - 1));
		
		return c;
		
	}
	public static int digits(long a) {
		return (int) Math.floor(Math.log10(a)) + 1;
	}
	
	public static boolean sumCheck(long a) {
		
		int n = digits(a);
		int i = 1;
		int sum = 0;
		while(i <= n) {
			
			sum += Math.pow(digit(a, i), 5);
			i++;
		}
		
		if (sum == a) {
			return true;
		} else {
			return false;
		}
		
	}
	
public static long sum(long a) {
		
		int n = digits(a);
		int i = 1;
		int sum = 0;
		while(i <= n) {
			
			sum += Math.pow(digit(a, i), 5);
			i++;
		}
		
		if (sum == a) {
			return a;
		} else {
			return a;
		}
		
	}
}


