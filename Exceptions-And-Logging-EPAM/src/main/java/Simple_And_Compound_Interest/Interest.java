package Simple_And_Compound_Interest;

public class Interest {
    public float calculate_simple_interest(float princpal_Amount,int time_In_Years,float rate_Of_Interest)
	{
		return (princpal_Amount*time_In_Years*rate_Of_Interest)/100;
	}
	public float calculate_compound_interest(float principal_Amount,int no_Of_Times,int time_In_Years,float rate_Of_Interest)
	{
		return (principal_Amount)*(float)(Math.pow(1+(rate_Of_Interest/no_Of_Times),time_In_Years));
	}
}
