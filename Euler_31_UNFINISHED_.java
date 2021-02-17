import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
	
		int p1 = 1;
		int p2 = 2;
		int p5 = 5;
		int p10 = 10;
		int p20 = 20;
		int p50 = 50;
		int p100 = 100;
		int p200 = 200;
		
		int p1num = 0;
		int p2num = 0;
		int p5num = 0;
		int p10num = 0;
		int p20num = 0;
		int p50num = 0;
		int p100num = 0;
		int p200num = 0;
		
		int obj = 200;
		
		int counter = 0;
		int i = 0;
		
		ArrayList<String> comb = new ArrayList<String>();
		
		for (int a = 0; a < p1; a++) {
			for (int b = 0; b < p2; b++) {
				for (int c = 0; c < p5; c++) {
					for (int d = 0; d < p10; d++) {
						for (int e = 0; e < p20; e++) {
							for (int f = 0; f < p50; f++) {
								for (int g = 0; g < p100; g++) {
									for (int h = 0; h < p200; h++) {
										
										if (obj == 0) {
											
											String combination = "p1: " + p1num + ", p2: " + p2num + ", p5: " + p5num + ", p10: "
											+ p10num + ", p20: " + p20num + ", p50: " + p50num + ", p100: " + p100num;
												
													
											if (!comb.contains(combination)) {
												comb.add(combination);
												System.out.println(combination);
												System.out.println(comb.size());
												System.out.println();
											
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
							
			
		
		
//		
//		String combination = "p1: " + p1num + ", p2: " + p2num + ", p5: " + p5num + ", p10: " + p10num + ", p20: " + p20num + ", p50: " + p50num +
//				", p100: " + p100num;
//		System.out.println(combination);
//		
//		
//		if (comb.contains(combination)) {
//			counter++;
//			i++;
//		} else {
//			comb.add(combination);
//			counter = 0;
//			i++;
//		}
//		
//		System.out.println("i: " + i + ", counter: " + counter + ", combinations: " + comb.size());
//		
//		if (counter > 10000) {
//			System.out.println("i: " + i + ", counter: " + counter + ", combinations: " + comb.size());
//		}
//		System.out.println();
	}
}


