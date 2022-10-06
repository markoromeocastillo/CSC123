
public class Employee{
	
	protected String eName, eTitle, eDepartment;
	protected int eNum, eAge;
	protected double eSalary;
	
	public Employee()
	{
	eNum = -1;
	eAge = -1;
	eSalary = 1.00; 
	eTitle = "No Title Available";
	eDepartment = "No Department Available";
	eName = "No Name Available";
	}
	
	public Employee(int eNum, String eName, int eAge, double eSalary, String eTitle, String eDepartment){
	this.eNum = eNum;
	this.eName = eName; 
	this.eAge = eAge;
	this.eSalary = eSalary;
	this.eTitle = eTitle;
	this.eDepartment = eDepartment;
	}
	
	
	public String toString(){
	return "\n " + eNum + "\n " + eName + "\n " + eAge + "\n " + eSalary + "\n " + eTitle + "\n " + eDepartment;
	}
	
	public void changeSalary(int increase){
	eSalary += increase;
	}
	
	public void changeSalary(double increase){
	eSalary *= (1 + increase);
	}
	
	public double getSalary(){
	return eSalary;
	}
	
	public String getEmpName(){
		return eName;
	}
	
	public int findEmployee(Employee[] employees, String name){
		
		for (int index = 0; index < employees.length; index++){
			Employee employeeTemp = employees[index];
			String employeeName = employeeTemp.getEmpName();
			
			if (employeeName.equals(name))
				return index;
		}
		return -1;
	}
}
