## Notas

no google mesmo tem aquelas opção de como vai abrir e o stackedit funcionou entao se tu nao tiver nenhum leitor de markdown usa ele mas no typora é mais facil de ler :)

---

# Exercicio 0

> ### Encontre (se houverem) erros nos seguintes comandos de atribuição

  - #### **A.** **BOOLEAN X;**
    - falta o valor
  - #### **B.** **real Y, W;**
    - falta o valor
  - #### **C.** **inteiro Z;**
    - falta o valor
  - #### **D.** X = Y = W;
  - #### **E.** Z = Y;
  - #### **F.** **W + 1 = Y + W;**
    - +1 deve estar do lado direito da declaração
  - #### **G.** **W = 3.5;**
    - sem `f` depois do numero
  - #### **H.** **Y = 6,2;**
    - virgula é um caractere invalido

# Exercicio 1

> ### Assinale os identificadores inválidos e indique o que os torna inválidos

  - #### **A.** (X)
    - parenteses
  - #### **B.** U2
  - #### **C.** **AH !**
    - exclamação e espaço
  - #### **D.** **“Aluno”**
    - aspas
  - #### **E.** **#55**
    - hashtag e numero
  - #### **F.** **KM/L**
    - barra
  - #### **G.** UYT
  - #### **H.** NABOO
  - #### **I.** **AB\*C**
    - asterisco
  - #### **J.** dia
  - #### **K.** CEP
  - #### **L.** **P{0}**
    - chaves
  - #### **M.** Endereço
  - #### **N.** **Prazo de Entrega**
    - espaços
  - #### **O.** **Dia/Mês**
    - barra e acento
  - #### **P.** data
  - #### **Q.** RG
  - #### **R.** B52
  - #### **S.** Tatooine
  - #### **T.** **5DICAS**
    - nao pode começar com número
  - #### **U.** **João**
    - acento
  - #### **V.** Maria
  - #### **W.** **2112**
    - apenas numeros
  - #### **X.** harry_potter
  - #### **Y.** **cão**
    - acento
  - #### **Z.** gato
  - #### **AA.** cachorro12
  - #### **BB.** **12papaio**
    - começa com numero
  - #### **CC.** **Smartphone+**
    - caractere especial
  - #### **DD.** maria
  - #### **EE.** U2
  - #### **FF.** **algoritmo-algoritmo**
    - caractere especial
  - #### **GG.** **informática_mr**
    - acento
  - #### **HH.** **dia.mes**
    - ponto
  - #### **II.** aniversario
  - #### **JJ.** **22/02/2022**
    - caractere especial
  - #### **KK.** CPF
  - #### **LL.** **E-mail**
    - caractere especial
  - #### **MM.** Windows
  - #### **NN.** text

# Exercicio 2

> ### Vamos supor que as variáveis NT, NA, NMat e GEN sejam utilizadas para armazenar respectivamente uma nota de um aluno, seu nome, seu número de matrícula e o gênero dele. Declare corretamente essas variáveis, associando o tipo primitivo adequado ao dado que será guardado de acordo com as regras vistas em aula.

  ```java
    double NT; /* nota aluno */
    String NA; /* nome aluno */
    int NMat; /* numero matricula */
    char GEN; /* genero aluno (M/F) */
  ```

# Exercicio 3

> ## Crie um algoritmo em Java que receba em duas variáveis dois valores: 9 e -15. Em seguida, faça a adição em cada um deles de um valor 5 e mostre o resultado de ambos na tela;

  ```java
    public class App {
      public static void main(String[] args) throws Exception {
        int value1 = 9;
        int value2 = -15;

        value1 += 5;
        value2 += 5;

        System.out.printf("Valor 1: %s\n", value1);
        System.out.printf("Valor 2: %s\n", value2);
      }
    }
  ```

# Exercicio 4

