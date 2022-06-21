import java.util.Scanner;

public class Listao2 {

  private static final Scanner scanner = new Scanner(System.in);  
    
  public static void main(String[] args) {
    // one();
    // two();
    // three();
    // four();
    // five();
    // six();
    // seven();
    // eight();
    nine();
  }
  
  private static void one() {
    // 01- Faça um algoritmo que leia o nome e o sobrenome de uma pessoa, guarde-os em
    // diferentes variáveis e mostre na tela o nome completo da pessoa. O algoritmo não deverá
    // guardar espaços em brancos nas variáveis, exceto caso o nome da pessoa seja composto.

    final String RESET = "\u001B[0m";
    final String RED = "\u001B[31m";
    
    String name = "";
    String lastName = "";

    System.out.print("Digite seu nome: ");
    while (true) {
      name = scanner.nextLine().trim();
      if (name.length() != 0) break;
      
      System.out.print(RED + "Escreve direito mongol: " + RESET);
    }

    System.out.print("Digite seu sobrenome: ");
    while (true) {
      lastName = scanner.nextLine().trim();
      if (lastName.length() != 0) break;
      
      System.out.print(RED + "Escreve direito mongol: " + RESET);
    }

    System.out.printf("Eu sou magico, descobri seu nome :O\nSeu nome é: %s %s\n", name, lastName);
  }
  
  private static void two() {
    // 02- Desenvolva um algoritmo que leia a distância em metros que um ciclista percorreu em uma
    // prova e mostre na tela essa distância em quilômetros.

    System.out.print("Digite os metros: ");
    float metros = scanner.nextFloat();

    System.out.println("Km: " + metros / 1000);
  }
  
  private static void three() {
    // 03- Elabore um algoritmo em Java que solicite ao usuário a digitação de 4 letras distintas. O
    // usuário deverá digitar uma por vez. O algoritmo deverá informar em tela a palavra formada
    // pelas 4 letras do usuário.
    // Exemplo de tela (os valores em cinza foram digitados pelo usuário):
    // Digite a primeira letra: C
    // Digite a segunda letra: A
    // Digite a terceira letra: S
    // Digite a quarta e última letra: A
    // A palavra formada é: CASA.

    System.out.print("Digite um numero: ");
    String letra1 = scanner.nextLine().substring(0, 1);
    System.out.print("Digite outro numero: ");
    String letra2 = scanner.nextLine().substring(0, 1);
    System.out.print("Digite outro numero: ");
    String letra3 = scanner.nextLine().substring(0, 1);
    System.out.print("Digite outro numero: ");
    String letra4 = scanner.nextLine().substring(0, 1);

    System.out.println("A palavra formada é: " + letra1 + letra2 + letra3 + letra4);
  }
  
  private static void four() {
    // 04- Crie um algoritmo em Java que leia um número inteiro digitado pelo usuário e mostre na
    // tela o número antecessor e o número sucessor dele.

    System.out.print("Digite um numero: ");
    int numero = scanner.nextInt();

    System.out.printf("%d %d %d\n", numero - 1, numero, numero + 1);
  }
  
  private static void five() {
    // 05- Faça um programa em Java que solicite que o usuário digite seu nome e sua idade (em
    // anos e meses). Em seguida o programa deverá calcular quantos dias o usuário já viveu.
    // Para simplificação, considere que todos os anos possuem 365 dias (desconsidere anos
    // bissextos) e todos os meses possuem exatamente 30 dias.
    // Exemplo de tela (os valores em cinza foram digitados pelo usuário):
    // Digite o seu nome: Geraldo
    // Digite quantos anos você tem: 16
    // Você tem 16 anos e quantos meses? 4
    // Geraldo, você já viveu aproximadamente 5960 dias.

    System.out.print("Qual é o seu nome? ");
    String nome = scanner.nextLine().trim();
    System.out.print("Quantos anos voce tem? ");
    int ano = scanner.nextInt();
    System.out.print("Quantos meses voce tem? ");
    int meses = scanner.nextInt();

    System.out.printf("%s, voce já viveu aproximadamente %d dias\n", nome, ((ano * 12 + meses) * 30));
  }
  
  private static void six() {
    // 06- Uma atleta maratonista olímpica deseja melhorar seu desempenho através de um
    // comparativo de dados das suas atividades físicas. Faça um programa em Java que permite
    // que a atleta possa inserir via teclado a distância total que ela correu e também o tempo que
    // ela esteve em movimento. O programa deverá informar para a atleta a velocidade média
    // que ela correu.

    System.out.print("Distancia total: ");
    float distancia = scanner.nextFloat();
    System.out.print("Por quanto tempo: ");
    float tempo = scanner.nextFloat();

    System.out.printf("Velocidade media: %.1f\n", distancia / tempo);
  }
  
  private static void seven() {
    // 07- Faça um programa que leia um valor monetário em reais digitado pelo usuário. Em
    // seguida, mostre a conversão deste valor em dólares. Use a cotação atual do dia em que
    // você estiver fazendo essa atividade, e mostre-a na tela. Para fins de didática, não se
    // preocupe com a símbolo de ponto flutuante das moedas (vírgula ou ponto).
    // Exemplo de tela (os valores em cinza foram digitados pelo usuário):
    // Digite o valor em reais: 3.80
    // COTAÇÃO DE HOJE:
    // US$1.00 = R$5.44
    // Total: US$0.69.

    float dolar = 5.13f;
    
    System.out.print("Denhero em reais: ");
    float denhero = scanner.nextFloat();
    
    System.out.printf("US$1.00 = R$%.2f\n", dolar);
    System.out.printf("Total: U$%.2f\n", denhero / dolar);
  }
  
  private static void eight() {
    // 08 - Escreva um programa em Java que pergunte ao usuário qual o tempo transcorrido em um
    // cronômetro. O tempo deve ser lido em horas, minutos e segundos. Em seguida, o algoritmo
    // deve mostrar todo este tempo em segundos apenas.

    System.out.print("Tempo que passou (h):");
    int horas = scanner.nextInt();
    System.out.print("Tempo que passou (m):");
    int minutos = scanner.nextInt();
    System.out.print("Tempo que passou (s):");
    int segundos = scanner.nextInt();

    System.out.printf("Total de segundos: %d\n", (horas * 60 * 60) + (minutos * 60) + segundos);
  }
  
  private static void nine() {
    // 09- Escreva um programa em Java que leia uma temperatura em graus Farenheit e a imprima
    // em graus Celsius. A conversão de graus Farenheit para Celsius é dada através da seguinte
    // fórmula

    // f - 32 / 1.8
    
    System.out.print("Graus Farenheit: ");
    float farenheit = scanner.nextFloat();

    System.out.printf("Graus Celsius: %.1f", (farenheit - 32) / 1.8);
    
    
  }
  
}