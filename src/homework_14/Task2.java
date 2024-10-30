/*
Task 2
Найти второе по величине число в массиве
Напишите метод, который находит второе по величине число в массиве целых чисел.
 */
package homework_14;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[] {99, 2, 61, 78, 0, 17, -43};
        int result = findSecondMax(array);
        System.out.println("Второе по величине число в массиве = " + result);

    } // Methods area

    public static int findSecondMax(int[] arr) {
        if (arr == null || arr.length == 0 || arr.length < 2) {
            return 0;
        } else {
            int max = arr[0];
            int secondMax = arr[1];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    secondMax = max; // Обновляем второе по величине значение
                    max = arr[i]; // Обновляем максимальное значение
                } else if(arr[i] > secondMax && arr[i] != max) {
                    secondMax = arr[i]; // Обновляем второе по величине значение, если оно != max
                }
            }
            return secondMax;
        }
    }


} // End class
