import java.util.*;
public class Lab_4_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[]={1,2,3,4,5,8,10};
        System.out.println("Enter Element to be inserted:");
        int element = sc.nextInt();
        int newArray[] = new int[8];
        int index = 0;
        while(index<array.length && array[index]<element){
            newArray[index]=array[index];
            index++;
        }
        newArray[index]=element;
        while(index<array.length){
            newArray[index+1]=array[index];
            index++;
        }
        for(int i=0;i<8;i++){
            System.out.println(newArray[i]);
        }
    }
}