import org.junit.Assert;
import org.junit.Test;

public class GradeRegisterTest {
    @Test
    public void testAverages() {
        GradeRegister register = new GradeRegister();
        register.addGradeBasedOnPoints(15);
        register.addGradeBasedOnPoints(27);
        register.addGradeBasedOnPoints(95);
        register.addGradeBasedOnPoints(85);

        Assert.assertEquals(2.25, register.averageOfGrades(), 0.01);
        Assert.assertEquals((15.0 + 27 + 95 + 85) / 4, register.averageOfPoints(), 0.01);
    }
}
