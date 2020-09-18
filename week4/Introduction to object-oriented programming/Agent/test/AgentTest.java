import org.junit.Assert;
import org.junit.Test;

public class AgentTest {
  @Test
  public void testAgent() {
     Agent bond = new Agent("James", "Bond");
     Assert.assertEquals("My name is Bond, James Bond", bond.toString());

    Agent ionic = new Agent("Ionic", "Bond");
    Assert.assertEquals("My name is Bond, Ionic Bond", ionic.toString());

    Agent spiderman = new Agent("Spiderman", "Bond");
    Assert.assertEquals("My name is Bond, Spiderman Bond", spiderman.toString());
  }
}
