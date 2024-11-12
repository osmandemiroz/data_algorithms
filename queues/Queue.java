package queues;

public class Queue {
    private int N;
    private int[] Q;
    private int front;
    private int rear;
    private int noOfItems;

    public Queue(int n, int[] q, int front, int rear, int noOfItems) {
        N = n;
        Q = q;
        this.front = front;
        this.rear = rear;
        this.noOfItems = noOfItems;
    }

    public boolean isEmpty() {
        return noOfItems == 0;
    }

    public boolean isFull() {
        return noOfItems == N;
    }

    public int enqueue(int newItem) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return -1;
        }
        Q[rear] = newItem;
        rear++;
        if (rear == N)
            rear = 0;
        noOfItems++;
        return 0;
    }

    public int dequeue() {
        int idx = -1;

        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        idx = front;
        front++;
        if (front == N)
            front = 0;
        noOfItems--;
        return Q[idx];
    }

}
