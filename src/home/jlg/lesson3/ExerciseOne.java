package home.jlg.lesson3;

import java.util.ArrayList;
import java.util.List;

public class ExerciseOne {
    public static void main(String[] args) {
        executeExercise();
    }


    private static void executeExercise() {
        Employee employee1 = new Employee("Rick", "Jones", 25, "San Francisco");
        Employee employee2 = new Employee("Mary", "Smith", 45, "New York");
        Employee employee3 = new Employee("Alex", "Bauer", 55, "Oklahoma");
        Employee employee4 = new Employee("Ben", "Stokes", 22, "Ontario");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

        List<Employee> experiencedEmployees = new ArrayList<>();

        employeeList.forEach(employee -> {
            if (employee.getAge() > 30){
                experiencedEmployees.add(employee);
            }
        });

        experiencedEmployees.forEach(employee -> {
            System.out.println(employee.fullName());
        });



    }


}
