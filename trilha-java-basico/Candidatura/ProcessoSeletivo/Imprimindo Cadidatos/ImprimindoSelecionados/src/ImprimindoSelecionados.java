import java.util.Random;

public class ImprimindoSelecionados {
    public static void main(String[] args) throws Exception {
        String[] candidatos ={"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);

        }
    }
static void entrandoEmContato(String candidato){
    int tentativasRealizadas = 1;
    boolean contiunarTentando = true;
    boolean atendeu=false;

    do{
    //variaveis "continuarTentando" e "tentativasRealizadas" devem sofrer alteraçoes para n ficar em loop infinito
        atendeu = atender();
        contiunarTentando = ! atendeu;
        if(contiunarTentando){
            tentativasRealizadas++;
        }else{
            System.out.println("Contato realizado com sucesso!");
        }

    }while(contiunarTentando && tentativasRealizadas<3);

        if(atendeu){
            System.out.println("Conseguinmos contato com " + candidato + " na " + tentativasRealizadas + " tentativa");
        }else{
            System.out.println("Não conseguimos contato com " + candidato + " Numero maximo excedido.");
        }

}

    //metodo auxiliar. Aqui podemos ver que se o valor entre 1 e 3 for igaul a 1, o candidato atendeu.
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
}
