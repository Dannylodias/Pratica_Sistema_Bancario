//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        Pessoa pessoa1 = new Pessoa();

        //Pessoa
        pessoa1.setNome("Dannylo Stevan Rodrigues Dias");
        pessoa1.setCpf("11227868677");
        pessoa1.setIdade(22);

        //Conta
        contaCorrente.setSaldo(2000);
        contaCorrente.setTipo("Conta Corrente");
        contaCorrente.setNum_conta(99);
        //Invocando Metodos
        pessoa1.infoDados();
        contaCorrente.infoDados();

        contaCorrente.transacao(1000);
        contaCorrente.setSaldo(2000);

    }
}