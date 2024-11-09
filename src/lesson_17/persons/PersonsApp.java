package lesson_17.persons;

public class PersonsApp {
    public static void main(String[] args) {
        Person garry = new Person("Garry", 31, "Photo");

        System.out.println(garry.toString());

        Person john = new Person("John", 75, "Reading, music");

        System.out.println(john.toString());

        Person[] people = new Person[5]; // Создается массив для 5 ссылок на объекты типа Person

        people[0] = garry;
        people[3] = john;
        people[1] = new Person("Tom", 5, "crying");

        System.out.println("\n====================\n");

        System.out.println(people[0].toString());
        System.out.println("people[0].getName(): " + people[0].getName());

        people[0].setName("Peter");
        System.out.println("people[0]: " + people[0].toString());
        System.out.println("garry: "+  garry.toString());

        System.out.println("\n===============\n");

        for (int i = 0; i < people.length; i++) {
            if (people[i] != null) {
                System.out.println(people[i].toString());
                System.out.println("people[i].getName(): " + people[i].getName());
            } else {
                System.out.println("people[" + i + "] is null");
            }
        }

        System.out.println("=================\n");

        Person test = new Person("Test", 50, "coding");
        people[2] = test;

        people[2].setName("TestNew");
        test.setAge(60);

        System.out.println("people[2].toString(): " + people[2].toString());

        test = null;

        System.out.println("people[2].getName(): " + people[2].getName());

        test = people[1];
        System.out.println(test.toString());




    }
}
