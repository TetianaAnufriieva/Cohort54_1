/*
Дан файл text.txt
Ваша задача используя классы пакета java.io создать файл с именем 'copy.txt'
и скопировать в него все данные из файла 'text.txt'
 */
package homework_44.task1;
import java.io.*;

public class Task1 {
    public static void main(String[] args) {

        File fileOld = new File("src/homework_44/task1/text.txt");

        File path = new File("src/homework_44/task1");
        path.mkdirs();
        File fileNew = new File(path, "copy.txt");

        if (fileOld.exists()) {
            try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader(fileOld));
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileNew));
            ){
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();
                }

            } catch (IOException e) {
                System.out.println("Ошибка: " + e.getMessage());
                e.printStackTrace();
            }

        } else {
            System.out.println("text.txt не существует");
        }
    }
}
