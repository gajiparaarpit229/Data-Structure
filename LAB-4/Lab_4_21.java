import java.util.*;
public class Lab_4_21{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[]={7,9,3,2,5};
        System.out.println("Enter Element to be inserted:");
        int element = sc.nextInt();
        System.out.println("Enter position of Element to be inserted:");
        int position = sc.nextInt();
        int newArray[] = new int[6];
        for (int i=0;i<6;i++) {
            if(i==position){
                newArray[i]=element;
            }
            else if(i>position){
                newArray[i]=array[i-1];
            }
            else{
                newArray[i]=array[i];
            }
        }
        for(int i=0;i<6;i++){
            System.out.println(newArray[i]);
        }

    }
}