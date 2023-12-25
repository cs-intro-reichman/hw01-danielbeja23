public class Coins{
	public static void main(String[] args){
		int cents = Integer.parseInt(args[0]);
		System.out.println("Use " + (cents / 25) + " quarters and " + (cents % 25) + " centes"); 	
	}
}	
