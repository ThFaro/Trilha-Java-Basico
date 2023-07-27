package Contas;

import Cliente.Cliente;

public abstract class Conta implements InterfaceConta {

    private static final String AGENCIA_PADRAO = "0995-4";
    private static int SEQUENCIAL = 1;
    
    protected String agencia;
    protected int numero;
    protected Cliente cliente;
    protected double saldo;

    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        
       
    }

    public  void sacar(double valor){
        this.saldo -=valor;
    }
    public void  depositar(double valor){
        this.saldo +=valor;
    }
    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    public void enviarPix(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public String getAgencia(){
        return agencia;

    }
    public int getNumero(){
        return numero;

    }
    public double getSaldo(){
        return saldo;

    }

    protected void imprimirInfosComnuns(){
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Cpf: %s", this.cliente.getCpf()));
        System.out.println(String.format("Agencia: %s", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
        System.out.println(String.format("Saldo atual: %.2f", this.saldo));
    }
    protected void exibirSaldo(){
        System.out.println(String.format("Saldo atual: %.2f", this.saldo));
    }


    
}
