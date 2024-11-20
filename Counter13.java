//13. Write a java program that is an example of unsynchronised multithreading.
package Project;

class Counter13 {
    private int count = 0;

    public void increment() {
        count++; // This operation is not synchronized
    }

    public int getCount() {
        return count;
    }
}

class CounterThread extends Thread {
    private Counter13 counter;

    public CounterThread(Counter13 counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }

    public static void main(String[] args) {
        Counter13 counter = new Counter13();

        // Create two threads that share the same Counter object
        CounterThread t1 = new CounterThread(counter);
        CounterThread t2 = new CounterThread(counter);

        // Start both threads
        t1.start();
        t2.start();

        // Wait for both threads to complete
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final value of the counter
        System.out.println("Final Counter Value: " + counter.getCount());
    }
}

