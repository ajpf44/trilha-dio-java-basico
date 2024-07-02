package desafios;

import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            int opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    saldo = depositar(saldo, scanner);
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente
                    saldo = sacar(saldo, scanner);
                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    System.out.printf("Saldo atual: %.1f\n", saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        
        scanner.close();
        
    }
    
    static double depositar(double saldo, Scanner sc){
        System.out.printf("Valor a ser depositado: ");
        
        double valorDepositado =  sc.nextDouble();
        sc.nextLine(); //limpeza de buffer
        double novoSaldo =  valorDepositado+saldo;
        System.out.println("Nova saldo: " + novoSaldo);
        
        return novoSaldo;
    }
    
    static double sacar(double saldo, Scanner sc){
        System.out.printf("Valor a ser sacado: ");
        double valorSacado = sc.nextDouble();
        sc.nextLine(); //limpeza de buffer
        
        if( saldo < valorSacado){
          System.out.println("Saldo insuficiente.");
          return saldo;
        }
        
        double novoSaldo = saldo - valorSacado;
        System.out.printf("Saldo atual: %.1f",novoSaldo);
        
        return novoSaldo;
    }
}
