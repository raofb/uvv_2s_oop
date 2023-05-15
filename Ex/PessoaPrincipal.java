package Aulas;

public class PessoaPrincipal {
    public static void main(String[] args) {
        Pessoa pe = new Pessoa();
        pe.setNome("Cefas");
        pe.setEndereco("Rua da Marmoraria, 182");
        pe.setTelefone(992871922);
        pe.exibirDados();
        System.out.println();

        PFisica pf = new PFisica();
        pf.setNome("Bruna Ribeiro");
        pf.setEndereco("Rua Alcebiades, 2200");
        pf.setTelefone(992871102);
        pf.setCpf(199281992);
        pf.setEstadoCivil("Solteira");
        pf.exibirDados();
        System.out.println();

        PJuridica pj = new PJuridica();
        pj.setNome("ABC Comercio LTDA.");
        pj.setEndereco("Avenida Adalberto Simao Nader, 224");
        pj.setTelefone(32259872);
        pj.setCnpj(12281792);
        pj.setRazaoSocial("Circo Palhacinhos");
        pj.setNomeRepresentante("Victor Sá");
        pj.exibirDados();



    }
}
