import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOddEven {

	public static void main(String[] args) throws FileNotFoundException {
		int i, a, b;
		File even = new File("even.txt");
		File odd = new File("odd.txt");
		try (BufferedWriter bwEven = new BufferedWriter(new FileWriter(even));
				BufferedWriter bwOdd = new BufferedWriter(new FileWriter(odd))) {
			for (i = 0; i < 5; i++) {
				int y = (2 * (2 * i + 1));
				bwEven.write(y + "\n");
				y = 4 * i + 1;
				bwOdd.write(y + "\n");
			}

		} catch (IOException e) {
			System.out.println("Cannot Write: "+even.toString()+" or "+odd.toString());
			e.printStackTrace();
		}
		try (Scanner scE = new Scanner(even); Scanner scO = new Scanner(odd)) {

			while (scE.hasNextInt()) {
				a = scE.nextInt();
				b = scO.nextInt();
				System.out.println(a * b);
			}

		} catch (FileNotFoundException e) {
			System.out.println(even.toString()+" or "+odd.toString()+"File not found");
			e.printStackTrace();
		}
	}

}
