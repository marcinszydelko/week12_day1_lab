import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer employee;

    @Before
    public void before() {
        employee = new Developer("John", "NA7387A", 45000.00);

    }

    @Test
    public void hasName() {
        assertEquals("John", employee.getName());
    }

    @Test
    public void hasNI(){
        assertEquals("NA7387A", employee.getNInsurance());
    }

    @Test
    public void hasSalary(){
        assertEquals(45000.00, employee.getSalary(), 0.01);
    }


    @Test
    public void canRaiseSalary(){
        employee.raiseSalary(1000.00);
        assertEquals(46000.00, employee.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(450.00, employee.payBonus(), 0.01);
    }

}
