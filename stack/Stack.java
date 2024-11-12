package stack;

public class Stack {
    private int N;
    private int[] S;
    private int top;

    // Constructor
    public Stack(int N, int[] S, int top) {
        this.N = N;
        this.S = S;
        this.top = top;

    }

    public int Push(int newItem) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return -1;
        }
        top++;
        S[top] = newItem;
        return top;
    }

    public int Pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int idx = top;
        top--;
        return S[idx];
    }

    public int Top() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return S[top];
    }

    public boolean isEmpty() {
        if (top < 0)
            return true;
        else
            return false;
    }

    public boolean isFull() {
        if (top == N - 1)
            return true;
        else
            return false;
    }
}