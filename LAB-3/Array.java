import java.util.*;

class Array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter array of "+i);
            arr[i] = sc.nextInt();
        }

         for(int i=0;i<n;i++){
            System.out.println("your array of "+i+"is "+arr[i]);
        }
    }
} 