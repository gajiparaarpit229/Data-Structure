import java.util.*;

class Sumofmton{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first num..");
        int a = sc.nextInt();
        System.out.println("Enter second num..");
        int b = sc.nextInt();

        int ans = 0;
        for(int i=0;i<a && i<b;i++){
            ans = ans + a;
            a++;
        }
        System.out.println("Your ans is."+ans);
       
    }
}