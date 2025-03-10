/*
Дан файл с историей поступлений денег на счета пользователей за некий период времени
Данные в виде: <имяПользователя>:<суммаПоступления>.
Ваше задание прочитать данные из файла и обработать их.
Результат обработки должен быть записан в два файла:
less.txt список тех, кому в сумме перечисленно меньше 2000
more.txt список тех, кому в сумме перечисленно 2000 и больше
Output:
less.txt
    user2:1950
    user3:1800
more.txt:
    user1:5050
    user4:2100

 */
package homework_44.task2;


import java.io.*;

import java.util.HashMap;
import java.util.Map;

public class Task2 {

    public static void main(String[] args) {

        File sourceFile = new File("src/homework_44/task2/sourceFile.txt");

        File path = new File("src/homework_44/task2");
        path.mkdirs();
        File fileLess = new File(path, "less.txt");
        File fileMore = new File(path, "more.txt");


        if (sourceFile.exists()) {
            Map<String, Double> userAccount = new HashMap<>();
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFile))){

                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] parts = line.split(":");
                    if (parts.length == 2) {
                      String user = parts[0];
                      double amountMoney = Double.parseDouble(parts[1]);
                      userAccount.put(user, userAccount.getOrDefault(user, 0.0) + amountMoney);
                    }
                }
                System.out.println(userAccount);
            } catch (IOException e) {
                System.out.println("Ошибка: " + e.getMessage());
                e.printStackTrace();
            }

            try(
            BufferedWriter bufferedWriterLess = new BufferedWriter(new FileWriter(fileLess));
            BufferedWriter bufferedWriterMore = new BufferedWriter(new FileWriter (fileMore))
            ){
                // Set<Map.Entry<K, V>> entrySet() - возвращает set вхождений всех пар ключ-значение
                for (Map.Entry<String, Double> entry : userAccount.entrySet()) {
                    String result;
                    result = entry.getKey() + " : " + entry.getValue();
                    System.out.println();

                    if (entry.getValue() >= 2000){
                        bufferedWriterMore.write(result);
                        bufferedWriterMore.newLine();
                    } else {
                        bufferedWriterLess.write(result);
                        bufferedWriterLess.newLine();
                    }
                }

            } catch (IOException e) {
                System.out.println("Ошибка: " + e.getMessage());
                e.printStackTrace();
            }

        } else {
            System.out.println("sourceFile.txt не существует");
        }
    }
}
