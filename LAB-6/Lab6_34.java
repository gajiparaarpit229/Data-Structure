import java.util.Scanner;
public class Lab6_34{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee_Detail e = new Employee_Detail();
		e.setEmployee_Detail();
		e.getEmployee_Detail();
	}
}
class Employee_Detail{
	double employee_Id;
	String name;
	String designation;
	double salary;
	public void setEmployee_Detail(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter employee_Id : ");
		employee_Id = sc.nextDouble();
		System.out.print("Enter name : ");
		name = sc.next();
		System.out.print("Enter designation : ");
		designation = sc.next();
		System.out.print("Enter salary : ");
		salary = sc.nextDouble();
	}
	public void getEmployee_Detail(){
		System.out.println("Employee_Id : "+employee_Id);
		System.out.println("Name : "+name);
		System.out.println("Designation : "+designation);
		System.out.println("Salary : "+salary);
	}

}