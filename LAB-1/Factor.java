import java.util.*;
class Factor{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 1;
        for(int i=0;i<num;i++){
            if(num%count==0){
                System.out.println(count);
                count++;
            }
            else{
                count++;
            }
        }
    }
} 