
public class Main {

	public static void main(String[] args) {
		
		int sum = 0;
			
		for (int i = 1; i < 10000; i++) {
			
			if (checkAmicable(i)) {
	
				sum += i;
				
			}
			
		}
	System.out.println(sum);
	
	}
	
	public static int sumDivisors(int n) {
		int sum = 0;
		
		for (int i = 1; i <= n / 2; i++) {
			
			if (n % i == 0) {
				
				sum += i;
				
			}
			
		}
		return sum;
	}
	
	public static boolean checkAmicable(int a) {
		
		int b = sumDivisors(a);
		if (sumDivisors(a) == b && sumDivisors(b) == a && a != b) {
			
			return true;
			
		}
		return false;
	}
}
