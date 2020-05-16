package testDescriptiveAndGraphicalStats;
import descriptiveAndGraphicalStats.FivePointRating;;

public class TestFivePoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Number[] set = {43, 37, 50, 51, 58, 52, 45, 45, 58};
		//Number[] set = {56, 47, 49, 37, 38, 60, 50, 43, 43, 59, 50, 56, 54, 58};
		Number[] set = {53, 21, 32, 49, 45, 38, 44, 33, 32, 43, 53, 46, 36, 48, 39, 35, 37, 36, 39, 45};
		FivePointRating stuff = new FivePointRating(set);
		
		
		//System.out.println("Sorted set: " + stuff.getSortedSet());
		System.out.println(stuff.getStuffForAssignment());
	}
}
