//8. Simulate a multi-threaded bank system where multiple threads can access and
//update a bank account balance. Use proper synchronization to avoid concurrency issues.

package Project;

/**
 *
 * @author ZISAN
 */
class BankAccount8 {
    private int balance;

    public BankAccount8(int initialBalance) {
        this.balance = initialBalance;
    }

    // Synchronized method to update balance safely
    public synchronized void updateBalance(String transactionType, int amount) {
        if (transactionType.equals("deposit")) {
            balance += amount;
            System.out.println(Thread.currentThread().getName() + " deposited " + amount + ". New balance: " + balance);
        } else if (transactionType.equals("withdraw")) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ". New balance: " + balance);
            } else {
                System.out.println(Thread.currentThread().getName() + " tried to withdraw " + amount + " but insufficient balance.");
            }
        }
    }
}

class BankTask implements Runnable {
    private BankAccount8 account;
    private String transactionType;
    private int amount;

    public BankTask(BankAccount8 account, String transactionType, int amount) {
        this.account = account;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.updateBalance(transactionType, amount);
    }

    public static void main(String[] args) {
        BankAccount8 account = new BankAccount8(1000); // Initial balance

        // Create threads for deposit and withdrawal
        Thread t1 = new Thread(new BankTask(account, "deposit", 500), "Thread-1");
        Thread t2 = new Thread(new BankTask(account, "withdraw", 300), "Thread-2");
        Thread t3 = new Thread(new BankTask(account, "deposit", 200), "Thread-3");
        Thread t4 = new Thread(new BankTask(account, "withdraw", 700), "Thread-4");

        // Start the threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

