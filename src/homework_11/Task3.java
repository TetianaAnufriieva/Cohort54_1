/*
Task 3 * (Опционально)
Написать метод, который проверяет, является ли массив палиндромом (читается одинаково с обоих концов).
 */
package homework_11;

public class Task3 {
    public static void main(String[] args) {
        int[] array1 = new int[] {9, 8, 7, 6, 7, 8, 9};
        int[] array2 = new int[] {9, 1, 3, 6, 4, 2, 9};
        isArrayPalindrome (array1);
        System.out.println(isArrayPalindrome(array1) ? "Массив является палиндромом" : "Массив не является палиндромом");
        isArrayPalindrome (array2);
        System.out.println(isArrayPalindrome(array2) ? "Массив является палиндромом" : "Массив не является палиндромом");
    } // Methods area
    public static boolean isArrayPalindrome(int[] arr) {

        for (int i = 0; i < arr.length/2; i++){
            if (arr[i] != arr[arr.length - 1 - i]) {return false;}
        }
        return true;
    }


} // End class
