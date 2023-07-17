package Lanchonete.atendimento.cozinha;

import Lanchonete.atendimento.Atendente;

public class Cozinheiro {
	
	public void adicionarLancheNoBalcao() {
		System.out.println("Levando lanche natural ou hamburger no balcão");
	}
	public void adicionarSucoNoBalcao() {
		System.out.println("Levando suco no balcão");
	}
	public void adicionarCombooNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();	
	}

	void pedirParaTrocarGas(Almoxarifado meuAmigo) {
		meuAmigo.trocarGas();
	}
	void pedirIngredientes(Almoxarifado almoxarifado) {
		almoxarifado.entregarIngredientes();
	}
	private void lavarIngredientes() {
		System.out.println("Lavando ingredientes");
	}
	private void baterVitamina() {
		System.out.println("Batendo vitamina");
	}
	private void prepararLanche() {
		System.out.println("Preparando lanche");
	}
	private void selecionarIngredientesVitamina() {
		System.out.println("Selecionando ingredientes da vitamina");
	}
		
}