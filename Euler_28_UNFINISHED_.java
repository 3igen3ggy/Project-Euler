import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		
		
		
		
		
		printer(reprint(generateSpiral(2)));
	
		//System.out.println(Arrays.deepToString(reprint(generateSpiral(2))));
		
		
		
		
		
		
	}
	
	public static void printer(int[][] arr) {
		int N = arr.length;
		for (int i = 0; i < N; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
	
	public static int[][] generateSpiral(int N) {
		
		int[][] arr = new int[2 * N - 1][2 * N - 1];
		
		if (N == 1) {
			arr[0][0] = 1;
			
		} else {
			arr = reprint(generateSpiral(N - 1));
		//	int[][] arrAux = generateSpiral(N - 1);
			int counter = 0;
			if (N == 2) {
				counter = arr[0][0];
			} else {
				counter = arr[1][N - 1];
			}
			
			counter++;
			arr[N - 1][N] = counter;
			
			for (int i = 1; i < N; i++) {
				counter++;
				arr[i][N] = counter;
				
			}
			
			
			
//			for (int i = N; i >= 0; i--) {
//				counter++;
//				arr[N][i] = counter; 
//			}
//			
//			for (int i = N - 1; i >= 0; i--) {
//				
//				counter++;
//				arr[i][0] = counter; 
//				
//			}
//			
//			for (int i = 1; i <= N; i++) {
//				
//				counter++;
//				arr[0][i] = counter; 
//				
//			}
		}
		
		return arr;
	}
	
	public static int[][] reprint (int[][] arr) {
		int N = arr.length;
		
		int[][] newArray = new int[N + 2][N + 2];
		
		for (int i = 0; i < N; i++) {
			
			for (int j = 0; j < N; j++) {
				
				newArray[i + 1][j + 1] = arr[i][j];
				
			}
			
		}
		
		return newArray;
		
	}
}


