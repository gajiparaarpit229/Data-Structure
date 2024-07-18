import java.util.*;
public class Lab_4_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[]={1,2,3,4,5,7,8,10};
        System.out.println("Enter Element to be deleted:");
        int element = sc.nextInt();
        int newArray[] = new int[7];
        int index = 0;
        while(index<array.length && array[index]<element){
            newArray[index]=array[index];
            index++;
        }
        index++;
        while(index<array.length){
            newArray[index-1]=array[index];
            index++;
        }
        for(int i=0;i<7;i++){
            System.out.println(newArray[i]);
        }
    }
}