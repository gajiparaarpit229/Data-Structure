import java.util.Scanner;
public class Lab_5_30{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr1 = new int[2][2];
		int[][] arr2 = new int[2][2];
		int[][] sum = new int[2][2];
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.print("Enter value of arr1["+i+"]["+j+"] : ");
				arr1[i][j] = sc.nextInt();
				System.out.print("Enter value of arr2["+i+"]["+j+"] : ");
				arr2[i][j] = sc.nextInt();
				sum[i][j] = arr1[i][j]+arr2[i][j];
			}
			System.out.println();
		} 
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	}
}