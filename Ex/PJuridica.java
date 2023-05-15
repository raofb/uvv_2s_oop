package Aulas;

public class PJuridica extends Pessoa{
    private long cnpj;
    private String razaoSocial;
    private String nomeRepresentante;

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeRepresentante() {
        return nomeRepresentante;
    }

    public void setNomeRepresentante(String nomeRepresentante) {
        this.nomeRepresentante = nomeRepresentante;
    }
    public void exibirDados() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Endereco: " + this.getEndereco());
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("CNPJ: " + this.getCnpj());
        System.out.println("Razao Social: " + this.getRazaoSocial());
        System.out.println("Representante: " + this.getNomeRepresentante());
    }
}
