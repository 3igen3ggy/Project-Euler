import java.math.*;

public class Main {
	public static void main(String[] args) {
		
		BigInteger number = new BigInteger("0");

		int sumMax = 0;
		
		for (int a = 2; a < 100; a++) {
			
			for (int b = 1; b < 100; b++) {
				int sum = 0;
				
				number = BigInteger.valueOf(a);
				number = number.pow(b);
				
				int d = number.toString().length();
				
				int i = 0;
				
				String num = number.toString();
				while (i < d) {
					sum += Character.getNumericValue(num.charAt(i));
					i++;
				}
				
				if (sum > sumMax) {
					sumMax = sum;
					System.out.println("a: " + a + ", b: " + b + ", sum of digits: " + sum);
					
				}
				
			}
			
		}
					
	}
}
