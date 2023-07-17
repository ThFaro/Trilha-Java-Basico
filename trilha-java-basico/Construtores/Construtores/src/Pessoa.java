public class Pessoa {
private String nome;
private String cpf;
private String endereco;

    public Pessoa(String nome, String cpf){
        this.cpf =cpf;
        this.nome=nome;
    }

    public String getNome() {
        return this.nome;
    }


    public String getCpf() {
        return this.cpf;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
