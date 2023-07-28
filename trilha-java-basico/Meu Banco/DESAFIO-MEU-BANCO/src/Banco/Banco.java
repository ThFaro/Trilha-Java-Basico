package Banco;

import java.util.List;
import Contas.Conta;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public static void main(String[] args) {
        Banco banco = new Banco();

        
        System.out.println("Lista de contas do banco:");
        for (Conta conta : banco.getContas()) {
            System.out.println("Número da conta: " + conta.getNumero());
            System.out.println("Titular: " + conta.getNome());
            System.out.println("Saldo: " + conta.getSaldo());
            System.out.println("----------------------");
        }
    }
}
