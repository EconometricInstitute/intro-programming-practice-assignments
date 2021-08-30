import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class RemoveLastTest {
  @Test
  public void testCase1() {
    List<String> texts = new ArrayList<>(List.of("First", "Second", "Third"));
    
    RemoveLast.removeLast(texts);
    Assert.assertEquals(2, texts.size());
    Assert.assertEquals(List.of("First", "Second"), texts);
    
    RemoveLast.removeLast(texts);
    Assert.assertEquals(1, texts.size());
    Assert.assertEquals(List.of("First"), texts);
    
    RemoveLast.removeLast(texts);
    Assert.assertEquals(0, texts.size());
  }
  
  @Test
  public void testLargeList() {
    List<String> texts = new ArrayList<>(List.of("First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh"));

    RemoveLast.removeLast(texts);
    Assert.assertEquals(6, texts.size());
    Assert.assertEquals(List.of("First", "Second", "Third", "Fourth", "Fifth", "Sixth"), texts);
    
    RemoveLast.removeLast(texts);
  }
  
  @Test
  public void testEmptyList() {
      List<String> texts = new ArrayList<>();
      
      RemoveLast.removeLast(texts);
  }
}
