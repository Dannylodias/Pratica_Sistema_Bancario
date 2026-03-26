public class ContaCorrente extends Conta {
    public void transacao(double Saque) {

        setSaldo(getSaldo() - Saque);
        System.out.println("--------------Transação Realizada----------------");
        System.out.println("Saldo atual: " + getSaldo());

    }

    public void deposito(double deposito) {
        System.out.println("--------------Deposito Realizado----------------");
        System.out.println("Saldo atual: "+getSaldo());
    }


}
