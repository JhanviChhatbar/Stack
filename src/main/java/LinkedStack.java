import java.util.EmptyStackException;

public class LinkedStack {

    private int length;
    private Node top;

    public LinkedStack(){
        length =0;
        top = null;
    }

    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        length++;
    }

    public boolean isEmpty(){
        return (length == 0);
    }

    public int pop() throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException();
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }
    public int peek() throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException();
        return top.data;
    }

    public int size(){
        return length;
    }
}

class Node{
    int data;
    Node next;

    public Node(int d){
        this.data = d;
        next = null;
    }
}
