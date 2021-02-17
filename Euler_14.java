
public class Main {

	public static void main(String[] args) {
		
		long start = 2;
		long i = 13;
		long startMax = 0;
		long chain = 0;
		long maxChain = 0;
		
		while (start < 1000000) {
			chain = 0;
			i = start;
			do {
				i = collatz(i);
				chain++;
				
			} while (i != 1);
			
			if (chain > maxChain) {
				
				maxChain = chain;
				startMax = start;
				
			}
			start++;
		}
		System.out.println("startMax: " + startMax + ", maxChain: " + maxChain);
	}
	
	public static long collatz(long i) {
		
		if (i % 2 == 0) { 
			i = i / 2;
		} else if (i % 2 == 1) {
			i = 3 * i + 1;
		}
		return i;
	}
}
