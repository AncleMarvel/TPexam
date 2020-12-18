import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuarterTest {

    private Quarter quarter;
    int month = 12;
    @Before
    public void setUp() throws Exception {
        System.out.println("Before Quarter.class");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After Quarter.class");
    }

    @org.junit.Before
    public void initTest(){
        this.quarter = new Quarter(month);
    }

    @Test
    public void getQuarter() {
        assertEquals(4, this.quarter.getQuarter());
    }
}