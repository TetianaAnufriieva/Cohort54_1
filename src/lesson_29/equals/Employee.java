package lesson_29.equals;

import java.util.Objects;

public class Employee {

    private String name;
    private String lastName;
    private int age;

    public Employee(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    /*
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true; // проверка на сравнение с самим собой
        if (obj == null || this.getClass() != obj.getClass()) return false; // проверка на совпадение классов, т.е. типов объектов
        Employee employee = (Employee) obj;

        // Сравнение значимых полей
//        if (!this.name.equals(employee.name)) return false; // если придет this.name = null будет еррор NullPointerException
        if (!Objects.equals(this.name, employee.name)) return false;
        if (!Objects.equals(this.lastName, employee.lastName)) return false;
        return this.age == employee.age;
    }
*/

    /*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, age);
    }
*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
