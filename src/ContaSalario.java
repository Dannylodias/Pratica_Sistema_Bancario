public class ContaSalario extends Conta {
    public void transacao(double Saque) {

        setSaldo(getSaldo() - Saque);
        System.out.println("--------------Transação Realizada----------------");
        System.out.println("Saldo atual: " + getSaldo());

    }
}
