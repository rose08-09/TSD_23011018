public class ObjectCount {
    static int count = 0; // Static variable to count objects

    // Constructor increments count each time an object is created
    ObjectCount() {
        count++;
    }

    public static void main(String[] args) {
        ObjectCount o1 = new ObjectCount();
        ObjectCount o2 = new ObjectCount();
        ObjectCount o3 = new ObjectCount();

        System.out.println("Number of objects created: " + count);
    }
}
