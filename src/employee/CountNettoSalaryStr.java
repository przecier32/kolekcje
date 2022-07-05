package employee;

public class CountNettoSalaryStr implements ICountNettoSalary {


    @Override
    public double countNettoSalary(double bruttoSalary, double tax) {
        return bruttoSalary - (bruttoSalary * tax);
    }
}
