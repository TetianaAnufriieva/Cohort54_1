package homework_44.task1;

import java.io.*;

public class TaskCopyFile_fromTeacher {
    public static void main(String[] args) {

        File path = new File("src/homework_44/task1");

        String inputFile = "text.txt";
        String outputFile = "copy.txt";

        // Создаем поток для чтения из файла
        try (FileReader fileReader = new FileReader(new File(path, inputFile));
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             // Создам поток для записи
             FileWriter fileWriter = new FileWriter(new File(path, outputFile));
             BufferedWriter writer = new BufferedWriter(fileWriter);
        ) {

            // Читаю строки из файла в цикле (пока строки есть). Каждую прочитанную строку сразу записываю в другой файл
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}