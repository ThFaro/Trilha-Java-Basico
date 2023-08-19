package Interface.Interface.src.equipamentos.multifuncional;

import Interface.Interface.src.equipamentos.impressora.Impressora;
import Interface.Interface.src.equipamentos.copiadora.*;
import Interface.Interface.src.equipamentos.digitalizadora.*;

public class Multifuncional implements Copiadora, Digitalizadora, Impressora  {

    public void copiar(){
        System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
    public void digitalizar(){
        System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
     }
     public void imprimir(){
        System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
     



    
}
