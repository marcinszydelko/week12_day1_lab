package staff;

public abstract class Employee {
    private String name;
    private String nInsurance;
    private double salary;

    public Employee(String name, String nInsurance, double salary) {
        this.name = name;
        this.nInsurance = nInsurance;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNInsurance() {
        return nInsurance;
    }

    public double getSalary() {
        return salary;
    }

    public double raiseSalary(double increment) {
        double raisedSalary = 0;
        if(increment >= 0) {
          raisedSalary = this.salary += increment;
        }
        return raisedSalary;
    }

    public double payBonus() {
        return this.salary * 0.01;
    }


    public void changeName(String name) {
        if(name.length() > 0){
            this.name = name;
        }
    };
}
