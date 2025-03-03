/*
Task 3
Дан список Person с полями name, age, city. Используйте Stream API для фильтрации людей,
которые старше определенного возраста и проживают в определенном городе, а затем соберите их в список.
Например, старше 25 лет и проживающих в городе "Berlin"
 */

package homework_41;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(List.of(
                new Person("Alice", 30, "Berlin"),
                new Person("Bob", 22, "Berlin"),
                new Person("Charlie", 27, "Munich"),
                new Person("David", 35, "Berlin"),
                new Person("Eve", 40, "Hamburg"),
                new Person("Frank", 29, "Berlin"),
                new Person("Grace", 25, "Berlin"),
                new Person("Hannah", 32, "Frankfurt"),
                new Person("Isaac", 28, "Cologne"),
                new Person("Jack", 45, "Stuttgart"),
                new Person("Laura", 33, "Dresden"),
                new Person("Michael", 38, "Leipzig"),
                new Person("Nina", 26, "Düsseldorf"),
                new Person("Oliver", 31, "Hanover")
        ));

        List<Person> peopleList = people.stream()
                .filter(person -> person.getAge() > 25 && person.getCity().equals("Berlin"))
                .sorted(Comparator.comparingInt(Person :: getAge))
                .collect(Collectors.toList());
        System.out.println(peopleList);
    }
}
