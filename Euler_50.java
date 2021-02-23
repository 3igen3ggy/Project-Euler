import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		long GP = 10000L;
		long length = 1;
		long maxLength = 1;
		long maxNum = 1000000;
		long sum = 0;
		long saveSum = 0;
		long saveLength = 0;
		long firstPrime = 0;
		
		ArrayList<Long> primesList = generatePrimes(GP);
		ArrayList<Long> sumList = new ArrayList<Long>();
		
		System.out.println(GP + " PRIMES GENERATED");
		System.out.println();
		
		
		
		for (int i = 0; i < GP; i++) {
		sumList.clear();
		int j = i;
		
		sumList.add(primesList.get(j));
		j++;
		while (j < GP) {
			
			sumList.add(primesList.get(j));
			
			sum = sumList(sumList);
			boolean prime = isPrime(sum);
			
			if (sum > maxNum) {
				break;
			}
			
			if (prime) {
				length = sumList.size();
				
				
				if (length > maxLength) {
					maxLength = length;
					saveSum = sum;
					saveLength = length;
					firstPrime = sumList.get(0);
					
					System.out.println(saveSum + " is a prime number, it is a sum of " + saveLength + ", first Prime is: " + firstPrime + " <-- NEW MAX");
	
					
					
				} else {
					
					System.out.println("i: " + i + ", j: " + j);
				}
				
			}
			
			
			j++;
		}	
		}
		System.out.println();
		System.out.println(saveSum + " is a prime number, it is a sum of " + saveLength + ", first Prime is: " + firstPrime + " <-- NEW MAX");
	}
	
	public static boolean isPrime(long a) {
		long d = 2;
		a = Math.abs(a);
		if (a == 0 || a == 1) {
			return false;
		}
		while (d <= a / 2) {
			if (a % d == 0) {
				return false;
			}
			d++;
		}
		return true;
	}
	
	public static ArrayList<Long> generatePrimes(long amount) {
		
		ArrayList<Long> primesList = new ArrayList<Long>();
		long n = 0;
		long i = 2;
		
		while (n <= amount) {
			if (isPrime(i)) {
				primesList.add(i);
				n++;	
			}
			i++;
			
		}
		return primesList;
	}
	
	public static long sumList(ArrayList<Long> list) {
		
		int n = list.size();
		long sum = 0L;
		
		for (int i = 0; i < n; i++) {
			
			sum += list.get(i);
		
		}
		return sum;
		
	}
}
