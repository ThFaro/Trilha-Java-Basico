public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("180481");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
          System.out.println("O cep nao corresponde");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length()!=8)
        throw new CepInvalidoException();
        return "18.048-120";

    }
}
