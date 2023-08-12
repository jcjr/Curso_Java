import java.util.Scanner;

public class PlanoCartesiano {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double x, y;

    x = sc.nextDouble();
    y = sc.nextDouble();

    if (x > 0.0 && y > 0.0) {
      System.out.println("Quadrante Q1");
    } else if (x < 0.0 && y > 0.0) {
      System.out.println("Quadrante Q2");
    } else if (x < 0.0 && y < 0.0) {
      System.out.println("Quadrante Q3");
    } else if (x > 0.0 && y < 0.0) {
      System.out.println("Quadrante Q4");
    } else if (x == 0.0 && y != 0.0) {
      System.out.println("Eixo Y");
    } else if (x != 0.0 && y == 0.0) {
      System.out.println("Eixo X");
    } else if (x == 0.0 && y == 0.0) {
      System.out.println("Na origem");
    }
    sc.close();
  }

}
