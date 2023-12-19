public class GenThree{
	public static void main(String[] args){
		int min = Integer.parseInt(args[0]);
		int max = Integer.parseInt(args[1]);		
		int numOne = (int)((Math.random() * (max - min)) + min);
		int numTwo = (int)((Math.random() * (max - min)) + min);
		int numThree = (int)((Math.random() * (max - min)) + min);
		System.out.println(numOne);
		System.out.println(numTwo);
		System.out.println(numThree);
		System.out.println("The minimal generated number was " + (Math.min(numThree,(Math.min(numOne,numTwo)))));		
	}
}	
