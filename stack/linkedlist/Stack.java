package stack.linkedlist;

public class Stack {
    private StackNode top;

    public Stack() {
        top = null;
    }

    public void push(int item) {
        StackNode x = new StackNode(item);
        x.next = top;
        top = x;
    }

    public int top() {
        if (top == null) {
            System.out.println("Stack underflow");
            return -1;
        }
        return top.item;
    }

    public boolean isEmpty() {
        if (top == null) {
            return true;
        }
        return false;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1;
        }
        StackNode tmp = top;

        top = top.next;

        return tmp.item;
    }

}
