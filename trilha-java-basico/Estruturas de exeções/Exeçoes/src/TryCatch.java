import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class TryCatch {
    public static void main(String[] args) throws Exception {
        try{
        Scanner ler;
        ler = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = ler.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = ler.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = ler.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = ler.nextDouble();

        System.out.println("OLá, me chamo "+ nome.toUpperCase()+" "+ sobrenome.toUpperCase());
        System.out.println("Tenho "+idade+" anos ");
        System.out.println("Minha altura é "+altura);
        ler.close();

        }
        catch(InputMismatchException e){
            System.out.print("Os campos idade e altura precisam ser numéricos\n");
        }
    }
}