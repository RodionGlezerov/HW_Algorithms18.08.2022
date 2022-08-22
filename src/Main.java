public class Main {
    public static void main(String[] args) {
        //Дан файл действительных чисел и два числа a и b.
        // Используя очередь (несколько очередей) напечатать сначала все элементы, меньшие a;
        // потом все элементы из отреза [a, b]; потом все элементы, большие b.
        double[] data = new double[10];
        for (int i = 0; i < data.length; i++) {
            data[i] = 100 * Math.random();
            System.out.println(data[i]);
        }
        System.out.println();
        double a = 20.0;
        double b = 40.0;
        Queue queue = new Queue();
        System.out.println("Меньше а");
        for (int i = 0; i < data.length; i++) {
            if (data[i] < a) {
                System.out.println(data[i]);
            } else {
                queue.add(data[i]);
            }
        }
        while (!queue.isEmpty()) {
            System.out.println(queue.delete());
        }
        System.out.println();
        System.out.println("Из отрезка а и б");
        for (int i = 0; i < data.length; i++) {
            if ((data[i] > a) & (data[i] < b)) {
                System.out.println(data[i]);
            } else {
                queue.add(data[i]);
            }
        }
        System.out.println();
        System.out.println("Больше b");
        for (int i = 0; i < data.length; i++) {
            if (data[i] > b) {
                System.out.println(data[i]);
            } else {
                queue.add(data[i]);
            }

        }
    }

}

