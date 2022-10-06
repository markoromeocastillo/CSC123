public class Auto
{
	Auto()
	{
		make = new String( "Make not available.");
		model = "Model not available";
		year = 0;
		mileage = 0;
		vin = "VIN not available";
	}
	
	Auto(String mk, String mdl, int yr, int mlg, String tVIN)
	{
		make = mk;
		model = mdl;
		year = yr;
		mileage = mlg;
		vin = tVIN;
	}
	
	public String toString()
	{
		return make + ", " + model + ", " + year + ", " +  mileage + ", " + vin;
		//overrides the toString? NOT overloaded.
	}

protected String make;
protected String model;
protected int year;
protected int mileage;
protected String vin;
}