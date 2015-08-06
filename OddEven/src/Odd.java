import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Odd implements writeAndScanNumber {
	static  public int[] oddNumbers= new int[5];
	File odd = new File("Odd.txt");
	@Override
	public void write() {
		
		try {
			BufferedWriter bwOdd = new BufferedWriter(new FileWriter(odd));
			for (int i = 0; i < 5; i++) {
				bwOdd.write((4 * i + 1) + "\n");
			}
			bwOdd.flush();
			bwOdd.close();
		} catch (IOException e) {
			System.out.println("Cannot Write: "+odd.toString());
			e.printStackTrace();
		}
	}

	public void scan() {
		try  {
			Scanner scanner = new Scanner(odd);
			
			for (int i = 0; i < 5; i++) {
			oddNumbers[i] = scanner.nextInt();
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println(odd.toString());
			e.printStackTrace();
		}
	
	}
}
