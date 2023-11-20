package homework14;

public class HomeWork14App {
    public static void main(String[] args) {
        System.out.println("Start one thread process:");
        long currentTime = System.currentTimeMillis();
        oneThreadProcess();
        System.out.println("Elapsed time = " + (System.currentTimeMillis() - currentTime));
        System.out.println("Start multi thread process:");
        currentTime = System.currentTimeMillis();
        multiThreadProcess();
        System.out.println("Elapsed time = " + (System.currentTimeMillis() - currentTime));


    }

    public static void oneThreadProcess() {
        double[] array = new double[100000000];
        for (int i = 0; i < array.length; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }

    public static void multiThreadProcess() {
        double[] array = new double[100000000];
        try {
            Thread t1 = new Thread(() -> {
                for (int i = 0; i < array.length / 4; i++) {
                    array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            });
            Thread t2 = new Thread(() -> {
                for (int i = array.length / 4; i < array.length / 2; i++) {
                    array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            });
            Thread t3 = new Thread(() -> {
                for (int i = array.length / 2; i < array.length * 3 / 4; i++) {
                    array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            });
            Thread t4 = new Thread(() -> {
                for (int i = array.length * 3 / 4; i < array.length; i++) {
                    array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            });
            t1.start();
            t2.start();
            t3.start();
            t4.start();
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
