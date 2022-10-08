package com.mjv;

//public class ContaBancaria {
//    public static void main(String[] args) {
//        System.out.println("Conta Bancaria gerenciada pelo Maven");
//    }
//}

import java.util.Scanner;

public class ContaBancaria {

    public static void main(String[] args) {

        Scanner conta = new Scanner(System.in);

        System.out.println("Escolha Qual operação deseja Fazer !!");

        System.out.println("---------------------------");
        System.out.println("Digite seu Saldo Inicial: ");

        double saldo = conta.nextDouble();
        int opcao = 0;

        while (opcao != 99) {
            System.out.println("Digite 1 para Saque");
            System.out.println("Digite 2 para Deposito ");
            System.out.println("Digite 3 para ver o Saldo");
            System.out.println("Digite 4 para Transferencias");
            System.out.println("Digite 5 para Cancelar Conta");
            System.out.println("Digite 99 para Sair");
            System.out.println("---------------------------");
            opcao = conta.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Qual o valor do saque? ");
                    double saque = conta.nextDouble();
                    if (saque <= saldo) {
                        saldo = (saldo - saque);
                        System.out.println("Você fez um saque de " + saque + " e seu saldo é de " + saldo);
                    } else {
                        System.out.println("Seu saldo é insuficiente");
                    }
                    break;
                case 2:
                    System.out.println("Qual o valor do Deposito? ");
                    double deposito = conta.nextDouble();
                    saldo = deposito + saldo;
                    System.out.println("Você efetuou um deposito de " + deposito + " e seu saldo é de " + saldo);
                    break;
                case 3:
                    System.out.println("seu saldo atual é de " + saldo);
                    break;
                case 4:
                    System.out.println("Tranferencia efetuada com sucesso. ");
                    break;
                case 5:
                    System.out.println("Conta cancelada com sucesso. ");
                    break;
            }
        }
        System.out.println("Sistema Finalizado!!");
    }
}
