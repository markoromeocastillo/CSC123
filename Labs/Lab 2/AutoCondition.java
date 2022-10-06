public class AutoCondition extends Auto
{
	AutoCondition()
	{
	
		super();
		condition = ("Unavailable");
	}
	
	AutoCondition(String mk, String mdl, int yr, int mlg, String tVIN, String cond)
	{
		super(mk, mdl, yr, mlg, tVIN);
	
		condition = cond;
	}
	
	public String toString()
	{
		return (make + ", " + model + ", " + year + ", " +  mileage + ", " + vin +", " + condition);
		//overrides the toString? NOT overloaded.
	}
protected String condition; //should be an enumerated type.
}