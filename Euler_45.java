import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
	
		Long n = 0L;
		Long p, h;
		Long t = 1000L;
		
		ArrayList<Long> P = new ArrayList<Long>();
		ArrayList<Long> H = new ArrayList<Long>();
		ArrayList<Long> TPH = new ArrayList<Long>();
		
		while(n < 1000000) {
			p = n * (3 * n - 1) /2;
			h = n * (2 * n - 1);
			
			P.add(p);
			H.add(h);
			n++;
			
			System.out.println("p number: " + p);
			System.out.println("h number: " + h);
		}
		
		n = 0L;
		while (t < Collections.max(P)) {
			t = n * (n + 1) / 2;
			if (P.contains(t) && H.contains(t)) {
				TPH.add(t);
				System.out.println(t);
				
			}
			n++;
			
			
		}
		
	}
}


