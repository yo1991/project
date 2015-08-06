
public class MainFile {

	public static void main(String[] args) {
		NumberFactory number= new NumberFactory();
		
		writeAndScanNumber even= number.getNumber("even");
		writeAndScanNumber odd	= number.getNumber("odd");
		even.write();
		even.scan();
		odd.write();
		odd.scan();
		for(int i=0;i<5;i++){
			System.out.println(Even.evenNumbers[i]*Odd.oddNumbers[i]);
		}

	}

}
