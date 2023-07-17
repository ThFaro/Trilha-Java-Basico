package Lanchonete.atendimento.cozinha;

public class Almoxarifado {
	
	
	void trocarGas() {
		System.out.println("Almoxarife trocando o gás.");		
	}
	private void controlarEntrada() {
		System.out.println("Controlando entrada dos itens.");		
	}
	public void controlarSaida() {
		System.out.println("Controlando saida dos itens.");		
	}
	void entregarIngredientes() {
		System.out.println("Entregando ingredientes.");
		controlarSaida();	
	}
}
