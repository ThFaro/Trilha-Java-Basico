import Cliente.Cliente;
import Contas.Conta;
import Contas.ContaCorrente;
import Contas.ContaPoupanca;

import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        String cpfDigitado;
        String senhaDigitada;

        Cliente thiago = new Cliente();
        thiago.setNome("Thiago Faro");
        thiago.setCpf("229.238.738-74");
        thiago.setSenha("232523");

        Conta cc = new ContaCorrente(thiago);
        cc.depositar(1000);
        Conta poupanca = new ContaPoupanca(thiago);
        poupanca.depositar(1500);

        Cliente laura = new Cliente();
        laura.setNome("Laura Caires");
        laura.setCpf("123.456.789-00");
        laura.setSenha("123456");

        Conta cc1 = new ContaCorrente(laura);
        cc1.depositar(500);
        Conta poupanca1 = new ContaPoupanca(laura);
        poupanca1.depositar(800);

        while (true) {
            System.out.println("\nBem-vindo ao Banco SASAKI\n");
            System.out.println("Digite seu cpf (ou '0' para sair): ");
            cpfDigitado = ler.nextLine();
            System.out.println();

            if (cpfDigitado.equals("0")) {
                System.out.println("Obrigado. Volte sempre!");
                return;
            } else if (cpfDigitado.equals(thiago.getCpf())) {
                while (true) {
                    System.out.println("Digite sua senha:");
                    senhaDigitada = ler.nextLine();

                    if (senhaDigitada.equals(thiago.getSenha())) {
                        System.out.printf("Olá %s,", thiago.getNome());
                        mostrarMenu(ler, cc, poupanca);
                        break;
                    } else {
                        System.out.println("Senha inválida");
                    }
                }
            } else if (cpfDigitado.equals(laura.getCpf())) {
                while (true) {
                    System.out.println("Digite sua senha:");
                    senhaDigitada = ler.nextLine();

                    if (senhaDigitada.equals(laura.getSenha())) {
                        System.out.printf("Olá %s,", laura.getNome());
                        mostrarMenu(ler, cc1, poupanca1);
                        break;
                    } else {
                        System.out.println("Senha inválida");
                    }
                }
            } else {
                System.out.println("CPF INVÁLIDO");
            }
        }
    }

    public static void mostrarMenu(Scanner ler, Conta cc, Conta poupanca) {
        int escolha;
        while (true) {
            System.out.println("\nMENU INICIAL");
            System.out.println("1-Imprimir extrato Conta Corrente");
            System.out.println("2-Imprimir extrato Conta Poupança");
            System.out.println("3-Exibir extrato Conta Corrente");
            System.out.println("4-Exibir extrato Conta Poupança");
            System.out.println("5-Exibir saldo Conta Corrente");
            System.out.println("6-Exibir saldo Conta Poupança");
            System.out.println("7-Sacar");
            System.out.println("8-Transferir");
            System.out.println("9-Depositar");
            System.out.println("10-PIX");
            System.out.println("0-Sair");
            System.out.println("Escolha uma opção: ");
            escolha = ler.nextInt();
            ler.nextLine(); 
            System.out.println();

            switch (escolha) {
                case 1:
                    cc.imprimirExtrato();
                    break;

                case 2:
                    poupanca.imprimirExtrato();
                    break;

                case 3:
                    cc.exibirExtrato();
                    break;

                case 4:
                    poupanca.exibirExtrato();
                    break;

                case 5:
                    cc.exibirSaldoTela();
                    break;

                case 6:
                    poupanca.exibirSaldoTela();
                    break;

                case 7:
                    System.out.println("1-Saque Conta Corrente \n" + "2-Saque Conta Poupança");
                    int contaSaque = ler.nextInt();
                    System.out.println("Qual valor gostaria de sacar: ");
                    double saque = ler.nextDouble();
                    System.out.println();

                    if (contaSaque == 1 && saque <= cc.getSaldo()) {
                        cc.sacar(saque);
                        System.out.println("Saque realizado com sucesso");
                        cc.exibirSaldoTela();
                    } else if (contaSaque == 1 && saque > cc.getSaldo()) {
                        System.out.println("Saldo insuficiente. Operação Cancelada");
                        cc.exibirSaldoTela();

                    } else if (contaSaque == 2 && saque <= poupanca.getSaldo()) {
                        poupanca.sacar(saque);
                        System.out.println("Saque realizado com sucesso");
                        poupanca.exibirSaldoTela();
                    } else if (contaSaque == 2 && saque > poupanca.getSaldo()) {
                        System.out.println("Saldo insuficiente. Operação Cancelada");
                        poupanca.exibirSaldoTela();
                    } else {
                        System.out.println("Opção inválida");
                    }
                    break;

                case 8:

                    System.out.println("Qual valor gostaria de transferir: ");
                    double valorDesejado = ler.nextDouble();
                    cc.transferir(valorDesejado, poupanca);
                    cc.exibirSaldoTela();
                
                    break;

                case 9:
                    System.out.println("Qual valor gostaria de depositar: ");
                    double deposito = ler.nextDouble();
                    cc.depositar(deposito);
                    break;

                case 10:
                    System.out.println("Qual valor do PIX: ");
                    double transferenciaPix = ler.nextDouble();
                    cc.enviarPix(transferenciaPix, poupanca);
                    break;

                case 0:
                    System.out.println("Obrigado");
                    return;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
