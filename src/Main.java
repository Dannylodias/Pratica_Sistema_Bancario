//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Pessoa pessoa1 = new Pessoa();

        //Pessoa
        pessoa1.setNome("Dannylo Stevan Rodrigues Dias");
        pessoa1.setCpf("11227868677");
        pessoa1.setIdade(22);

        //Conta
        conta1.setSaldo(6000);
        conta1.setNum_conta(235);
        conta1.setTipo("Corrente");

        //Invocando Metodos
        pessoa1.infoDados();
        conta1.infoDados();
        conta1.sacarSaldo(3000);
        conta1.infoDados();
    }
}