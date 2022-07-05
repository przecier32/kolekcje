package employee;

public class Employee {

    private String name;
    private String surname;
    private Integer salaryBrutto;
    private char gender;
    private EmploymentType eType;




//    private ICountNettoSalary strategy;



//    public void setStrategy(ICountNettoSalary strategy) {
//        this.strategy = strategy;
//    }
//
//    public double countNettoSalary(double salaryBrutto, double tax ) {
//        return strategy.countNettoSalary(salaryBrutto,tax);
//    }



    public  enum EmploymentType {
        B2B(0.3), UOP(0.5), UOD(0.1);

        private final double tax;
        EmploymentType(double tax) {
            this.tax = tax;
        }

    }


    public Employee(String name, String surname, Integer salaryBrutto, char gender, EmploymentType eType) {

        this.name = name;
        this.surname = surname;
        this.salaryBrutto = salaryBrutto;
        this.gender = gender;
        this.eType = eType;


    }



    public double getSalaryWithOtherContract(int bruttoSalary, EmploymentType eType){
        System.out.println("Na umowie " + eType + " zarobisz: ");
        return  bruttoSalary - (bruttoSalary * eType.tax);

    }

    public int getSalaryBrutto() {
        return salaryBrutto;
    }

    public void setSalaryBrutto(Integer salaryBrutto) {
        this.salaryBrutto = salaryBrutto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public EmploymentType geteType() {
        return eType;
    }

    public void seteType(EmploymentType eType) {
        this.eType = eType;
    }

    public char getGender() { return gender; }

    public String toString(){
        return "Imie i nazwisko: " + name + " " + surname + " Zarobki brutto: " + salaryBrutto + " Umowa: " + eType;
    }

}

