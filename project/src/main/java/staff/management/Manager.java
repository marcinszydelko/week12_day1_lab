package staff.management;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, String nInsurance, double salary, String deptName) {
        super(name, nInsurance, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }


}
