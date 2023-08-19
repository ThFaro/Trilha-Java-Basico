package Interface.Interface.src.estabelecimento;

import Interface.Interface.src.equipamentos.impressora.Impressora;
import Interface.Interface.src.equipamentos.copiadora.*;
import Interface.Interface.src.equipamentos.digitalizadora.*;
import Interface.Interface.src.equipamentos.multifuncional.*;

public class Fabrica {
    public static void main(String[] args) {
        Multifuncional em = new Multifuncional();
        
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();


        
    }
    
}
