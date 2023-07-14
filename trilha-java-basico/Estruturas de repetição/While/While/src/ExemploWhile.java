import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) throws Exception {
    
        /*Joao recebeu R$ 50,00 de mesada e foi gastar tudo na loja de doces.Enquanto o valor total não for gasto,
         ele continuará adicionando no carrinho.
         */
        double mesada = 50.0;

        while(mesada>0){
            double valorDoce = valorAleatorio();
            if (valorDoce>mesada)
                valorDoce=mesada;
            System.out.println("Doce de valor: " + valorDoce + " adicionado ao carrinho");
            mesada=mesada-valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joao gastou toda sua mesada em doces");
    }

        private static double valorAleatorio(){
            return ThreadLocalRandom.current().nextDouble(2, 8);
        }
            
}
 

