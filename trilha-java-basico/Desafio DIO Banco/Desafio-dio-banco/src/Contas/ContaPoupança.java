package Contas;

public class ContaPoupança extends Conta {

    public ContaPoupança(Cliente cliente){
        super(cliente);
    }
    

    public void imprimirExtrato() {
        System.out.println("=== EXTRATO CONTA POUPANÇA ===");
        super.imprimirInfosComuns();

    }
}







