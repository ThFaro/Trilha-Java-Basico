import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) throws Exception {
        /*Joao ligou para seu amigo para dizer que se entupiu de doces */
        System.out.println("Discando...");

        do{
            System.out.println("Telefone tocando");
        }while(tocando());
        System.out.println("Alô!!");
    }

        private static boolean tocando(){
            boolean atendeu =  new Random().nextInt(3)==1;
            System.out.println("Atendeu? " + atendeu);
            return ! atendeu;
        }
 }
       


