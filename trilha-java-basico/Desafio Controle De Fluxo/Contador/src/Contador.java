import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int parametro1;
        int parametro2;

        System.out.println("Digite o primeiro parâmetro: ");
        parametro1 = ler.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        parametro2 = ler.nextInt();

        try {
            contar(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior do que o primeiro");
        }
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        
        if (parametro1 >= parametro2) {
            throw new ParametrosInvalidosException();
        }
        int contagem = parametro2-parametro1;
        
        for (int i = 1; i<= contagem; i++) {
            
            System.out.printf("Imprimindo o número %d%n", i);
        }
    }
}