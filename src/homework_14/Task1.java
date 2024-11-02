/*
Task 1
Сумма четных чисел
Напишите метод, который вычисляет сумму всех четных чисел в массиве.
 */
package homework_14;

public class Task1 {
    public static void main(String[] args) {

        int[] array = new int[] {1, 3, -4, 5, 6, 7, -8, 0};
        int result = getEvenSum(array);
        System.out.println("Cумма всех четных чисел в массиве = " + result);

    } // Methods area

    public static int getEvenSum(int[] arr){
        if (arr == null || arr.length == 0) {
            return 0; // В блоке if есть return. Т.е. если мы зашли в if, после вызова return выполнение кода дальше не пойдет -> можно без else
        }
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    sum = sum + arr[i];
                }
            }
        return sum;
        }

    } // End class
