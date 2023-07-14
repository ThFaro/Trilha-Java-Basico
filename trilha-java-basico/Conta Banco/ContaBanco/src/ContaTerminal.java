import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner ler;
        ler = new Scanner(System.in);
       
        String nomeCompleto="";
        int numero;
        double saldo=237.48;
        String agencia= "";

        System.out.println("SEJA BEM VINDO AO BANCO DIO.ME\n");

        System.out.print("Digite seu nome completo por favor: " );
        nomeCompleto = ler.nextLine();

        System.out.print("Por favor, digite o número da sua agência: " + agencia);
        agencia = ler.nextLine();

        System.out.print("Agora digite a sua conta: " );
        numero = ler.nextInt();


        System.out.print("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia+ ", conta "+ numero + " e seu saldo " + saldo + " já está disponível para saque " );




    }
}

