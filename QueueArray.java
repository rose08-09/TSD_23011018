public class QueueArray {
    int front = 0, rear = -1;
    int[] queue = new int[5]; // Fixed size queue

    // Enqueue operation
    void enqueue(int val) {
        if (rear == queue.length - 1)
            System.out.println("Queue Overflow!");
        else
            queue[++rear] = val;
    }

    // Dequeue operation
    void dequeue() {
        if (front > rear)
            System.out.println("Queue Underflow!");
        else
            System.out.println("Dequeued: " + queue[front++]);
    }

    // Display queue elements
    void display() {
        if (front > rear)
            System.out.println("Queue is empty.");
        else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++)
                System.out.print(queue[i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.display();
    }
}
