import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		
		BigInteger a = new BigInteger("1");
		BigInteger sum = new BigInteger("0");

		
		int n = 1000;
	
		
		for (int i = 1; i <= n; i++) {
			
			a = BigInteger.valueOf(i);
			a = a.pow(i);
			sum = sum.add(a);
		}
				
		System.out.println("Number: " + sum);

	}
}
