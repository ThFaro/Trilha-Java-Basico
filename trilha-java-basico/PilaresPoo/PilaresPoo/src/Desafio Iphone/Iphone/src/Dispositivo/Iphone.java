

public class Iphone {
    public static void main(String[] args) {
        
        multiTarefas ip = new multiTarefas();
     
        telefone telefone = ip;
        player player = ip;
        internet internet= ip;

        System.out.println();
        System.out.println("      TELEFONE");
        telefone.atender();
        telefone.ligar();
        telefone.iniciarCorreioVoz();
        System.out.println();

        System.out.println("    PLAYER MUSIC");
        player.selecionarMusica();
        player.tocar();
        player.pausar();
        System.out.println();

        System.out.println("       SAFARI");
        internet.exibirPagina();
        internet.adicionarNovaAba();
        internet.atualizarPagina();
        System.out.println();



       




    }
}
