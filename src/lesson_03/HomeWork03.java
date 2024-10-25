package lesson_03;

public class HomeWork03 {
    public static void main(String[] args) {

        // Task 1
        /*
        В классе HomeWork03 задекларировать (объявить) и присвоить значения 3-м переменным. Правильно подберите тип и имя переменным.
        Переменная 1 - сколько Вам полных лет
        Переменная 2 - должна хранить стоимость 1 литра молока в Вашей стране (без наименования валюты - только цена)
        Переменная 3 - Ваше имя (Опционально, так как мы с вами не учили, в каком типе данных хранить можно хранить текст. (Гугл?))
         */
        int age = 36;
        double price = 1.15;
        String name = "Tanja";
        System.out.println("Task1");
        System.out.printf("Name: %s, Age: %d%nСost of milk: %.2f%n", name, age, price);

        // Task 2
        /*
        Объявите 4 переменных типа int со значениями 0, 1, 2, 3.
        Объявите ещё одну переменную int и сохраните в неё сумму этих переменных, деленную на 4. Получается, у вас будет среднее арифметическое этих чисел в одной переменной.
        Выведите на экран значение переменной.
        Какой остаток от деления программа "потеряла"?
         */
        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        int result;

        result = (a + b + c + d) / 4;
        System.out.println("Task2");
        System.out.println("(a + b + c + d) / 4 = " + result);

        int rest; // остаток от деления
        rest = (a + b + c + d) % 4;
        System.out.println("(a + b + c + d) % 4 = " + rest);

        //Task3
        /*
        Пусть цена товара A составляет 1000 Euro, а товара B составляет 500 Euro.
        Если клиент покупает товары вместе, то на них действует скидка 10% на всю покупку.
        Выведите на экран значение переменной, которая соответствует стоимости товаров A+B со скидкой.
        Отдельно выведите на экран сумму скидки для этой покупки (в деньгах).

        Найдите в Интернете данные по температуре в вашем городе за прошедшую неделю (или придумайте :) ).
        Вычислите среднюю температуру за неделю и выведете ее на печать.
         */
        float priceA = 1000;
        float priceB = 500;
        int discount = 10;
        float discountedPrice;
        float discountAmount;

        discountAmount = (priceA+priceB)*discount/100;
        discountedPrice = (priceA+priceB)-discountAmount;
        System.out.println("Task3");
        System.out.println("discountedPrice: " + discountedPrice);
        System.out.printf("discountAmount: %.2f Euro%n", discountAmount);
        System.out.println("---------------------------------");

        // Temperature data in the city for the last week
        float monTempDay = 20;
        float monTempNight = 12;

        float tueTempDay = 20;
        float tueTempNight = 12;

        float wedTempDay = 21;
        float wedTempNight = 11;

        float thuTempDay = 19;
        float thuTempNight = 9;

        float friTempDay = 17;
        float friTempNight = 10;

        float satTempDay = 16;
        float satTempNight = 10;

        float sunTempDay = 19;
        float sunTempNight = 9;

        // Average temperature for the last week
        float avgWeekTempDay;
        float avgWeekTempNight;
        avgWeekTempDay = (monTempDay + tueTempDay + wedTempDay + thuTempDay + friTempDay + satTempDay + sunTempDay)/7;
        avgWeekTempNight = (monTempNight + tueTempNight + wedTempNight + thuTempNight + friTempNight + satTempNight + sunTempNight)/7;
        System.out.printf("Average daily temperature for the last week: %.2f degrees %nAverage nightly temperature for the lats week: %.2f degrees%n", avgWeekTempDay, avgWeekTempNight);

        //Task4
        /*
        Какие числа могут получаться в качестве остатка от деления какого-либо целого числа на 2?
        Если число чётное, то остаток от его деления на 2 будет 0. Если число нечётное, то 1.
        2/2=1 (остаток 0)
        3/2=1 (остаток 1)

        Какие числа могут получаться в качестве остатка от деления какого-либо целого числа на 3?
        0; 1; 2.
        3/3=1 (остаток 0)
        4/3=1 (остаток 1)
        5/3=1 (остаток 2)
        6/3=2 (остаток 0)
        */


    }
}
