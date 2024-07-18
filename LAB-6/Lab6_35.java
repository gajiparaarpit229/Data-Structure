import java.util.Scanner;
class Lab_6_35{
	public static void main(String[] args) {
		Student_Detail[] s = new Student_Detail[5];
		for(int i=0;i<5;i++){
			s[i] = new Student_Detail();
			s[i].setStudent_Detail();
		}
		for(int i=0;i<5;i++){
			s[i].getStudent_Detail();
		}
	}
}
class Student_Detail{
	double enrollment_No;
	String name;
	int semester;
	double cpi;
	public void setStudent_Detail(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter enrollment_No : ");
		enrollment_No = sc.nextDouble();
		System.out.print("Enter name : ");
		name = sc.next();
		System.out.print("Enter semester : ");
		semester = sc.nextInt();
		System.out.print("Enter CPI : ");
		cpi = sc.nextDouble();
	}
	public void getStudent_Detail(){
		System.out.println("enrollment_No : "+enrollment_No);
		System.out.println("name : "+name);
		System.out.println("semester : "+semester);
		System.out.println("Enter CPI : "+cpi);
		System.out.println("=======================================");
	}
}