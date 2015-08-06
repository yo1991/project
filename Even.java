import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Even implements writeAndScanNumber {
	File even = new File("even.txt");
	static public int[] evenNumbers = new int[5];
	
	@Override
	public void write() {

		try {
			BufferedWriter bwEven = new BufferedWriter(new FileWriter(even));
			for (int i = 0; i < 5; i++) {
				bwEven.write(2 * (2 * i + 1) + "\n");
			}
			bwEven.flush();
			bwEven.close();
		} catch (IOException e) {
			System.out.println("Cannot Write: " + even.toString());
			e.printStackTrace();
		}
	}

	public void scan() {
		try {
			Scanner scanner = new Scanner(even);
			
			for (int i = 0; i < 5; i++) {
				evenNumbers[i] = scanner.nextInt();
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println(even.toString());
			e.printStackTrace();
		}

	}
}
