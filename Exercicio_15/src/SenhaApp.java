import java.util.Scanner;

public class SenhaApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int senha = sc.nextInt();

    while (senha != 1980) {
      System.out.println("Senha inválida!");
      senha = sc.nextInt();
    }
    
    System.out.println("Acesso permitido");

    sc.close();
  }

}
