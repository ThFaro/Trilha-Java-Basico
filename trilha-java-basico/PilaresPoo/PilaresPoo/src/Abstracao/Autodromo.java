package Abstracao;

public class Autodromo {
    public static void main(String[] args) {
    
    Carro jeep = new Carro();
    jeep.setChassi("878878");
    jeep.ligar();

    Moto z400 = new Moto();
    z400.setChassi("123223");
    z400.ligar();

    
    }
}
