import java.util.Scanner;

public class B_46 {

    public static int G(char temp) {

        switch (temp) {

            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;

            case ')':
                return 0;

            default:
                return -1;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Infix Expression : ");
        String str = sc.nextLine().toLowerCase();

        String infix = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            char temp = str.charAt(i);

            if (temp == '(') {
                infix += ")";
            } else if (temp == ')') {
                infix += "(";
            } else {
                infix += temp;
            }
        }

        infix = infix + ")";

        Stack_Polish stack = new Stack_Polish(infix.length());

        stack.push('(');

        StringBuffer postfix = new StringBuffer("");

        for (int i = 0; i < infix.length(); i++) {

            char temp = infix.charAt(i);

            if (temp >= 'a' && temp <= 'z') {

                postfix.append(temp);
            } else {

                if (temp == '+' || temp == '-' || temp == '*' || temp == '/') {

                    while (G(stack.peep(1)) > G(temp)) {

                        postfix.append(stack.pop());
                    }

                    stack.push(temp);
                } else {

                    if (temp == '^') {

                        while (G(stack.peep(1)) >= G(temp)) {

                            postfix.append(stack.pop());
                        }

                        stack.push(temp);
                    } else {

                        if (temp == '(') {

                            stack.push(temp);
                        } else {

                            if (temp == ')') {

                                char temp2 = stack.pop();

                                while (temp2 != '(') {

                                    postfix.append(temp2);

                                    temp2 = stack.pop();
                                }
                            }
                        }
                    }
                }
            }
        }

        String prefix = "";

        for (int i = postfix.length() - 1; i >= 0; i--) {

            prefix += postfix.charAt(i);
        }

        System.out.println("Prefix Expression : " + prefix);

        sc.close();
    }
}