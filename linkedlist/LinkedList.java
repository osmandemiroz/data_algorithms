package linkedlist;

public class LinkedList {
    private LinkedListNode head;
    private LinkedListNode tail;
    private int noOfNodes;

    public LinkedList(LinkedListNode head, LinkedListNode tail, int noOfNodes) {
        this.head = head;
        this.tail = tail;
        this.noOfNodes = noOfNodes;
    }

    public void add(int pos, int e) {
        if (pos < 0 || pos > noOfNodes) {
            throw new IndexOutOfBoundsException();
        }

        LinkedListNode newNode = new LinkedListNode(e);

        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            if (noOfNodes == 0) {
                tail = head;
            }
        } else if (pos == noOfNodes) {
            tail.next = newNode;
            tail = newNode;
        } else {
            LinkedListNode current = head;
            for (int i = 0; i < pos - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }

        noOfNodes++;
    }

    public void remove(int pos) {
        if (pos < 0 || pos >= noOfNodes) {
            throw new IndexOutOfBoundsException();
        }

        if (pos == 0) {
            head = head.next;
            if (noOfNodes == 1) {
                tail = null;
            }
        } else {
            LinkedListNode current = head;
            for (int i = 0; i < pos - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            if (pos == noOfNodes - 1) {
                tail = current;
            }
        }

        noOfNodes--;
    }

    public int indexOf(int e) {
        LinkedListNode current = head;
        for (int i = 0; i < noOfNodes; i++) {
            if (current.data == e) {
                return i;
            }
            current = current.next;
        }
        return -1;
    }

    public boolean isEmpty() {
        return noOfNodes == 0;
    }

    public int first() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return head.data;
    }

    public int last() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return tail.data;
    }

    public int get(int pos) {
        if (pos < 0 || pos >= noOfNodes) {
            throw new IndexOutOfBoundsException();
        }

        LinkedListNode current = head;
        for (int i = 0; i < pos; i++) {
            current = current.next;
        }
        return current.data;
    }

    public int size() {
        return noOfNodes;
    }

    private class LinkedListNode {
        int data;
        LinkedListNode next;

        public LinkedListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
}