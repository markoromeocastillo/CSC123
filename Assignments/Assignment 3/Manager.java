public class Manager extends Employee
{
protected int listCount = 0;
protected Employee managerList;
protected final static int max = 50; 
protected Employee[] employeeList = new Employee[max];

 public Manager(){
 super();
 employeeList = new Employee[max];
 managerList = new Employee();
 }
 
 public Manager(int id, String eName, int eAge, double annualSalary, String Title, String dName){
 super(id, eName, eAge, annualSalary, Title, dName);
 employeeList = new Employee[50];
 }
 
 public String toString(){
 return super.toString();
 }
 
 public void addEmployee(Employee tempE){
 if (listCount < max)
	employeeList[listCount++] = tempE;
 }
 
 public void printEmployeeList(){
 for (int i = 0; i < employeeList.length; i++)
 if (employeeList[i] != null)
	System.out.println(employeeList[i]);
 }
}