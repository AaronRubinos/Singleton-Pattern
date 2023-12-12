package SingletonPattern;

public class UserApp {
    public static void main(String[] args) {
        // Instantiate the CentralizedQueueSystem
        CentralizedQueueSystem queueSystem = CentralizedQueueSystem.getInstance();

        // Enqueue users
        int queueNumber1 = queueSystem.enqueueUser("Aaron");
        int queueNumber2 = queueSystem.enqueueUser("Racel");

        // Display current queue
        queueSystem.displayQueue();

        // Dequeue a user
        queueSystem.dequeueUser();

        // Reset the queue
        queueSystem.resetQueue(100);

        // Enqueue another user
        int queueNumber3 = queueSystem.enqueueUser("Christine");

        // Display current queue
        queueSystem.displayQueue();
    }
}