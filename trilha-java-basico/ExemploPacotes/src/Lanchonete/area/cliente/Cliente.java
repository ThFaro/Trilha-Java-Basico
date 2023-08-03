package Lanchonete.area.cliente;

public class Cliente {
	public void escolherPedido() {
		System.out.println("Cliente escolhendo o pedido.");		
	}
	
	private void consultarSaldoNoApp() {
		System.out.println("Cliente consultando saldo.");		
	}
	public void escolherLanche() {
		System.out.println("Escolhendo o lanche.");	
	}
	public void pagarConta() {
		consultarSaldoNoApp();
		System.out.println("Cliente pagando a conta.");		
	}
	public void fazerPedido() {
		System.out.println("Cliente fazendo pedido.");	
	}
}