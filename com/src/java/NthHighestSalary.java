package src.java;

import src.java.model.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class NthHighestSalary {


    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1,"Davood",99000),
                new Employee(2,"Aakib",99000),
                new Employee(3,"Adil",94000),
                new Employee(4,"Raqeeb",95000),
                new Employee(5,"Asif",80000),
                new Employee(6,"Sameer",98000)
        );

        int salary;
        System.out.println("Enter which salary do you want....");
        try(Scanner sc = new Scanner(System.in)) {
            salary = sc.nextInt();
        }

        System.out.println(nthHighestSalary(employees,salary));
    }


    public static int nthHighestSalary(List<Employee> employees,int n){

        return employees.stream()
                .mapToInt(Employee::salary)
                .distinct()
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(n - 1)
                .findFirst()
                .orElse(-1);// Default Value if nth Highest salary is not present

    }
}
