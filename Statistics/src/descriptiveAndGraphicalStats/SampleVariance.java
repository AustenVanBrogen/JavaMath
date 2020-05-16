package descriptiveAndGraphicalStats;

public class SampleVariance {

	Number[] sampleSet;
	public SampleVariance(Number[] sampleSet)
	{
		this.sampleSet = sampleSet;
	}
	
	public static double getSampeVariance(double[] sampleSet, double mean)
	{
		double summation = 0;
		
		for(int i = 0; i < sampleSet.length; i++)
		{
			double result = ((double) sampleSet[i] - mean) / (sampleSet.length - 1);
			summation += result * result;
		}
		return summation;
	}
	
	public static double getStandardDeviation(double[] sampleSet, double mean)
	{
		double variance = getSampeVariance(sampleSet, mean);
		return Math.sqrt(variance);
	}
}
