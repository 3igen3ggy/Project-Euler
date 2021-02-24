import java.math.*;

public class Main {
	public static void main(String[] args) {
		
		BigInteger a = new BigInteger("28433");
		BigInteger b = new BigInteger("2");
		int c = 7830457;
		BigInteger d = new BigInteger("1");
		BigInteger tenZeros = new BigInteger("10000000000");
		BigInteger result = new BigInteger("0");

		result = b.pow(c);

		result = result.multiply(a);
		result = result.add(d);
		
		System.out.println(result.mod(tenZeros));
	}
}
