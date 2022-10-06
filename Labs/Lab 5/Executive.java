public class Executive extends Manager{
	
 public Executive(){
 super();
 bonusRate = 0.10;
 }
 
 public Executive(int id, String tName, int eAge, double annualSalary, String Title, String dName, double bRate){
 super(id, tName, eAge, annualSalary, Title, dName);
 bonusRate = bRate;
 }
 
 public void setBonusRate(double newRate){
 bonusRate = newRate;
 }
 
 public double getSalary(){
 return getSalary() * (1+bonusRate);
 }
 
 public String toString(){
 return super.toString() + "\n " + bonusRate;
 }
 
private double bonusRate;
}