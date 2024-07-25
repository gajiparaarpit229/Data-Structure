public class B_48 {
    
    char[] stack;
    int top;

    public B_48(int size) {
        
        stack = new char[size];
        top = -1;
    }

    public void push(char e) {
        
        if (top >= stack.length - 1) {
            
            System.out.println("Stack Overflow");
            return;
        }
        
        stack[++top] = e;
    }

    public char pop() {
        
        if (top < 0) {
            
            System.out.println("Stack Underflow");
            return ' ';
        }
        
        return stack[top--];
    }

    public char peep(int i) {
        
        if (top - i + 1 < 0) {
            
            System.out.println("Stack UnderFlow");
            return ' ';
        }
        
        return stack[top - i + 1];
    }
}