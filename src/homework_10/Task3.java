/*
Task 3
Написать метод, принимающий на вход массив целых чисел.
Метод должен вернуть массив, состоящий только из простых чисел, присутствующих в изначальном массиве
вход -> {0, 13, -25, 11, 31, 55, 98, 11, 5} -> выход {13, 11, 31, 11, 5}
 */
package homework_10;
public class Task3 {
    public static void main(String[] args) {

        int[] array = new int[]{0, 13, -25, 11, 31, 55, 98, 11, 5};
        int[] ints = getPrimeNumbers(array);

        System.out.print("Результат [");
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + (i != ints.length - 1 ? ", " : "]\n"));
        }

    } // Methods area

        public static int[]getPrimeNumbers(int[] arr) {
            int[] result = new int[arr.length];
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                int currentValue = arr[i];
                if (currentValue < 2) {
                    System.out.println("Число не простое " + currentValue);
                } else {
                    boolean isPrime = true; // предположим число простое

                    for (int j = 2; j < currentValue; j++) {
                        if (currentValue % j == 0) {
                            System.out.println("Число не простое " + currentValue);
                            isPrime = false; // опровергли
                            break;
                        }
                    }

                    if (isPrime) {
                        result[index] = currentValue;
                        index++;
                    }
                }


            }
            int[] trueResult = new int[index];
            for (int k = 0; k < index; k++) {
                trueResult[k] = result[k];
            }
            return trueResult;

        }

} // End class
