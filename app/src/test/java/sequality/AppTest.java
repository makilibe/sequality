/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
  @Test
  public void testAppHasAGreeting() {
    App classUnderTest = new App();
    assertNotNull("app should have a greeting", classUnderTest.getGreeting());
  }

  @Test
  public void testAppReternHelloWorld() {
    App classUnderTest = new App();
    assertEquals("Hello World!", classUnderTest.getGreeting());
  }

  @Test
  public void testallsum() {
    App classUnderTest = new App();
    double expected = 55;
    assertEquals(expected, allsum(1, 10));
  }

  @Test
  public void oddsum() {
    App classUnderTest = new App();
    double expected = 10;
    assertEquals(expected, oddsum(1, 10) );
  }

  @Test
  public void oddsum() {
    App classUnderTest = new App();
    double expected = 30;
    assertEquals(expected, evensum(1, 10) );
  }
}
