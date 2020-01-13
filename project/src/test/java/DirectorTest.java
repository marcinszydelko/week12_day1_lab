import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static junit.framework.TestCase.assertEquals;

public class DirectorTest {


    private Director director;
    @Before
    public void before() {
        director = new Director("John", "AS123987R", 60000.00,"General", 200000.00);
    }

    @Test
    public void hasBydget() {
        assertEquals(200000.00, director.getBudget());
    }

    @Test
    public void canPayBonusTwoPercent() {
        assertEquals(1200.00, director.payBonus(), 0.01);
    }
}
