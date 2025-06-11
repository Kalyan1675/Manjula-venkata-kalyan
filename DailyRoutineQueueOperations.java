import java.util.LinkedList;
import java.util.Queue;

// Task class to represent a routine task
class Task {
    String name;
    String time;

    Task(String name, String time) {
        this.name = name;
        this.time = time;
    }

    void perform() {
        System.out.println("Performing: [" + time + "] " + name);
    }

    @Override
    public String toString() {
        return "[" + time + "] " + name;
    }
}

public class DailyRoutineQueueOperations {
    public static void main(String[] args) {
        Queue<Task> q = new LinkedList<>();

        // Enqueue (add) tasks
        q.add(new Task("Wake Up", "6:00 AM"));
        q.add(new Task("Brush Teeth", "6:10 AM"));
        q.add(new Task("Take Bath", "6:30 AM"));
        q.add(new Task("Have Breakfast", "7:00 AM"));

        // Show total tasks
        System.out.println("Total tasks: " + q.size());

        // Peek (view first task without removing)
        System.out.println("Next task (peek): " + q.peek());

        // Dequeue (process tasks one by one)
        System.out.println("\nProcessing tasks (FIFO):");
        while (!q.isEmpty()) {
            Task task = q.poll(); // Removes from front (FIFO)
            task.perform();
            System.out.println("Remaining tasks: " + q.size());
        }

        // Check if queue is empty
        if (q.isEmpty()) {
            System.out.println("\nAll tasks completed!");
        }
    }
}
