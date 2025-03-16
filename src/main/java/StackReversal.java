import java.util.Stack;

public class StackReversal {

    static Stack stack = new Stack();

    public static void reverseStack(){
        if(stack.isEmpty())
            return;
        int temp = (Integer) stack.pop();
        reverseStack();
        insertAtBottom(temp);
    }

    public static void insertAtBottom(int data){
        if(stack.isEmpty()) {
            stack.push(data);
            return;
        }
        int temp = (Integer) stack.pop();
        insertAtBottom(temp);
        stack.push(temp);

    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack " + stack.toString());
        reverseStack();
        System.out.println("Reverse Stack " + stack.toString());
    }
}
