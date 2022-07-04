package employee;

public class Employee implements ICountNettoSalary {

    private String name;
    private String surname;
    private int salaryBrutto;


    public  enum EmploymentType {
        B2B(0.3), UOP(0.5), UOD(0.1);

        private final double tax;
        EmploymentType(double tax) {
            this.tax = tax;
        }

    }
    private EmploymentType eType;




    public Employee(String name, String surname, int salaryBrutto, EmploymentType eType) {

        this.name = name;
        this.surname = surname;
        this.salaryBrutto = salaryBrutto;
        this.eType = eType;

    }

    @Override
    public double countNettoSalary() {
        double nettoSalary;
        nettoSalary = salaryBrutto - (salaryBrutto * eType.tax);

        return nettoSalary;
    }

    public double getSalaryWithOtherContract(int bruttoSalary, EmploymentType eType){
        System.out.println("Na umowie " + eType + " zarobisz: ");
        return  bruttoSalary - (bruttoSalary * eType.tax);

    }

    public int getSalaryBrutto() {
        return salaryBrutto;
    }

    public void setSalaryBrutto(int salaryBrutto) {
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

    public String printEmployee(){
        return "Imie i nazwisko: " + name + " " + surname + " Zarobki brutto: " + salaryBrutto + " Umowa: " + eType;
    }

}

