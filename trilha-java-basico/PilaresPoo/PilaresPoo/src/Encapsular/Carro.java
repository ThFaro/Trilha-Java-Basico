package Encapsular;
public class Carro {
    public void ligar(){
        /*Os meteodos confereCombustivel e o confereCambio estão sendo verificados
         * dentro do metodo ligar, sem que o usuário veja.
         */
        confereCambio();
        confereCombustivel();
       System.out.println("CARRO LIGADO");
    }

    /*Os meteodos confereCombustivel e o confereCambio estao privados apenas para a classe carro
     * os tornando invisiveis ao ususário (Autodromo), através do ENCAPSULAMENTO.
     */
    private void confereCombustivel(){
        System.out.println("CONFERINDO COMBUSTIVEL");
    }
    private void confereCambio(){
        System.out.println("CONFERINDO CAMBIO EM P");
    }
}
