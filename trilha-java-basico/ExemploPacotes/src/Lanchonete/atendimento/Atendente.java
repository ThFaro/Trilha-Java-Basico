package Lanchonete.atendimento;

public class Atendente {
	
	void trocarGas() {
		System.out.println("Atendente trocando o gás.");		
	}
	public void tirarPedido() {
		System.out.println("Tirando o pedido.");		
	}
	void pegarLancheCozinha() {
		System.out.println("Pegnado o lanche na cozinha.");		
	}
	public void receberPagamento() {
		System.out.println("Recebendo pagamento.");		
	}
	public void servirMesa() {
		pegarLancheCozinha();
		System.out.println("Servindo a mesa.");		
	}
	
}
