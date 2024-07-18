import java.util.*;

class Find{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];
        int inofs = 0 , inofl = 0;
        for(int i=0;i<n;i++){
            System.out.println("Enter array of "+i);
            a[i] = sc.nextInt();
        }

        int small = a[0];
        int large = a[0];
        for(int j=0;j<n;j++){
            if(a[j]>large){
                large = a[j];
                inofl = j;
            }
            if(a[j]<small){
                small = a[j];
                inofl = j;
            }
        }
        System.out.println("Largest is "+large+"these index is"+inofs+" Smallest is "+small+"these index is"+inofl);
    }
}                                             