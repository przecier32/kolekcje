package employee;

import java.util.Scanner;

import static employee.Employee.EmploymentType.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        EmployeesDataBase employeesDataBase = new EmployeesDataBase();



        Employee e1 = new Employee("Jan", "Kowalski",8400, 'm', UOP );
        Employee e2 = new Employee("Przemyslaw", "Ogorek",7600, 'm', UOP );
        Employee e3 = new Employee("Joanna", "Kapusta",1300, 'k', UOP );
        Employee e4 = new Employee("Piotr", "Wolkanin", 2100, 'm', B2B);
        Employee e5 = new Employee("Andrzej", "Truskawka",6800, 'm', UOP );
        Employee e6 = new Employee("Krystyna", "Banan",35000, 'k', UOD );
        Employee e7 = new Employee("Bogdan", "Pietruszka",25675, 'm', UOP );
        Employee e8 = new Employee("Piotr", "Salata", 2800, 'm', B2B);


        employeesDataBase.addEmployee(e1);
        employeesDataBase.addEmployee(e2);
        employeesDataBase.addEmployee(e3);
        employeesDataBase.addEmployee(e4);
        employeesDataBase.addEmployee(e5);
        employeesDataBase.addEmployee(e6);
        employeesDataBase.addEmployee(e7);
        employeesDataBase.addEmployee(e8);

        employeesDataBase.addEmployee(e7);

        employeesDataBase.printAll();
       // employeesDataBase.salaryFilterOver5k();
//        System.out.println(employeesDataBase.isAnyoneOver1k());
//
//        System.out.println(employeesDataBase.findSpecifyName());
//
//        System.out.println(employeesDataBase.isThereContract());
//
//        System.out.println(employeesDataBase.howManyWomenEmployees());
//
//        System.out.println(employeesDataBase.howManyEmployees());

        //employeesDataBase.findAnyWomen();

        employeesDataBase.bonusSalary(500);
        employeesDataBase.lowestSalary();
        employeesDataBase.sortBySalary();


    }
}
