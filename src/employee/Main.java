package employee;

import java.util.Scanner;

import static employee.Employee.EmploymentType.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employee1 = new Employee("Piotr", "Wolkanin", 5000, B2B);
        Employee employee2 = new Employee();


        employee2.createNewEmployee();

        System.out.println(employee2.printEmployee());

        System.out.println("Zarabia netto: " + employee2.countNettoSalary());





/*
        System.out.println(employee1.printEmployee());
        System.out.println(employee1.getSalaryWithOtherContract(5000,UOD));

        employee1.seteType(UOD);

        System.out.println(employee1.countNettoSalary());
*/






    }
}
