package concurrent;

import initialization.BillPughSingleton;

public class Demo {
    public static void main(String[] args) {
        Runnable task = () -> {
            ThreadSafeDoubleCheck instance = ThreadSafeDoubleCheck.getInstance();
            System.out.println(STR."Поток [\{Thread.currentThread().getName()}] отримав Obj with Hash: \{instance.hashCode()}");
        };

        System.out.println("--- Double-Checked Locking 2 потоки:");
        Thread thread1 = new Thread(task, "Поток-А");
        Thread thread2 = new Thread(task, "Поток-Б");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n--- Аналогія с Bill Pugh Singleton:");
        System.out.println(STR."Bill Pugh Instance Hash: \{BillPughSingleton.getInstance().hashCode()}");
        System.out.println("Результат в обох випадках унікальність.");
    }
}
