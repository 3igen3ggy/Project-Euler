package project;

import java.math.BigInteger;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		for (long i = 10; i < 100000000L; i++) {
			long a = 2 * i;
			long b = 3 * i;
			long c = 4 * i;
			long d = 5 * i;
			long e = 6 * i;
			
			if (digitsCheck(i, a)) {
				System.out.println("i: " + i + ", 2i: " + a);
				if (digitsCheck(i, b)) {
					System.out.print(" , 3i: " + b);
					if (digitsCheck(i, c)) {
						System.out.print(" , 4i: " + c);
						if (digitsCheck(i, d)) {
							System.out.print(" , 5i: " + d);
							if (digitsCheck(i, e)) {
								System.out.print(" , 6i: " + e);
								break;
							}
						}
					}
				}
			}
			
			
		}
		
	}
	
	public static boolean digitsCheck(long a, long b) {
		int aDigits = digits(a);
		int bDigits = digits(b);
		
		if (aDigits != bDigits) {
			return false;
		}
		
		ArrayList<Integer> aDigList = new ArrayList<Integer>();
		
		for (int i = 0; i < aDigits; i++) {
			aDigList.add(digit(a, i));
		}
		
		int i = 0;
		
		while (i < aDigits) {
			if (aDigList.contains(digit(b, i))) {
				i++;
				continue;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public static int digit(long a, int d) {
		String aux = String.valueOf(a);
		return Integer.parseInt(String.valueOf(aux.charAt(d)));
	}
	
	public static int digits(long a) {
		return (int) Math.log10(a) + 1;
	}

}
