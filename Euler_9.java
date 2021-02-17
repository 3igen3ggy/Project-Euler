public class Main {

	public static void main(String[] args) {

		for (int c = 1; c < 1000; c++) {
			
			for (int b = 1; b < c; b++) {
				
				for (int a = 1; a < b; a++) {
					
					if (a * a + b * b == c * c) {
						int sum = a + b + c;
						if (sum == 1000) {
							
							System.out.println("a: " + a + ", b: " + b + ", c: " + c + ", Sum: " + sum);
							int prod = a * b * c;
							System.out.println("Product: " + prod);
							
						}
						
					}
					
				}

			}
			
		}
	
	}
	
}
