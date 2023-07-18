import Apps.FacebookMessenger;
import Apps.MSNMessenger;
import Apps.ServicoMensagemInstantanea;
import Apps.Telegram;

public class Usuário {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;
/*
        Não se sabe qual APP
        mas qualquer um deverá enviar e receber mensagem
 */
        String appEscolhido = "msn";

        if(appEscolhido.equals("msn"))
        smi = new MSNMessenger();
        else if(appEscolhido.equals("fbm"))
        smi = new FacebookMessenger();
        else if(appEscolhido.equals("tlg"))
        smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();

        
    }
    
}
