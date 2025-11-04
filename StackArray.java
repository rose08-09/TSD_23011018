public class StackArray {
    int top = -1;
    int[] stack = new int[5]; // Fixed size stack

    // Push operation
    void push(int val) {
        if (top == stack.length - 1)
            System.out.println("Stack Overflow!");
        else
            stack[++top] = val;
    }

    // Pop operation
    void pop() {
        if (top == -1)
            System.out.println("Stack Underflow!");
        else
            System.out.println("Popped: " + stack[top--]);
    }

    // Display stack elements
    void display() {
        if (top == -1)
            System.out.println("Stack is empty.");
        else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++)
                System.out.print(stack[i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        StackArray s = new StackArray();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.pop();
        s.display();
    }
}
