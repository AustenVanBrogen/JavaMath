package testDescriptiveAndGraphicalStats;
import descriptiveAndGraphicalStats.SampleVariance;

public class GetTheSampleVariance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] set = {43, 37, 50, 51, 58, 52, 45, 45, 58, 130};
		
		double result = SampleVariance.getSampeVariance(set, 50.5);
		
		System.out.println("The sample variance is: " + result);
		
		result = SampleVariance.getStandardDeviation(set, 50.5);
		System.out.println("The standard deviation is: " + result);
		

	}

}
