/*
Task 1
Написать метод со следующим функционалом:
На вход метод принимает массив целых чисел и число - длину нового массива.
Метод должен создать и распечатать массив заданной в параметрах длинны.
В начало массива должны быть скопированы элементы из входящего массива:

{0, 1, 2, 3, 4, 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}
{0, 1, 2} -> copyOfArray(array, 5) -> вывод на печать {0, 1, 2, 0, 0}
Arrays.copyOf() использовать нельзя. Суть задачи - написать собственную реализацию этого метода
 */
package homework_10;

public class Task1 {
    public static void main(String[] args) {
        int[] array1 = new int[]{0, 1, 2, 3, 4, 5, 6};
        int arrayNewLength1 = 3;
        createNewArray(array1, arrayNewLength1);

        int[] array2 = new int[]{0, 1, 2};
        int arrayNewLength2 = 5;
        createNewArray(array2, arrayNewLength2);

    } // Methods area
      public static void createNewArray (int[] arr, int arrNewLength) {

          int[] arrNew = new int[arrNewLength];

          System.out.print("[");

          for (int i = 0; i < arr.length && i < arrNew.length; i++) {
              arrNew[i] = arr[i];
          }

          for (int i = 0; i < arrNew.length; i++) {
              System.out.print(arrNew[i] + (i < arrNew.length - 1 ? ", " : "]\n"));
          }
      }
} // End class
