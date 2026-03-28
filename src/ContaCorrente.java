public class ContaCorrente extends Conta {

    public void deposito(double deposito) {
        setSaldo(getSaldo() + deposito);
        System.out.println("--------------Deposito Realizado--------------");
        System.out.println("Saldo atual: " + getSaldo());
    }

    public void transacao(double Saque) {
        setSaldo(getSaldo() - Saque);
        System.out.println("--------------Saque Realizado--------------");
        System.out.println("Saldo atual: " + getSaldo());


    }

    public void infoDados() {
        super.infoDados();
    }


}
