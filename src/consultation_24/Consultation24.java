package consultation_24;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Consultation24 {
    public static void main(String[] args) {
        // ### Тестирование решения задач ###
        // Задача 1: Работа с числами
        System.out.println("### Задача 1: Работа с числами ###");
        List<Integer> numbers = Stream.generate(() -> new Random().nextInt(-100, 100)).limit(20).toList();
        System.out.println(sumAllNumbers(numbers));

        // Задача 2: Работа со строками
        System.out.println("### Задача 2: Работа со строками ###");
        List<String> tekst1 = new ArrayList<>();
        tekst1.add("java");
        tekst1.add("Python");
        tekst1.add("Kotlin");
        tekst1.add("C++");
        tekst1.add("JavaScript");
        System.out.println(tekst1);

        System.out.println("=========================");

        List<String> tekst2 = new ArrayList<>( filterAndSort(tekst1));

        System.out.println(tekst2);

        tekst2.add("Ada");
        System.out.println(tekst2);

        // Задача 3: Фильтрация сотрудников
        System.out.println("### Задача 3: Фильтрация сотрудников ###");
        List<Employee> employees = Arrays.asList(
                new Employee("John", "IT", 5000, 6),
                new Employee("Alice", "IT", 6000, 4),
                new Employee("Bob", "HR", 4000, 7),
                new Employee("Carol", "HR", 4500, 3),
                new Employee("David", "IT", 7000, 8),
                new Employee("Eve", "IT", 5500, 5),
                new Employee("Frank", "HR", 4800, 2),
                new Employee("Grace", "HR", 5200, 1),
                new Employee("Harry", "IT", 5800, 9),
                new Employee("Ivy", "IT", 6200, 10)
        );

        List<Employee> filteredEmployees = findExperiencedHighPaidEmployees(employees);

        System.out.println("Все сотрудники:");
        employees.forEach(e -> System.out.printf("- %s (Отдел: %s, Зарплата: $%.2f, Опыт: %d лет)%n",
                e.name, e.department, e.salary, e.yearsOfExperience));

        System.out.println("\nСотрудники с опытом > 5 лет и зарплатой выше средней по отделу:");
        filteredEmployees.forEach(e -> System.out.printf("- %s (Отдел: %s, Зарплата: $%.2f, Опыт: %d лет)%n",
                e.name, e.department, e.salary, e.yearsOfExperience));

    }

    // ### Решение задач ###
    // Решение задачи 1
    public static Integer sumAllNumbers  (List<Integer> numbers) {
        return numbers.stream()
                .filter(num -> num % 2 == 1)
                .mapToInt(num ->  num * num)
                .sum();

    }

    // Решение задачи 2
    public static List<String> filterAndSort(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .filter(s -> s.contains("A"))
                .sorted()
                .limit(3)
                .collect(Collectors.toList());
    }

    // Решение задачи 3
    public static class Employee {
        private String name;
        private String department;
        private double salary;
        private int yearsOfExperience;

        public Employee(String name, String department, double salary, int yearsOfExperience) {
            this.name = name;
            this.department = department;
            this.salary = salary;
            this.yearsOfExperience = yearsOfExperience;
        }

        public String getDepartment() { return department; }
        public double getSalary() { return salary; }
        public int getYearsOfExperience() { return yearsOfExperience; }
        public String getName() { return name; }
    }

    public static List<Employee> findExperiencedHighPaidEmployees(List<Employee> employees) {
        // Сначала вычисляем среднюю зарплату по отделам
        Map<String, Double> avgSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));

        // Затем фильтруем сотрудников
        return employees.stream()
                .filter(e -> e.getYearsOfExperience() > 5)
                .filter(e -> e.getSalary() > avgSalaryByDept.get(e.getDepartment()))
                .collect(Collectors.toList());
    }
}