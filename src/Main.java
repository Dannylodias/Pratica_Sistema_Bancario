//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        Conta conta = new Conta();
        Pessoa pessoa1 = new Pessoa();
        Scanner scanner = new Scanner(System.in);
        int num = -1, num_interno = -1;

        contaCorrente.setSaldo(2000);

        //Loop Perfil
        System.out.println("-----------------Iniciando--------------------");
        while (num != 0) {

            System.out.println("Selecione as opções");
            System.out.println("0-Sair");
            System.out.println("1-Conta Corrente:");
            System.out.println("2-Conta Salario");

            num = scanner.nextInt();


            if (num == 1) {
                System.out.println("Selecione as opções - Corrente:");
                System.out.println("0-Sair");
                System.out.println("1-Deposito");
                System.out.println("2-Saque");
                System.out.println("3-Dados da Conta");
                num_interno = scanner.nextInt();

                    //Parte Interna Menu Seleção - Conta Corrente
                while (num_interno != 0) {
                    if (num_interno == 1) {
                        System.out.println("Você acessou a aba Deposito");
                        System.out.println("Quanto quer Depositar?");
                        contaCorrente.deposito(scanner.nextDouble());

                        System.out.println("Deposito Realizado");
                        System.out.println("Valor atual: " + contaCorrente.getSaldo());
                        System.out.println("0-Sair");
                        num_interno= scanner.nextInt();

                    } else if (num_interno == 2) {
                        System.out.println("Você acessou a aba Deposito");
                        System.out.println("Quanto quer Sacar?");
                        contaCorrente.transacao(scanner.nextDouble());
                        System.out.println("SaqueRealizado");
                        System.out.println("Valor atual: " + contaCorrente.getSaldo());

                        System.out.println("0-Sair");
                        num_interno= scanner.nextInt();
                    }
                }

            } else if (num == 2) {
                System.out.println("Selecione as opções - Conta Corrente");
                System.out.println("0-Sair");
                System.out.println("1-Deposito");
                System.out.println("2-Saque");
                System.out.println("3-Dados da Conta");
                num = scanner.nextInt();

            } else {

            }

        }

    }
}