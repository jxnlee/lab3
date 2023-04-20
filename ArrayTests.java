import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlace2()
  {
    int[] input1 = { 1, 3, 5, 7, 9};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 9, 7, 5, 3, 1}, input1);
  }

  @Test
  public void testReversed2() 
  {
    int[] input1 = { 2, 4, 6, 8, 10 };
    assertArrayEquals(new int[]{ 10, 8, 6, 4, 2 }, ArrayExamples.reversed(input1));
  }
}
