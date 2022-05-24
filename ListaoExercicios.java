import java.util.Scanner;

public class ListaoExercicios {
  public static void main(String[] args) {
    // new One();
    // new Two();
    // new Three();
    // new Four();
    // new Five();
    // new Six();
    // new Seven();
    new Eight();
  }
}

class One {
  /*
    01 - Crie um algoritmo que informe o código, o nome e o valor de um produto em um supermercado.
    Em seguida, leia a quantidade de unidades deste produto foram compradas e informe na tela o código,
    o nome, o valor unitário e o valor total da compra.
  */

  private Scanner scanner = new Scanner(System.in);

  public One() {
    Product product = new Product("Cicada", 1337, 666.66d);

    System.out.printf("Quantas %ss você quer comprar?", product.name);
    int quantity = scanner.nextInt();
    System.out.print("\n\n-------\n\n");

    System.out.printf(
      """
      Product code: %s
      Product name: %s
      Product price: %.2f

      Quantity: %s

      Final Price: %.2f
      """,
      product.code,
      product.name,
      product.price,
      quantity,
      product.price * quantity
    );
  }

  private class Product {
    public String name;
    public int code;
    public double price;

    public Product(String name, int code, double price) {
      this.code = code;
      this.name = name;
      this.price = price;
    }
  }
}

class Two {
  /*
    02- Crie um algoritmo que leia o salário bruto de um funcionário, assim como o valor que ele
    recebe em vale alimentação. Em seguida, o programa deve ler também o valor de imposto
    sobre o salário INSS (arredondado para 9%). Calcule o salário líquido o funcionário e
    mostre na tela.
  */

  private Scanner scanner = new Scanner(System.in);

  public Two() {

    System.out.printf("Qual é o seu salário? R$");
    double bruteIncome = scanner.nextDouble();
    System.out.print("\n\n-------\n\n");

    System.out.printf("Quanto você recebe de vale alimentação? R$");
    double foodStamps = scanner.nextDouble();
    System.out.print("\n\n-------\n\n");

    double liquidIncome = taxThis(bruteIncome) + foodStamps;

    System.out.printf("Seu salário final (líquido): %.2f\n", liquidIncome);

  }

  private double taxThis(double value) {
    return value - (value / 100 * 9);
  }

}

class Three {
  /*
    03- Comente cada instrução do algoritmo anterior, facilitando sua leitura posterior.
  */

  private Scanner scanner = new Scanner(System.in);

  public Three() {

    // Pergunta qual é o salario
    System.out.printf("Qual é o seu salário? R$");
    double bruteIncome = scanner.nextDouble();
    System.out.print("\n\n-------\n\n");

    // Pergunta quanto recebe de vale alimentaçao
    System.out.printf("Quanto você recebe de vale alimentação? R$");
    double foodStamps = scanner.nextDouble();
    System.out.print("\n\n-------\n\n");

    // Calcula a taxa
    double liquidIncome = taxThis(bruteIncome) + foodStamps;

    // Mostra o salário líquido    
    System.out.printf("Seu salário final (líquido): %.2f\n", liquidIncome);

  }

  // Diminui do salario 9% dele mesmo
  private double taxThis(double value) {
    return value - (value / 100 * 9);
  }

}

class Four {
  /*
    04- Crie um algoritmo que receba via leitura do teclado dois valores inteiros. Na sequência,
    mostre na tela o processo de multiplicação do primeiro valor pelo segundo valor, mostrando
    junto o resultado final.
    EX: os valores lidos foram 5 e 3.
    Tela:
    5 x 3 = 15
  */

  private Scanner scanner = new Scanner(System.in);

  public Four() {
    System.out.print("Digite um número: ");
    int firstValue = scanner.nextInt();
    System.out.print("\n\n-------\n\n");

    System.out.print("Digite outro número: ");
    int secondValue = scanner.nextInt();
    System.out.print("\n\n-------\n\n");

    System.out.printf("%s x %s = %s\n", firstValue, secondValue, firstValue * secondValue);
  }

}

class Five {
  /*
    05- Recrie o exercício anterior, recebendo agora três valores inteiros. Mostre na tela o
    processo de multiplicação do primeiro valor pelo segundo valor, seguindo da posterior
    adição do terceiro valor, mostrando junto o resultado final.

    EX: os valores lidos foram 5, 3 e 8.
    Tela:
    5 x 3 = 15
    15 + 8 = 23
  */

  private Scanner scanner = new Scanner(System.in);

  public Five() {
    System.out.print("Digite um número: ");
    int firstValue = scanner.nextInt();
    System.out.print("\n\n-------\n\n");

    System.out.print("Digite outro número: ");
    int secondValue = scanner.nextInt();
    System.out.print("\n\n-------\n\n");

    System.out.print("Digite mais um número: ");
    int thirdValue = scanner.nextInt();
    System.out.print("\n\n-------\n\n");

    int firstMulSecond = firstValue * secondValue;

    System.out.printf("%s x %s = %s\n", firstValue, secondValue, firstMulSecond);
    System.out.printf("%s + %s = %s\n", firstMulSecond, thirdValue, firstMulSecond + thirdValue);
  }

}

class Six {
  /*
    06- Considere um algoritmo para gerenciamento de compras para uma fazenda de cavalos.
    Faça um programa que calcule o mínimo de ferraduras que devem ser compradas,
    sabendo que devem haver pelo menos duas ferraduras extras para cada animal.
  */

  private Scanner scanner = new Scanner(System.in);

  public Six() {
    System.out.print("Quantos cavalos você tem? ");
    int horsesQuantity = scanner.nextInt();
    System.out.print("\n\n-------\n\n");
  
    System.out.printf("Você precisará comprar %s ferraduras (duas para cada cavalo e duas reserva)", horsesQuantity * 4);
  }

}

class Seven {
  /*
    07- Faça um algoritmo para um motorista de aplicativo que leia o preço da gasolina e o total de
    pagamento. Informe na tela a quantidade (em Litros) que ele conseguirá abastecer.
  */

  private Scanner scanner = new Scanner(System.in);

  public Seven() {
    System.out.print("Qual é o preço da gasolaina? ");
    double oilPrice = scanner.nextDouble();
    System.out.print("\n\n-------\n\n");

    System.out.print("Qual é o valor total que voce quer abastecer? ");
    double totalPrice = scanner.nextDouble();
    System.out.print("\n\n-------\n\n");

    double liters = totalPrice / oilPrice;

    System.out.printf("Com R$%.2f você poderá abastecer %.2f litros\n", totalPrice, liters);
  }

}

class Eight {
  /*
    08- O mesmo motorista de aplicativo utiliza um algoritmo diferente seu. Nele é lido a taxa 
    quilômetros por litro que seu carro faz, assim como o preço da gasolina. Mostre na tela a
    quantidade de quilômetros que o carro fará com o valor abastecido.
  */

  private Scanner scanner = new Scanner(System.in);

  public Eight() {
    System.out.print("Qual é o preço da gasolaina? ");
    double oilPrice = scanner.nextDouble();
    System.out.print("\n\n-------\n\n");

    System.out.print("Quantos km/l o seu carro faz? ");
    double carsKmPerLiter = scanner.nextDouble();
    System.out.print("\n\n-------\n\n");

    System.out.print("Qual é o valor total que voce quer abastecer? ");
    double totalPrice = scanner.nextDouble();
    System.out.print("\n\n-------\n\n");

    double liters = totalPrice / oilPrice;
    double meuPau = liters * carsKmPerLiter;

    System.out.printf("Com R$%.2f você poderá rodar %.2f quilômetros\n", totalPrice, meuPau);
  }

}
