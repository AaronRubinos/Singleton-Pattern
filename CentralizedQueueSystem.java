package SingletonPattern;

import java.util.ArrayList;
import java.util.List;

// CentralizedQueueSystem class representing the Singleton pattern
public class CentralizedQueueSystem {
    private static CentralizedQueueSystem instance;
    private List<String> queue;
    private int currentQueueNumber;

    // Private constructor to prevent instantiation outside the class
    private CentralizedQueueSystem() {
        queue = new ArrayList<>();
        currentQueueNumber = 1;
    }

    // Get instance method to provide the singleton instance
    public static synchronized CentralizedQueueSystem getInstance() {
        if (instance == null)
            instance = new CentralizedQueueSystem();
        return instance;
    }

    // Enqueue a user and return the assigned queue number
    public synchronized int enqueueUser(String user) {
        queue.add(user);
        System.out.println(user + " is added to the queue with number: " + currentQueueNumber);
        return currentQueueNumber++;
    }

    // Dequeue a user and update the queue
    public synchronized void dequeueUser() {
        if (!queue.isEmpty()) {
            String user = queue.remove(0);
            System.out.println(user + " is served and removed from the queue.");
        } else {
            System.out.println("Queue is empty.");
        }
    }

    // Reset the queue based on an inputted number
    public synchronized void resetQueue(int newQueueNumber) {
        queue.clear();
        currentQueueNumber = newQueueNumber;
        System.out.println("Queue is reset to number: " + newQueueNumber);
    }

    // Display the current queued numbers
    public synchronized void displayQueue() {
        System.out.println("Current Queue: " + queue);
    }
}