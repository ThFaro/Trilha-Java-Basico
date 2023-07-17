package Lanchonete;
import Lanchonete.area.cliente.Cliente;
import Lanchonete.atendimento.Atendente;
import Lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        
   

    Atendente atedente = new Atendente();
    atedente.servirMesa();
    atedente.receberPagamento();

    Cliente cliente = new Cliente();
    cliente.escolherPedido();
    cliente.pagarConta();
  

    Cozinheiro cozinheiro = new Cozinheiro();
    cozinheiro.adicionarLancheNoBalcao();
    cozinheiro.adicionarSucoNoBalcao();
    cozinheiro.adicionarCombooNoBalcao();





    

    }
}