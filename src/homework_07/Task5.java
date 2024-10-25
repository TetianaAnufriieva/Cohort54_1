/*
Task 5 * (Опционально)
Используйте оператор switch для решения задачи:

Ваш ребенок принес оценку за контрольную работу по математике. В школе 12-балльная система. Запишите в переменную случайное число от 0 до 12.

Вы разрешаете ребенку смотреть телевизор не более 60 минут в день. На сегодня у него осталось 45 минут.

Если оценка от 10 до 12 баллов: скажите ребенку, как вы рады, и добавьте к оставшемуся времени 1 час.
Оценка от 7 до 9 баллов: похвалите ребенка и добавьте 45 минут.
Оценка от 4 до 6 баллов: нейтрально отнеситесь и добавьте 15 минут.
Оценка 3 балла: огорчитесь и вычтите 30 минут.
Оценка меньше 3 баллов: запретите телевизор на сегодня.
Выведите на экран оставшееся время для просмотра ТВ.

P.S. Проконтролируйте, чтобы ребенок не смотрел ТВ больше 60 минут в день.
 */


package homework_07;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int timeLeft = 45;
        int maxTime = 60;
        int viewingTime;

        Random random = new Random();
        int note = random.nextInt(13);
        System.out.println("Оценка за контрольную работу по математике = " + note);
        // System.out.println("Изначально оставшееся время к просмотру TV: " + timeLeft);

        switch (note) {
            case 12:
            case 11:
            case 10:
                System.out.println("Скажите ребенку, как вы рады, и добавьте к оставшемуся времени 1 час.");
                timeLeft = timeLeft + 60;
                break;
            case 9:
            case 8:
            case 7:
                System.out.println("Похвалите ребенка и добавьте 45 минут");
                timeLeft = timeLeft + 45;
                break;
            case 6:
            case 5:
            case 4:
                System.out.println("Нейтрально отнеситесь и добавьте 15 минут");
                timeLeft = timeLeft + 15;
                break;
            case 3:
                System.out.println("Огорчитесь и вычтите 30 минут.");
                timeLeft = timeLeft - 30;
                break;
            case 2:
            case 1:
                System.out.println("Запретите телевизор на сегодня");
                timeLeft = timeLeft + 0;
                //System.out.println("Оставшееся время к просмотру: " + timeLeft);
                break;
            default:
                System.out.println("Оценки за контрольную - нет");
        }
        if (timeLeft > maxTime) {
            viewingTime = maxTime;
            timeLeft = timeLeft - viewingTime;
            System.out.println("Допустимое время к просмотру: " + viewingTime);
            System.out.println("Оставшееся время к просмотру: " + timeLeft);
        }
        else {
            viewingTime = timeLeft;
            timeLeft = timeLeft - viewingTime;
            System.out.println("Допустимое время к просмотру: " + viewingTime);
            System.out.println("Оставшееся время к просмотру: " + timeLeft);
        }

    }
}
