package general;

public class General {

	
	public static double summation(int nStart, int nEnd, PassingFunction aFunction)
	{
		if(aFunction == null)
			throw new IllegalArgumentException();
		
		double result = 0.0;
		for(int i = nStart; i <= nEnd; i++)
		{
			result += aFunction.someFunction(i);
		}
		return result;
	}
}
