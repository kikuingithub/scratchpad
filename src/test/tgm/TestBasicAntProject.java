package tgm.test;

import tgm.BasicAntProject;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBasicAntProject {
  @Test
  public void testGetStringToPrint() {
    BasicAntProject bap = new BasicAntProject();
    assertEquals("Hello World!", bap.getStringToPrint());
  }
}
