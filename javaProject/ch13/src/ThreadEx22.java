class ThreadEx22 {
    public static void main(String args[]) {
        Runnable r = new RunnableEx22();
        new Thread(r).start();
        new Thread(r).start();
    }
}

class Account2 {
    private int balance = 1000; // private���� �ؾ� ����ȭ�� �ǹ̰� �ִ�.

    public int getBalance() {
        return balance;
    }

    public synchronized void withdraw(int money) { // synchronized�� �޼��带 ����ȭ
        if (balance >= money) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            balance -= money;
        }
    } // withdraw
}

class RunnableEx22 implements Runnable {
    Account2 acc = new Account2();

    public void run() {
        while (acc.getBalance() > 0) {
            // 100, 200, 300���� �� ���� ������ �����ؼ� ���(withdraw)
            int money = (int) (Math.random() * 3 + 1) * 100;
            acc.withdraw(money);
            System.out.println("balance:" + acc.getBalance());
        }
    } // run()
}
