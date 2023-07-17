public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa thiago = new Pessoa("Thiago","223243212");

        thiago.setEndereco("Rua rahael dias da silva");

        System.out.println(thiago.getNome()+"-"+thiago.getCpf());
    }
}
