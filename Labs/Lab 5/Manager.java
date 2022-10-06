public class Manager extends Employee
{
	
 public Manager(){
 super();
 directReports = new Employee[MAXIMUM_DIRECT_REPORTS];
 managerData = new Employee();
 }
 
 public Manager(int id, String eName, int eAge, double annualSalary, String Title, String dName){
 super(id, eName, eAge, annualSalary, Title, dName);
 directReports = new Employee[100];
 }
 
 public void addEmployee(Employee e){
 if (numberOfDirectReports < MAXIMUM_DIRECT_REPORTS) // Ensure there is space
 directReports[numberOfDirectReports++] = e; // Should handle lack of space
 }
 

 
 public String toString(){
 return super.toString(); // just info on a specific manager
 }
 

 public void printEmployeeList() // just list the direct reports
 {
 for (int i = 0; i < directReports.length; i++)
 if (directReports[i] != null)
 System.out.println(directReports[i]);
 }
 
protected final static int MAXIMUM_DIRECT_REPORTS = 100;
protected Employee[] directReports = new Employee[MAXIMUM_DIRECT_REPORTS];
protected int numberOfDirectReports = 0;
protected Employee managerData;
}