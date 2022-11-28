package product;

public class Tests {

  public static void assertTrue(boolean condition) {
    if (!condition) {
      throw new AssertionError();
    }
  }


  public static void assertEquals(double a, double b) {
    if (a != b) {
      throw new AssertionError();
    }
  }

  public static void assertEquals(String a, String b) {
    if (!a.contains(b)) {
      throw new AssertionError();
    }
  }

}
