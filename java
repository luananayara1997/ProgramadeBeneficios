import java.util.Scanner;

public class ProgramaBeneficios {
   public static void main(String[] args) {
      int saldoBeneficio1 = 500; // saldo inicial do benefício 1
      int saldoBeneficio2 = 500; // saldo inicial do benefício 2
      int saldoBeneficio3 = 500; // saldo inicial do benefício 3
      Scanner scanner = new Scanner(System.in);

      System.out.println("Bem-vindo ao programa de benefícios!");
      System.out.println("Qual benefício você deseja visualizar o saldo?");
      System.out.println("1 - Vale Refeição");
      System.out.println("2 - Vale Alimentação");
      System.out.println("3 - Vale Transporte");
      int opcao = scanner.nextInt();
      scanner.nextLine(); // consumir a quebra de linha pendente

      int saldoAtual = 0;
      if (opcao == 1) {
         saldoAtual = saldoBeneficio1;
      } else if (opcao == 2) {
         saldoAtual = saldoBeneficio2;
      } else if (opcao == 3) {
         saldoAtual = saldoBeneficio3;
      } else {
         System.out.println("Opção inválida.");
         return;
      }

      System.out.println("Seu saldo atual do benefício " + opcao + " é: " + saldoAtual);
      System.out.println("Obrigado por utilizar nosso app de programa de benefícios!");
   }
}
