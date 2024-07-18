import java.util.*;
class Prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int i = 2;
        int count = 0;
        while(i<num/2){
            if(num%2==0){
               count++;
                i++;
            }
            else{
                i++;
            }
          
        }
         if(count==0){
             System.out.println("Num is Prime");
           }
           else{
             System.out.println("Num is not Prime");
           }
    }
}