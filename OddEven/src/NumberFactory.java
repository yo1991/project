
public class NumberFactory {
	public writeAndScanNumber getNumber(String type){
		
		if(type==null){
			return null;
		}else if(type.equalsIgnoreCase("Odd")){
			return new Odd();
		}else if(type.equalsIgnoreCase("Even")){
			return new Even();
		}
		return null;
	}

}