> ## Crie um algoritmo em Java que receba dois valores a sua escolha e, duas variáveis. Em seguida realize a some deles, guarde o resultado e informe na tela: `“O resultado da soma de 5 e 7 é **12.**”`. (5 e 7 são valores afim de exemplo. O programa deverá funcionar para qualquer que sejam esses dois valores!)

  ```java
    import java.util.Scanner;
    import java.text.DecimalFormat;

    public class App {
      public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat();

        System.out.print("Digite um número: ");
        double value1 = scanner.nextDouble();

        System.out.print("Digite outro número: ");
        double value2 = scanner.nextDouble();

        scanner.close();

        System.out.printf("O resultado da soma de %s e %s é %s\n",
          formatter.format(value1),
          formatter.format(value2),
          formatter.format(Double.sum(value1, value2))
        );
      }
    }

  ```

# Exercicio 5

> ## Faça um programa que receba via atribuição (código) o nome de uma pessoa e sua idade, guardando em variáveis. Logo depois imprima estes valores em tela.

  ```java
    import java.util.Scanner;

    public class App {
      public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual é o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Qual é a sua idade: ");
        int idade = scanner.nextInt();

        scanner.close();

        System.out.printf("Olá %s! Você tem %d anos.\n", nome, idade);
      }
    }
  ```

# Exercicio 6

> ## Escreva um programa capaz de realizar a soma, a subtração, a multiplicação e a divisão de dois números inteiros predefinidos por você, programador. O resultado das operações deve ser exibido na tela.

  ```java
    public class App {
      public static void main(String[] args) throws Exception {
        int first_number = 50;
        int second_number = 5;

        System.out.printf(
          "%d + %d = %d\n" +
          "%d - %d = %d\n" +
          "%d / %d = %d\n" +
          "%d * %d = %d\n",
          first_number, second_number,
          first_number + second_number,

          first_number, second_number,
          first_number - second_number,

          first_number, second_number,
          first_number / second_number,

          first_number, second_number,
          first_number * second_number
        );
      }
    }
  ```

# Exercicio 7

> ## Crie um programa que receba via código a largura e o comprimento de um terreno e mostre na tela a área total existe neste terreno.

  ```java
    import java.util.Scanner;
    import java.math.BigDecimal;
    import java.text.DecimalFormat;

    public class App {
      public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat();

        System.out.print("Digite a largura do terreno: ");
        BigDecimal width = scanner.nextBigDecimal();
        System.out.print("Digite a comprimento do terreno: ");
        BigDecimal length = scanner.nextBigDecimal();

        scanner.close();

        System.out.printf("A área do terreno é: %sm2\n", formatter.format(width.multiply(length)));
      }
    }
  ```

# Exercicio 8

> ## Crie um programa que receba quatro valores via código (atribuição). Mostre o somatório deles e o resto da divisão do somatório por cada um deles.

  ```java
    import java.util.Scanner;
    import java.math.BigDecimal;
    import java.text.DecimalFormat;

    public class App {
      public static void main(String[] args) throws Exception {
          Scanner scanner = new Scanner(System.in);
          DecimalFormat formatter = new DecimalFormat();

          BigDecimal[] numbers = new BigDecimal[4];

          System.out.print("Digite um número: ");
          numbers[0] = scanner.nextBigDecimal();
          System.out.print("Digite outro número: ");
          numbers[1] = scanner.nextBigDecimal();
          System.out.print("Digite mais um número: ");
          numbers[2] = scanner.nextBigDecimal();
          System.out.print("Digite outro número denovo: ");
          numbers[3] = scanner.nextBigDecimal();

          scanner.close();

          BigDecimal sum = new BigDecimal(0);

          for (BigDecimal number : numbers) {
            sum = sum.add(new BigDecimal(number.toString()));
          }

          System.out.printf(
            "A soma de todos os números digitados é: %s\n",
            formatter.format(sum)
          );

          for (BigDecimal number : numbers) {
            System.out.printf(
              "O resto da divisão de %s por %s é: %s\n",
              sum, number, formatter.format(sum.remainder(number))
            );
          }
      }
    }
  ```

# Exercicio 9, 10 e 11
> ## Não vou fazer coisa que eu já fiz
