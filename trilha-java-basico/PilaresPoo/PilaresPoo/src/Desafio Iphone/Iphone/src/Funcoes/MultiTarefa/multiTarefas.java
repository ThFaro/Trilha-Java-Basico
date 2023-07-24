package Funcoes.MultiTarefa;

import  Funcoes.Internet.internet;
import Funcoes.Musica.player;
import Funcoes.Telefone.telefone;




public class multiTarefas implements internet, telefone, player {

    public void exibirPagina(){
        System.out.println("- PÁGINA ATUAL");
    }
    public void adicionarNovaAba(){
        System.out.println("- NOVA ABA");
    }
    public void atualizarPagina(){
        System.out.println("- ATUALIZANDO PÁGINA");
    }

    public void ligar(){
        System.out.println("- DISCANDO");
    }
    public void atender(){
        System.out.println("- RECEBENDO CHAMADA");
    }
    public void iniciarCorreioVoz(){
        System.out.println("- DISCANDO CORREIO DE VOZ");
    }

    public void tocar(){
        System.out.println("- TOCANDO MÚSICA");
    }
    public void pausar(){
        System.out.println("- PAUSADO");
    }
    public void selecionarMusica(){
        System.out.println("- MÚSICA SELECIONADA");
    }
    
}
