package Contas;

import Cliente.Cliente;

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente){
        super(cliente);
    }
    
    public void imprimirExtrato(){
        System.out.println("=== EXTRATO IMPRESSO CONTA CORRENTE ===");
        super.imprimirInfosComnuns();
    }

    public void exibirExtrato(){
        System.out.println("=+ EXIBINDO EXTRATO CONTA CORRENTE +=");
        super.imprimirInfosComnuns();
    }

    public void exibirSaldoTela(){
        System.out.println("- EXIBINDO SALDO ATUAL CONTA CORRENTE -");
        super.exibirSaldo();
    }
}
