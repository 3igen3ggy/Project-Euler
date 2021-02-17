//i: 534086182, number of curious numbers: 6
//Sum of all: 92605
//[24, 145, 5761, 5762, 40328, 40585]

import java.util.*;

public class Main {
	public static void main(String[] args) {

		long i = 10L;
		long sumall = 0L;
		ArrayList<Long> list = new ArrayList<Long>();
				
		while (i < 1000000000) {
			int j = 1;
			int d = digits(i);
			long sum = 0L;
			
			
			
			while (j <= d) {
				
				sum += factorial(digit(i,j));
				
				if (i == sum) {
					sumall += sum;
					list.add(sum);
				}
				
				j++;
			}
			System.out.println();
			System.out.println("i: " + i + ", number of curious numbers: " + list.size());
			System.out.println("Sum of all: " + sumall);
			System.out.println(list);
			i++;
		}
		
	}
	
	public static long factorial(long n) {
		long ans = 1;
		if (n == 0 || n == 1) {
			return ans;
		} else {
			long i = 1L;
			while (i <= n) {
				ans *= i;
				i++;
			}
		} 
		return ans;
	}
	
	public static int digits(long n) {
		return (int) Math.floor(Math.log10(n) + 1);
	}
	
	public static int digit(long a, int n) {
		
		int c = (int) a % (int) Math.pow(10, n);
		c = (int) (c / (int) Math.pow(10, n - 1));
		return c;
	}
	
}


