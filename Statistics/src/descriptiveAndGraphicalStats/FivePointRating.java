package descriptiveAndGraphicalStats;
import java.util.Arrays;

public class FivePointRating {

		private double q1;
		private double q3;
		private double mean;
		private double median;
		private double iqr;
		private double standardDev;
		private Number[] sortedSampleSet;
		
		public FivePointRating(Number[] sampleSet)
		{
			if(sampleSet == null || sampleSet.length == 0)
			{
				throw new IllegalArgumentException();
			}
			
			sortedSampleSet = sampleSet;
			Arrays.sort(sortedSampleSet, 0, (sampleSet.length));
			//System.out.println(getSortedSet());
			
			mean = findMean(sortedSampleSet);
			median = findMedian(sortedSampleSet);
			q1 = findQ1(sortedSampleSet);
			q3 = findQ3(sortedSampleSet);
			iqr = findIQR(q1, q3);
			standardDev = findStandardDeviation(sortedSampleSet, mean);
		}
		
		private double findMedian(Number[] givenSet)
		{
			double someMedian = 0;
			int midpoint = givenSet.length / 2;
			if(givenSet.length != 0)
			{
				someMedian = givenSet[midpoint].doubleValue();
			}
			else
			{
				someMedian = (givenSet[midpoint].doubleValue() + givenSet[midpoint + 1].doubleValue());
			}
			return someMedian;
		}
		
		private double findMean(Number[] givenSet)
		{
			double someMean = 0;
			
			for(int i = 0; i < givenSet.length; i++)
			{
				someMean += givenSet[i].doubleValue();
			}
			
			someMean /= givenSet.length;
			return someMean;
		}
		
		private double findQ1(Number[] givenSet)
		{
			double someQ1 = 0;
			int setMidpoint = givenSet.length / 2;
			Number[] q1Array;

			
			if(givenSet.length % 2 != 0)
			{
				q1Array = Arrays.copyOfRange(givenSet, 0, setMidpoint);
			}
			else
			{
				q1Array = Arrays.copyOfRange(givenSet,  0,  setMidpoint + 1);
			}
			
			//System.out.println(Arrays.toString(q1Array));
			someQ1 = findMedian(q1Array);
			return someQ1;
		}
		
		private double findQ3(Number[] givenSet)
		{
			double someQ3 = 0;
			int setMidpoint = givenSet.length / 2;
			Number[] q3Array;
			
			if(givenSet.length % 2 != 0)
			{
				q3Array = Arrays.copyOfRange(givenSet, setMidpoint + 1, givenSet.length);
			}
			else
			{
				q3Array = Arrays.copyOfRange(givenSet,setMidpoint, givenSet.length);
			}
			
			someQ3 = findMedian(q3Array);
			return someQ3;
		}
		
		private double findIQR(double givenQ1, double givenQ3)
		{
			return givenQ3 - givenQ1;
		}

		public String getStuffForAssignment()
		{
			String fivePoints = "Mean: " + mean + "\r\n"
								+"Median: " + median + "\r\n"
								+"q1: " + q1 + "\r\n"
								+"q3: " + q3 + "\r\n"
								+"iqr: " + iqr + "\r\n"
								+"Standard Deviation: " + standardDev;
			return fivePoints;
		}
		
		
		private double findSampeVariance(Number[] sampleSet, double mean)
		{
			double summation = 0;
			
			for(int i = 0; i < sampleSet.length; i++)
			{
				double result = (sampleSet[i].doubleValue() - mean) / (sampleSet.length - 1);
				summation += result * result;
			}
			return summation;
		}
		
		private double findStandardDeviation(Number[] sampleSet, double mean)
		{
			double variance = findSampeVariance(sampleSet, mean);
			return Math.sqrt(variance);
		}
		
		public String getSortedSet()
		{
			return Arrays.toString(sortedSampleSet);
		}
}
