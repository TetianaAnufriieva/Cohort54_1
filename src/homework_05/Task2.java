/*

Task 2
Создайте строки:
"Java"
"is"
"a"
"powerful"
"language"
Склейте эти строки двумя разными способами, чтобы получить строку: "Java is a powerful language".
Выведите на экран получившуюся строку и её длину.

 */

package homework_05;

public class Task2 {
    public static void main(String[] args) {

        String val1 = "Java";
        String val2 = "is";
        String val3 = "a";
        String val4 = "powerful";
        String val5 = "language";
        String val0 = " ";

        String concatStr1 = val1 + val0 + val2 + val0 + val3 + val0+ val4 + val0+ val5;
        String concatStr2 = String.join(" ", val1, val2, val3, val4, val5);
        String concatStr3 = val1.concat(" ").concat(val2).concat(" ").concat(val3).concat(" ").concat(val4).concat(" ").concat(val5);


        System.out.println("concatStr1 = " + concatStr1);
        System.out.println(concatStr1.length());
        //System.out.println("concatStr2 = " + concatStr2);
        //System.out.println(concatStr2.length());
        //System.out.println("concatStr3 = " + concatStr3);
        //System.out.println(concatStr3.length());


    }
}
