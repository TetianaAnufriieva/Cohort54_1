/*
Task 1
Написать метод, принимающий массив целых чисел и распечатывающий массив
в обратной последовательности.
{1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]

Перегрузить метод, если в него приходит индекс, то часть массива слева до этого
индекса распечатывается в обычном порядке, а начиная с этого индекса в обратном:
{1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]

Еще одна перегрузка: метод принимает массив и булевый флаг.
Если флаг == true -> печатает массив в обратном порядке Если флаг == false ->
печатает массив в прямом порядке
 */


package homework_09;


public class Task1 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 6, 7};
        int index = 2;
        boolean a = true;
        boolean b = false;
        invertedArray(arr);
        invertedArray(arr, index);
        invertedArray(arr, a);
        invertedArray(arr, b);

    } // Methods area

    // Массив в обратной последовательности {1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]
    public static void invertedArray(int[] array) {

        int i = array.length - 1;
        System.out.print("[");
        while (i >= 0) {
            System.out.print(array[i] + (i > 0 ? ", " : "]\n"));
            i--;
        }

    }

    // Перегрузка {1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]
    public static void invertedArray(int[] array, int index) {

        int i = 0;
        System.out.print("[");
            while (i < index) {
                System.out.print(array[i]+ ", ");
                i++;
            }

        int j = array.length - 1;
            while (j >= index) {
                System.out.print(array[j] + ((j > 0 & j > index) ? ", " : "]\n"));
                j--;
            }

    }

    // Перегрузка - метод принимает массив и булевый флаг
    public static void invertedArray(int[] array, boolean flag) {

        if (flag == false) {
            int i = array.length - 1;
            System.out.print("[");
            while (i >= 0) {
                System.out.print(array[i] + (i > 0 ? ", " : "]\n"));
                i--;
            }
        } else{
            int j = 0;
            System.out.print("[");
            while (j < array.length) {
                System.out.print(array[j] + (j < array.length - 1 ? ", " : "]\n"));
                j++;
            }
        }

    }
}// End class
