/*
Task 2
Написать метод, принимающий на вход массив строк.
Метод должен вернуть массив, состоящий из самой короткой и самой длинной строки изначального массива.
 */

package homework_10;

public class Task2 {
    public static void main(String[] args) {
        String[] array = {"Java", "Python", "Hello", "World"};
//        String[] array = {};
        String[] result = findShortestLongest(array);
        System.out.println("shortest: " + result[0] + ", longest: " + result[1]);

    } // Methods area

    public static String[] findShortestLongest(String[] arr) {

        if (arr == null || arr.length == 0) {
            return new String[]{"", ""}; // возвращаем пустой массив
        }


        String min = arr[0];
        String max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max.length() < arr[i].length()) max = arr[i];
            if (min.length() > arr[i].length()) min = arr[i];
        }

        return new String[]{min, max};
    }
} // End class
