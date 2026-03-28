//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaSalario contaSalario = new ContaSalario();
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
            System.out.println("1-Conta Corrente");
            System.out.println("2-Conta Salario");
            System.out.println("----------------------------------------------");


            num = scanner.nextInt();


            if (num == 1) {
                System.out.println("Selecione as opções:");
                System.out.println("0-Sair");
                System.out.println("1-Deposito");
                System.out.println("2-Saque");
                System.out.println("3-Dados da Conta");
                num_interno = scanner.nextInt();

                //Seleção - Conta Corrente
                while (num_interno != 0) {
                    if (num_interno == 1) {
                        System.out.println("-----------------Deposito-----------------");
                        System.out.println("Insira o valor:");
                        double valor = scanner.nextDouble();

                        //Validando o Valor>0
                        if (valor > 0) {
                            contaCorrente.deposito(valor);
                            System.out.println("0-Sair");
                            num_interno = scanner.nextInt();
                        } else {
                            while (valor < 0) {
                                System.out.println("Valor Incorreto");
                                System.out.println("Insira um valor:");
                                valor = scanner.nextDouble();
                                System.out.println("-----------------------Depositando-----------------------\n");
                            }
                            System.out.println("Deposito Realizado");
                            System.out.println("Saldo atual: " + contaCorrente.getSaldo());
                            System.out.println("0-Sair");
                            num_interno = scanner.nextInt();
                        }

                    } else if (num_interno == 2) {
                        System.out.println("-------------------Saque-------------------");
                        System.out.println("Insira o valor:");
                        double valor = scanner.nextDouble();
                        //Valida se o valor é menor que o saldo atual
                        if (valor <= contaCorrente.getSaldo()) {
                            contaCorrente.transacao(valor);
                            System.out.println("--------------Saque Realizado--------------");
                            System.out.println("Saldo atual: " + contaCorrente.getSaldo());
                        } else {
                            while (valor > contaCorrente.getSaldo()) {

                                System.out.println("Saldo Isuficiente");
                                System.out.println("Insira o valor:");
                                valor = scanner.nextDouble();
                                contaCorrente.transacao(valor);
                            }
                        }
                        System.out.println("0-Sair");
                        num_interno = scanner.nextInt();

                    } else if (num_interno == 3) {
                        contaCorrente.infoDados();
                        System.out.println("-----------------------------------------------------------------------");
                        System.out.println("Selecione as opções:");
                        System.out.println("0-Sair");
                        num_interno = scanner.nextInt();
                    }
                }
                // Conta Salario
            } else if (num == 2) {
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("Selecione as opções:");
                System.out.println("0-Sair");
                System.out.println("1-Deposito");
                System.out.println("2-Saque");
                System.out.println("3-Dados da Conta");
                System.out.println("-----------------------------------------------------------------------");
                num_interno = scanner.nextInt();
                //Seleção - Conta Salario
                while (num_interno != 0) {
                    if (num_interno == 1) {
                        System.out.println("-----------------Deposito-----------------");
                        System.out.println("Insira o valor:");
                        double valor = scanner.nextDouble();

                        //Validando o Valor>0
                        if (valor > 0) {
                            contaSalario.deposito(valor);
                            System.out.println("0-Sair");
                            num_interno = scanner.nextInt();
                        } else {
                            while (valor < 0) {
                                System.out.println("Valor Incorreto");
                                System.out.println("Insira um valor:");
                                valor = scanner.nextDouble();
                                System.out.println("-----------------------Depositando-----------------------\n");
                            }
                            System.out.println("Deposito Realizado");
                            System.out.println("Saldo atual: " + contaSalario.getSaldo());
                            System.out.println("0-Sair");
                            num_interno = scanner.nextInt();
                        }

                    } else if (num_interno == 2) {
                        System.out.println("-----------------Saque-----------------");
                        System.out.println("Insira o valor:");
                        double valor = scanner.nextDouble();
                        //Valida se o valor é menor que o saldo atual
                        if (valor <= contaSalario.getSaldo()) {
                            contaSalario.transacao(valor);
                            System.out.println("--------------Saque Realizado--------------");
                            System.out.println("Saldo atual: " + contaSalario.getSaldo());
                        } else {

                            while (valor > contaSalario.getSaldo()) {

                                System.out.println("Saldo Isuficiente");
                                System.out.println("Insira o valor:");
                                valor = scanner.nextDouble();
                                contaSalario.transacao(valor);
                            }

                        }

                        System.out.println("0-Sair");
                        num_interno = scanner.nextInt();
                    } else if (num_interno == 3) {
                        contaSalario.infoDados();
                        System.out.println("-----------------------------------------------------------------------");
                        System.out.println("Selecione as opções:");
                        System.out.println("0-Sair");
                        num_interno = scanner.nextInt();
                    }
                }

            }

        }

    }

}
