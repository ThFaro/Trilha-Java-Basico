package Contas;

public class Main {
    public static void main(String[] args) {
        Cliente thiago = new Cliente();
        thiago.setNome("Thiago");

        Conta cc = new ContaCorrente(thiago);
        cc.depositar(100);
        

        Conta poupanca = new ContaPoupança(thiago);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        System.out.println();
        poupanca.imprimirExtrato();

    }
}