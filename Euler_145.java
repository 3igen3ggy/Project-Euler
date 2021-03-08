package project;

import java.math.BigInteger;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		int i = 10;
		int counter = 0;
		
		while (i < 1000000000) {
			if (isReversible(i)) {
				System.out.println("i: " + i + ", counter: " + counter);
				counter++;
			}
			
			i++;
		}
		System.out.println(counter);		
		
	}
	
	public static boolean isReversible(long n) {
		
		int d = digits(n);
		
		if (d != digits(reverse(n))) {
			return false;
		} else {
			long sum = n + reverse(n);
			d = digits(sum);
			System.out.println("i: " + n + ", rev(n): " + reverse(n) + ", sum: " + sum);
			for (int j = 0; j < d; j++) {
				if (!isOdd(digit(sum, j))) {
					return false;
				}	
			}
			return true;
		}
	}
	
	public static long reverse(long n) {
		int d = digits(n);
		String aux = String.valueOf(n);
		String num = "";
		
		for (int i = d - 1; i >= 0; i--) {
			num = num.concat(String.valueOf(aux.charAt(i)));
		}
		
		return Integer.parseInt(num);
	}
	
	public static int digits(long n) {
		return (int) Math.log10(n) + 1;
	}
	
	public static int digit(long n, int d) {
		String aux = String.valueOf(n);
		return Integer.parseInt(String.valueOf(aux.charAt(d)));
	}
	
	public static boolean isOdd(int d) {
		if (d == 0 || d == 2 || d == 4 || d == 6 || d == 8) {
			return false;
		} else {
			return true;
		}
	}

}
