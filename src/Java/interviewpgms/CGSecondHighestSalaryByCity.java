package Java.interviewpgms;

//WAP to find 2nd highest salary of an employee based on city class employee{
//    String nane;
//    String city;
//    int salary;
//}

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    String city;
    int salary;

    public Employee(String name, String city, int salary) {
        this.name = name;
        this.city = city;
        this.salary = salary;
    }

    public String getCity() { return city; }
    public int getSalary() { return salary; }

    @Override
    public String toString() {
        return name + " (" + salary + ")";
    }
}

public class CGSecondHighestSalaryByCity {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Amit", "Pune", 50000),
                new Employee("Rahul", "Pune", 70000),
                new Employee("Vijay", "Pune", 60000),
                new Employee("Neha", "Mumbai", 90000),
                new Employee("Sonia", "Mumbai", 85000),
                new Employee("Raj", "Mumbai", 90000), // Duplicate highest salary example
                new Employee("Anjali", "Delhi", 45000)  // Only one employee in this city
        );

        Map<String, Optional<Integer>> secondHighestByCity = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getCity,
                        Collectors.mapping(
                                Employee::getSalary,
                                Collectors.collectingAndThen(
                                        Collectors.toList(),
                                        list -> list.stream()
                                                .distinct() // Removes duplicates to handle tied highest salaries
                                                .sorted(Comparator.reverseOrder()) // Sort highest to lowest
                                                .skip(1)    // Skip the 1st highest
                                                .findFirst() // Grab the 2nd highest
                                )
                        )
                ));

        // Print the results
        secondHighestByCity.forEach((city, salary) -> {
            if (salary.isPresent()) {
                System.out.println("City: " + city + " | 2nd Highest Salary: " + salary.get());
            } else {
                System.out.println("City: " + city + " | 2nd Highest Salary: Not enough unique data");
            }
        });
    }
}
