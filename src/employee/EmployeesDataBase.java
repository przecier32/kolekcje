package employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeesDataBase {

    private final List<Employee> theEmployee = new ArrayList<>();



    public boolean addEmployee(Employee newEmployee){

        theEmployee.add(newEmployee);
        return true;

    }
//forEach , distinct
    public void printAll(){

        theEmployee.stream().distinct().forEach(System.out::println);

    }
// filter, Collectors.toList
    public void salaryFilterOver5k(){
        List<Employee> employeesSalaryOver5k = theEmployee.stream()
                                                            .filter(s -> s.getSalaryBrutto() > 5000)
                                                            .collect(Collectors.toList());
        System.out.println(employeesSalaryOver5k);
    }

//allMatch
    public boolean isAnyoneOver1k (){
        System.out.println("Is everyone salary over 1k?: ");

        return theEmployee.stream().allMatch(s -> s.getSalaryBrutto() > 1000);
    }
//anyMatch
    public boolean findSpecifyName (){
        System.out.println("Is there Zdzislaw?: ");

        return theEmployee.stream().anyMatch(s -> s.getName() == "Zdzislaw");
    }
//noneMatch
    public boolean isThereContract (){
        System.out.println("Is there contrakt B2B?: ");

        return theEmployee.stream().noneMatch(s -> s.geteType() == Employee.EmploymentType.B2B);
    }
//filter, count
    public long howManyWomenEmployees() {
        System.out.println("Ilosc kobiet pracujacych w naszej firmie: ");
        return theEmployee.stream().filter(g -> g.getGender() == 'k').count();
    }

//Collectors.counting
    public long howManyEmployees() {
        System.out.println("Ilosc pracownikow: ");
        return theEmployee.stream().collect(Collectors.counting());
    }

//Optional, findAny
    public void isThereSomething() {

        Optional<Employee> answer = theEmployee.stream().findAny();

        if (answer.isPresent()) {
            System.out.println(answer.get());     //jak cos jest to zwraca pierwszy lepszy
        }
        else {
            System.out.println("Brak pracownikow!!!");
        }
    }

    public void findAnyWomen() {
        System.out.println("Szukamy pierwszej lepszej kobiety: ");
        Optional<Employee> anyWomen = theEmployee.stream()
                .filter(g -> g.getGender() == 'k')
                .findFirst();

        if (anyWomen.isPresent()) {
            System.out.println(anyWomen.get());
        }
        else {
            System.out.println("Brak kobiet?");
        }

    }

    public void bonusSalary(Integer a) {

        List<Integer> bonusList = theEmployee.stream()
                .filter(s -> s.getSalaryBrutto() < 3000)
                .peek(s -> System.out.println("Zarobki przed premia: " + " " + s.getSalaryBrutto() + " " + s.getName() + " " + s.getSurname()))
                .map(e -> e.getSalaryBrutto() + a)
                .collect(Collectors.toList());

        System.out.println("Zarobki po premii: " + bonusList);

    }
        public void lowestSalary() {

        Optional<Employee> low = theEmployee.stream()
                .min(Comparator.comparing(s -> s.getSalaryBrutto()));

        if (low.isPresent()) {
            System.out.println("Najnizsze zarobki: " + low.get());
        }
        else {
            System.out.println("Brak danych.");
        }

    }

    public void bigestSalary() {

        Optional<Employee> max = theEmployee.stream()
                .max(Comparator.comparing(s -> s.getSalaryBrutto()));

        if (max.isPresent()) {
            System.out.println("Najwyzsze zarobki: " + max.get());
        }
        else {
            System.out.println("Brak danych.");
        }

    }

    public void sortBySalary() {

        List<Employee> sort = theEmployee.stream()
                .sorted(Comparator.comparing(Employee::getSalaryBrutto))
                .collect(Collectors.toList());

        sort.forEach(System.out::println);
    }


    void filterByName() {

        List<String> name = theEmployee.stream()
                .filter(n -> n.getName() == "Piotr")
                .map(n -> n.getSurname() + " " + n.getName())
                .collect(Collectors.toList());
        System.out.println(name);
    }






}
