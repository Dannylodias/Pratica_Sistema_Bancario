public class Pessoa {

    private String nome;
    private String cpf;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void infoDados() {
        System.out.println("----------------------------- Dados Pessoa -----------------------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("-----------------------------------------------------------------------");

    }

}
