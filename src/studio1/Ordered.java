package studio1;

import support.cse131.ArgsProcessor;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int x = ap.nextInt("Value for x?");
		int y = ap.nextInt("Value for y?");
		int z = ap.nextInt("Value for z?");
		boolean comparisonOne = x>y;
		boolean comparisonTwo = y>z;
		boolean comparisonThree = x<y;
		boolean comparisonFour = y<z;
		boolean isOrdered = (comparisonOne && comparisonTwo) || (comparisonThree && comparisonFour);

		System.out.println(isOrdered);



	}

}
