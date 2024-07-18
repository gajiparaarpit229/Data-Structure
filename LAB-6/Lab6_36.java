import java.util.Scanner;
public class Lab6_36{
	public static void main(String[] args) {
		Conversion c = new Conversion();
		System.out.println("Value in Fahrenheit = "+c.c_to_f());
		System.out.println("Value in Celsius = "+c.f_to_c());
	}
}
class Conversion{
	float c,f;
	public float c_to_f(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of celsius : ");
		c = sc.nextFloat();
		return (9/5)*(c+32);
	} 
	public float f_to_c(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of Fahrenheit : ");
		f = sc.nextFloat();
		return (5/9)*(f-32);
	}
}