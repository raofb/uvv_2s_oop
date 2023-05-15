package Aulas;

public class PFisica extends Pessoa{
    private long cpf;
    private String estadoCivil;

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public void exibirDados() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Endereco: " + this.getEndereco());
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Estado Civil: " + this.getEstadoCivil());
    }
}
