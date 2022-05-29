import java.util.Scanner;
import java.text.DecimalFormat;

public class Bhaskara {
  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    System.out.print("'A' value: ");
    double a = scanner.nextDouble();
    System.out.print("\n-------\n");

    System.out.print("'B' value: ");
    double b = scanner.nextDouble();
    System.out.print("\n-------\n");
    
    System.out.print("'C' value: ");
    double c = scanner.nextDouble();
    System.out.print("\n-------\n");

    try {
      double[] lenis = calcular(a, b, c);

      DecimalFormat df = new DecimalFormat();

      System.out.println(df.format(lenis[0]));
      System.out.println(df.format(lenis[1]));
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public static double[] calcular(double a, double b, double c) throws Exception {
    double bottom = 2 * a;
    double delta = (b * b) - (4 * a * c);

    if (delta < 0)
      throw new Exception("Delta is negative");

    double root = Math.sqrt(delta);

    if (root % 1 != 0)
      throw new Exception("Root isn't an integer");

    double end1 = (-b + root) / bottom;
    double end2 = (-b - root) / bottom;

    return new double[] { end1, end2 };
  }
}
