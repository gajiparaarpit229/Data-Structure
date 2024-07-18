import java.util.Scanner;

public class A_45 {

    public static int G(char next) {
        
        if (next == '+' || next == '-') {
            return 2;
        } else if (next == '*' || next == '/') {
            return 4;
        } else if (next == '^') {
            return 5;
        } else if (next >= 'a'&& next<='z') {
            return 8;
        }else if(next=='('){
            return 0;
        }
        return -1;
    }

    public static int F(char next) {
        
        if (next == '+' || next == '-') {
            return 1;
        } else if (next == '*' || next == '/') {
            return 3;
        } else if (next == '^') {
            return 6;
        } else if (next >= 'a'&& next<='z') {
            return 7;
        }else if(next=='('){
            return 9;
        }else if(next==')'){
            return 0;
        }
        return -1;
    }
    
    public static int R(char next) {
        
        if (next == '+' || next == '-' || next == '*' || next == '/'||next == '^') {
            return -1;
        }else if (next >= 'a'&& next<='z') {
            return 1;
        }
        return 0;
    }

    public static String getPostfixShortCut(String infix,StringBuffer postfix){
        
        Stack_Polish stk = new Stack_Polish(infix.length());
        
        stk.push('(');
        
        for (int i = 0; i < infix.length(); i++) {
            
            char next = infix.charAt(i);
            
            if (next >= 'a' && next <= 'z') {
                postfix.append(next);
            } else if (next == '+' || next == '-' || next == '*' || next == '/') {
                
                while (G(stk.peep(1)) >= G(next)) {
                    
                    postfix.append(stk.pop());
                }
                
                stk.push(next);
            } else if (next == '^') {
                stk.push(next);
            } else if (next == '(') {
                stk.push(next);
            } else if (next == ')') {
                
                char temp2 = stk.pop();
                
                while (temp2 != '(') {
                    
                    postfix.append(temp2);
                    temp2 = stk.pop();
                }
            }
        }
        return postfix.toString();
    }
    
    public static String getPostfix(String infix,StringBuffer postfix){
        
        Stack_Polish stk = new Stack_Polish(infix.length());
        
        stk.push('(');
        
        int rank=0;
        
        for (int i = 0; i < infix.length(); i++) {
            
            char next=infix.charAt(i);
            
            if(stk.top<0){
                
                System.out.println("Invalid");
                return null;
            }

            while (G(stk.peep(1))>F(next)) {
                
                char temp=stk.pop();
                postfix.append(temp);
                rank+=R(temp);

                if(rank<1){
                    
                    System.out.println("Invalid");
                    return null;
                }
            }
            if(G(stk.peep(1))!=F(next)){
                
                stk.push(next);
            }
            else{
                
                stk.pop();
            }
        }
        
        if(stk.top!=-1 || rank!=1){
            
            System.out.println("Invalid");
            return null;
        }
        else{
            
            return postfix.toString();
        }
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Infix Expression : ");
        String infix = sc.nextLine().toLowerCase() + ")";
        
        StringBuffer postfix = new StringBuffer("");
        
        System.out.println("Postfix Expression : " + getPostfixShortCut(infix, postfix));

        sc.close();
    }
}