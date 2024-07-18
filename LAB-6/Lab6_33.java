import java.util.Scanner;
class swapnum{
    public void swapnumber(int x, int y){
        int temp;
        temp =x;
        x=y;
        y=temp;
        System.out.println(x);
        System.out.println(y);
    }
}
public class Lab6_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of x =");
        int x = sc.nextInt();
        System.out.println("enter value of y =");
        int y = sc.nextInt();
        System.out.println("after swaping");
        swapnum sp = new swapnum();
        sp.swapnumber(x, y);
        
    }
}