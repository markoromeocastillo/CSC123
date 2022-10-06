public class Executive extends Manager{
	
 public Executive(){
 super();
 bonus = 0.10; //default rate is 10%
 }
 
 public Executive(int eNum, String eName, int eAge, double eSalary, String eTitle, String eDepartment, double executiveBonus){
 super(eNum, eName, eAge, eSalary, eTitle, eDepartment);
 bonus = executiveBonus;
 }
 
 //sets percentage of the executive bonus
 public void setBonus(double bonus){
 this.bonus = bonus;
 }
 
 public double getSalary(){
 return (getSalary() * (1 + bonus));
 }
 
 public String toString(){
 return (super.toString() + "\n Bonus: " + bonus);
 }
 
private double bonus;
}