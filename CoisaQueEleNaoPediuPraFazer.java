import java.util.*;

public class Main {
  private static final String RESET = "\u001B[0m";
  private static final String BRIGHT_RED = "\u001B[91m";
  private static final String BRIGHT_GREEN = "\u001B[92m";
  private static final String BRIGHT_YELLOW = "\u001B[93m";
  private static final String BRIGHT_BLUE = "\u001B[94m";
  private static final String BRIGHT_CYAN = "\u001B[96m";

  public static void main(String[] args) {
    Dictionary<String, Object> data = inputData();

    System.out.printf("Seu nome é %s%s%s e voce nasceu em %s%s%s\n",
      BRIGHT_BLUE, data.get("nomeDoAmigao"), RESET,
      BRIGHT_RED, Calendar.getInstance().get(Calendar.YEAR) - Integer.parseInt(data.get("idadeDoAmigao").toString()), RESET
    );

    System.out.printf("A %smédia de altura%s dos andares do prédio é de %s%.1f%s\n",
      BRIGHT_BLUE, RESET,
      BRIGHT_GREEN, (float) data.get("alturaPredio") / (int) data.get("totalAndarPredio"), RESET
    );

    float baseRet = (float) data.get("baseDoRetangulo");
    float alturaRet = (float) data.get("alturaDoRetangulo");

    double areaRet = baseRet * alturaRet;
    double perimetroRet =
      baseRet
      + alturaRet
      + (Math.sqrt(
          baseRet * baseRet
        + alturaRet * alturaRet
      ));

    System.out.printf("A %sárea%s do %sretângulo%s é %s%.0f (%.2f)%s e o %sperímetro%s é %s%.0f (%.2f)%s\n",
      BRIGHT_BLUE, RESET,
      BRIGHT_CYAN, RESET,
      BRIGHT_GREEN, areaRet, areaRet, RESET,
      BRIGHT_BLUE, RESET,
      BRIGHT_GREEN, perimetroRet, perimetroRet, RESET
    );

    System.out.printf("A %scircunferencia%s do %scírculo%s é aproximadamente %s%.2f%s\n",
      BRIGHT_BLUE, RESET,
      BRIGHT_CYAN, RESET,
      BRIGHT_GREEN, 2 * 3.141535 * (float) data.get("raioDoCirculo"), RESET
    );

    System.out.printf("""
      %sInformações do livro:%s
      %s├ Nome:%s %s%s%s
      %s├ Autor:%s %s%s%s
      %s└ Data de publicação:%s %s%s%s
      """,
      BRIGHT_YELLOW, RESET,
      BRIGHT_YELLOW, RESET,
      BRIGHT_CYAN, data.get("nomeDoLivro"), RESET,
      BRIGHT_YELLOW, RESET,
      BRIGHT_CYAN, data.get("autorDoLivro"), RESET,
      BRIGHT_YELLOW, RESET,
      BRIGHT_CYAN, data.get("publDoLivro"), RESET
    );
  }

  public static Dictionary<String, Object> inputData() {
    Dictionary<String, Object> values = new Hashtable<>(9);

    System.out.print("Digite seu nome: ");
    values.put("nomeDoAmigao", input(String.class));

    System.out.print("Digite sua idade: ");
    values.put("idadeDoAmigao", input(Integer.class));

    System.out.print("Digite a altura do prédio: ");
    values.put("alturaPredio", input(Float.class));

    System.out.print("Digite o total de andares do prédio: ");
    values.put("totalAndarPredio", input(Integer.class));

    System.out.print("Digite a base do retângulo: ");
    values.put("baseDoRetangulo", input(Float.class));

    System.out.print("Digite a altura do retângulo: ");
    values.put("alturaDoRetangulo", input(Float.class));

    System.out.print("Digite o raio do círculo: ");
    values.put("raioDoCirculo", input(Double.class));

    System.out.print("Digite o nome do livro: ");
    values.put("nomeDoLivro", input(String.class));

    System.out.print("Digite o autor do livro: ");
    values.put("autorDoLivro", input(String.class));

    System.out.print("Digite a data de publicação: ");
    values.put("publDoLivro", input(String.class));

    System.out.println();
    return values;
  }

  public static Object input(Object type) {
    while (true) {
      Scanner scanner = new Scanner(System.in);
      String value = scanner.nextLine();

        if (type.toString().equals("class java.lang.String")) {
          return value;
        } else if (type.toString().equals("class java.lang.Integer")) {
          try {
            Integer.parseInt(value);
                    return value;
          } catch (Exception ignored) { }
        } else if (type.toString().equals("class java.lang.Float")) {
          try {
            Integer.parseInt(value);
                    return value;
          } catch (Exception ignored) { }
        } else if (type.toString().equals("class java.lang.Double")) {
          try {
            Integer.parseInt(value);
                    return value;
          } catch (Exception ignored) { }
        }

      System.out.print("Valor inválido, tente novamente: ");
    }
  }
}

