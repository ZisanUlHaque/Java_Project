//12. Write a java program that is an example of synchronised multithreading.
package Project;

class Counter12 {
    private int count = 0;

    // Synchronized method to ensure thread safety
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class Counter12Thread extends Thread {
    private Counter12 counter;

    public Counter12Thread(Counter12 counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
    public static void main(String[] args) {
        Counter12 counter = new Counter12();

        // Creating two threads that will increment the counter
        Thread t1 = new Counter12Thread(counter);
        Thread t2 = new Counter12Thread(counter);

        // Start the threads
        t1.start();
        t2.start();

        try {
            // Wait for both threads to finish
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Output the final count after both threads finish
        System.out.println("Final count: " + counter.getCount());
    }
}
