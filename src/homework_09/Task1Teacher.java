package homework_09;

public class Task1Teacher {
    public static void main(String[] args) {
        int[] array = {1, 4, 3, 6, 7};
        printReverseArray(array, 2);

        System.out.println("\nprintReverseArray(array);");
        printReverseArray(array);

        System.out.println("\nprintReverseArray(array, true): ");
        printReverseArray(array, true);

        System.out.println("\nprintReverseArray(array, false): ");
        printReverseArray(array, false);


    } // Methods area

    public static void printReverseArray(int[] array, boolean flag) {
        if (flag) {
            printReverseArray(array);
        } else {
            printReverseArray(array, array.length - 1);
        }
    }

    public static void printReverseArray(int[] array) {
        // Перебрать все индексы от большего к меньшему и вывести элементы
        printReverseArray(array, 0);
    }

    public static void printReverseArray(int[] arr, int index) {
        System.out.print("[");
        // Печатаю все элементы под индексами от 0 до index в прямой последовательности
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + ", ");
        }
        // 2, 3, 4 -> 4, 3, 2
        // Печатаю все элементы под индексами от arr.length - 1 до index (вкл) в обратном порядке
        for (int i = arr.length - 1; i >= index ; i--) {
            System.out.print(arr[i] + (i != index ? ", " : "]\n"));
        }
    }



} // End class