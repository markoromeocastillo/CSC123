
public class Employee{
	
	protected String eName, eTitle, eDepartment;
	protected int eNum, eAge;
	protected double eSalary;
	
	public Employee(){
	eNum = 	-1;
	eAge = -1;
	eSalary = 1.00; 
	eTitle = "No Title Available";
	eDepartment = "No Department Available";
	eName = "No Name Available";
	}
	
	public Employee(int eNum, String eName, int eAge, double eSalary, String eTitle, String eDepartment){
	this.eNum        = eNum;
	this.eName       = eName; 
	this.eAge        = eAge;
	this.eSalary     = eSalary;
	this.eTitle      = eTitle;
	this.eDepartment = eDepartment;
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
	/* 
	can't use binary unless employees are sorted.
	public int  findEmployee(Employee[] employees, String name) {
		int start = 0;
		int end = employees.length-1;
		
		while (start <= end){
			int mid = (start + end)/2;
			
			if(name.compareTo(employees[mid]) == 0)
				return mid;
			else if(employees[mid].compareTo(name)<0)
				start = mid+1;
			else
				end = mid-1;
		}
		return -1;
	}
	*/
	
	public String toString(){
	return  "\n ID: " + eNum +
			"\n Employee: " + eName + 
			"\n Age: " + eAge + 
			"\n Salary: " + eSalary + 
			"\n Title: " + eTitle + 
			"\n Department: " + eDepartment;
	}
}
