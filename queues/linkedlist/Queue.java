package queues.linkedlist;

public class Queue {
    private QueueNode front;
    private QueueNode rear;

    public Queue(QueueNode front, QueueNode rear) {
        this.front = front;
        this.rear = rear;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        QueueNode tmp = front;
        front = front.next;
        if (front == null)
            rear = null;

        return tmp.item;
    }

    public void enqueue(int newItem) {
        QueueNode node = new QueueNode(newItem);

        if (front == null) {
            front = rear = node;
        } else {
            rear.next = node;
            rear = node;
        }
    }

}
