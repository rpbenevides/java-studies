
// Figura 2.7: Addition.java
// Programa de adição que insere dois números, entao exibe a soma deles.
import java.util.Scanner; //programa utiliza a classe Scanner

public class Addition {
  // método main inicia a execuçao do aplicativo Java
  public static void main(String[] args) {
    // cria um Scanner para obter entrada a partir da janela de comando
    try (Scanner input = new Scanner(System.in)) {
      ;

      int number1; // primeiro número a somar
      int number2; // segundo número a somar
      int sum; // soma de number1 e number2

      System.out.println("Enter first integer: "); // prompt
      number1 = input.nextInt(); // lê o primeiro número fornecido pelo usuário

      System.out.println("Enter second integer: "); // prompt
      number2 = input.nextInt(); // lê o segundo número fornecido pelo usuário

      sum = number1 + number2; // soma os números, depois armazena o total em sum

      System.out.printf("Sum is %d.%n", sum); // exibe sum
    } // o objeto Scanner será fechado automaticamente ao final do bloco try.
  } // fim dom método main
} // fim da class Addition