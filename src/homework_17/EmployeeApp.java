package homework_17;

public class EmployeeApp {
    public static void main(String[] args) {

        Employee employee = new Employee("Bob", 37, 4236.38);

        System.out.println(employee.info());

        employee.setName("Tim");
        String name1 = employee.getName();
        System.out.println(name1);

        employee.setAge(45);
        int age1 = employee.getAge();
        System.out.println(age1);

        employee.setSalary(5631.14);
        double salary1 = employee.getSalary();
        System.out.println(salary1);

        System.out.println(employee.info());
    }
}
