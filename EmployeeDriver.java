package methodOverriding;

//1. Add getEmployeeDetails method to the class 'Employee' and extend it in subclasses representing different types of employees 
//such as HourlyEmployee and SalariedEmployee and overload getEmployeeDetails.
//Demonstrate polymorphism by printing various types of Employees by using Parent Class reference.


public class EmployeeDriver {

	public static void main(String[] args) {
		Employee GeneralEmployee=new Employee();
		Employee HourEmployee=new HourlyEmployee();
		Employee SalaryEmployee=new SalariedEmployee();
		
		GeneralEmployee.getEmployeeDetails();
		HourEmployee.getEmployeeDetails();
		SalaryEmployee.getEmployeeDetails();
	}
	
}

class Employee{
	public void getEmployeeDetails () {
		System.out.println("Employee Details: General Employee");
	}
}

class HourlyEmployee extends Employee{
	public void getEmployeeDetails () {
		System.out.println("Employee Details: Hourly Employee");
	}
}

class SalariedEmployee extends Employee{
	public void getEmployeeDetails () {
		System.out.println("Employee Details: Salaried Employee");
	}
}