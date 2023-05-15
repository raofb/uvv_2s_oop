package Aulas;

public class Pessoa {
    private String nome;
    private String endereco;
    private int telefone;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getEndereco() {
        return this.endereco;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public int getTelefone() {
        return this.telefone;
    }
    public void exibirDados() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Endereco: " + this.getEndereco());
        System.out.println("Telefone: " + this.getTelefone());
    }
}
