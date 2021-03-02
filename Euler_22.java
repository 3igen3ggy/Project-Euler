import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) {
	
		//BigInteger sum = new BigInteger("0");
		String[] names = importNames("names.txt");
		int size = names.length;
		Arrays.sort(names);
		long sum = 0;

		for (int i = 0; i < size; i++) {
			sum += sumName(names[i]) * (i + 1);
		}
		System.out.println(sum);

	}
	
	public static String[] importNames(String file) {
		String workingDir = System.getProperty("user.dir");
		String line = "";
		String filePath = workingDir + "/src/" + file;
		String[] names = null;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			
			while ((line = br.readLine()) != null) {
				names = line.split(",");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return names;
	}
	
	public static int sumName(String name) {
		int sum = 0;
		for (int i = 1; i < name.length() - 1; i++) {
			sum += (Character.codePointAt(name, i) - 64);
		}
		return sum;
	}
}
