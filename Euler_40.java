import java.math.*;

public class Main {
	public static void main(String[] args) {
		
		String num = "";
		
		int N = 185186;
		int mult = 1;
		for (int i = 1; i < N; i++) {
			num = num.concat(Integer.toString(i));
			System.out.println("i: " + i);
		}

		BigInteger number = new BigInteger(num);
		System.out.println("Number: " + number);
		int d = num.length();
		System.out.println("Digits: " + d);
		
		for (int i = 0; i <= 6; i++) {
			mult *= Character.getNumericValue(num.charAt((int) Math.pow(10, i) - 1));
			System.out.println(num.charAt((int) Math.pow(10, i) - 1));

			
		}
		System.out.println("Multiplied: " + mult);
	}
}
