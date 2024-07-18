import java.util.Scanner;

public class FactorialR{

    public static int fact(int number)
    {
        if(number == 0)
        {
            return 1;
        }
        else
        {
            return (fact(number - 1) * number);
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        System.out.println("Answer: " + (fact(number)));

    }
}