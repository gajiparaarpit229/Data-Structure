import java.util.*;

class Average{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int ans = 0, a = 1;
        for(int i=0;i<num;i++){
            ans = ans + a;
            a++;
        }
        double avg = ans/num;
        System.out.println("Average is: "+avg);
    }
}