import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DebtTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testCase1() {
        Debt debt = new Debt(120000.0, 1.01);
        debt.printBalance();

        debt.waitOneYear();
        debt.printBalance();

        int years = 0;
        while (years < 20) {
            debt.waitOneYear();
            years = years + 1;
        }

        debt.printBalance();

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(3, lines.length);

        Assert.assertEquals(120000, Double.parseDouble(lines[0].trim()), 0.01);
        Assert.assertEquals(121200.0, Double.parseDouble(lines[1].trim()), 0.01);
        Assert.assertEquals(147887.0328416936, Double.parseDouble(lines[2].trim()), 0.01);
    }

    @Test
    public void testCase2() {
        Debt debt = new Debt(1000.50, 1.01);

        debt.printBalance();
        debt.waitOneYear();
        debt.printBalance();
        debt.waitOneYear();
        debt.printBalance();
        debt.waitOneYear();
        debt.printBalance();
        debt.waitOneYear();
        debt.printBalance();

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(1000.50, Double.parseDouble(lines[0].trim()), 0.01);
        Assert.assertEquals(1000.50 * 1.01, Double.parseDouble(lines[1].trim()), 0.01);
        Assert.assertEquals(1000.50 * Math.pow(1.01, 2), Double.parseDouble(lines[2].trim()), 0.01);
        Assert.assertEquals(1000.50 * Math.pow(1.01, 3), Double.parseDouble(lines[3].trim()), 0.01);
        Assert.assertEquals(1000.50 * Math.pow(1.01, 4), Double.parseDouble(lines[4].trim()), 0.01);
    }
    
    @Test
    public void testCase3() {
        Debt debt = new Debt(1000, 1);

        debt.printBalance();
        debt.waitOneYear();
        debt.printBalance();
        debt.waitOneYear();
        debt.printBalance();
        debt.waitOneYear();
        debt.printBalance();
        debt.waitOneYear();
        debt.printBalance();
        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(1000, Double.parseDouble(lines[0].trim()), 0.01);
        Assert.assertEquals(1000, Double.parseDouble(lines[1].trim()), 0.01);
        Assert.assertEquals(1000, Double.parseDouble(lines[2].trim()), 0.01);
        Assert.assertEquals(1000, Double.parseDouble(lines[3].trim()), 0.01);
        Assert.assertEquals(1000, Double.parseDouble(lines[4].trim()), 0.01);
    }
}
