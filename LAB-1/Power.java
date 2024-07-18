import java.util.*;
class Power{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pow = sc.nextInt();
        int ans = 1;
        for(int i=0;i<pow;i++){
            ans = ans*num;
        }
        System.out.println(ans);
    }
}