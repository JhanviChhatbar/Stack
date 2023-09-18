public class DynamicArrayStack {

    protected int capacity;
    public static final int CAPCACITY = 16;
    public static int MINCAPACITY = 1<<15;

    protected int[] stackRep;
    protected int top = -1;

    public DynamicArrayStack(){
        this(CAPCACITY);
    }

    public DynamicArrayStack(int cap){
        capacity = cap;
        stackRep = new int[capacity];
    }

    public static void main(String[] args) throws Exception {
        DynamicArrayStack dynamicArrayStack = new DynamicArrayStack(24);
        dynamicArrayStack.push(2);
        dynamicArrayStack.push(23);
        dynamicArrayStack.push(4);
        dynamicArrayStack.pop();
    }

    public int size(){
        return top+1;
    }

    public boolean isEmpty(){
        return (top < 0);
    }

    public void push(int data) throws Exception{
        if(size() == capacity)
            expand();
        stackRep[++top] = data;
    }

    private void expand(){
        int length = size();
        int[] newStack = new int[length<<1];
        System.arraycopy(stackRep,0,newStack,0,length);
        stackRep = newStack;
        this.capacity = length<<1;
    }

    //dynamic array operation : shrinks to 1/2 if more than 3/4 empty
    private void shrink(){
        int length = top+1;
        if(length <= MINCAPACITY || top<<2 >= length)
            return;

        length = length + (top<<1);    // still means shrink to at 1/2 or less of the heap

        if(top<MINCAPACITY)
            length = MINCAPACITY;

        int[] newStack = new int[length];
        System.arraycopy(stackRep,0,newStack,0,top+1);
        stackRep = newStack;
        capacity = length;

    }

    public int top() throws Exception{
        if(isEmpty())
            throw new Exception("Stack is Empty");
        return stackRep[top];
    }

    public int pop() throws Exception{
        if(isEmpty())
            throw new Exception("Stack is Empty");
        int data = stackRep[top];
        stackRep[top--] = Integer.MAX_VALUE;
        shrink();
        return data;
    }
}
