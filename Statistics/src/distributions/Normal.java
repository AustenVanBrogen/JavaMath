package distributions;

public class Normal {

	public static double findZValue(double given, double Mu, double sigmaSquared)
	{
		return (given - Mu) / sigmaSquared;
	}
	
	public static double CLTAvgZVal(int samples, double given, double Mu, double sigmaSquared)
	{
		return findZValue(given, Mu, (sigmaSquared / samples));
	}
	
	public static double CLTSumZVal(int samples, double given, double Mu, double sigmaSquared)
	{
		return findZValue(given, (Mu * samples), (sigmaSquared * samples) );
	}
}
