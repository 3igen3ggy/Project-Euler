import java.math.*;

public class Main {
	public static void main(String[] args) {
		
	BigInteger a = new BigInteger("1");
	BigInteger sum = new BigInteger("0");
	BigInteger b = new BigInteger("0");
	a = a.pow(1000);
	
	
	
	//calculating factorial
	
	for (int i = 1; i <= 100; i++) {
		b = BigInteger.valueOf(i);
		a = a.multiply(b);
		
	}
	
	int dig = getDigitCount(a);
	
	System.out.println(a);
	
		for (int i = 0; i < dig; i++) {
			
			
			b = BigInteger.valueOf(Character.getNumericValue(a.toString().charAt(i)));
			System.out.println("Digit " + i + ": " + b);
			sum = sum.add(b);
		}
		System.out.println(sum);
	
	}
	
	public static int getDigitCount(BigInteger number) {
		  double factor = Math.log(2) / Math.log(10);
		  int digitCount = (int) (factor * number.bitLength() + 1);
		  if (BigInteger.TEN.pow(digitCount - 1).compareTo(number) > 0) {
		    return digitCount - 1;
		  }
		  return digitCount;
		}
	
}


