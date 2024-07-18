import java.util.*;

class Factorial{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int ans=1;
		
		while(num!=0){
			ans = num*ans;
			num--;
		}
		System.out.println(ans);   
	}
}