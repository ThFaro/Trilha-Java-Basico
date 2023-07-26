package Contas;

import Cliente.Cliente;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }
    
    public void imprimirExtrato(){
        System.out.println("=== EXTRATO IMPRESSO CONTA POUPANÇA ===");
        super.imprimirInfosComnuns();

    }
    public void exibirExtrato(){
        System.out.println("=+ EXIBINDO EXTRATO CONTA POUPANÇA +=");
        super.imprimirInfosComnuns();
    }

    public void exibirSaldoTela(){
        System.out.println("- EXIBINDO SALDO ATUAL CONTA POUPANÇA -");
        super.exibirSaldo();
    }
    
}
