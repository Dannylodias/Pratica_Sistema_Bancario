public class ContaSalario extends Conta {
    public void transacao(double Saque) {

        setSaldo(getSaldo() - Saque);
        System.out.println("--------------Transação Realizada----------------");
        System.out.println("Saldo atual: " + getSaldo());

    }
    public void deposito(double deposito) {
        setSaldo(getSaldo() + deposito);
        System.out.println("--------------Deposito Realizado----------------");
        System.out.println("Saldo atual: "+getSaldo());
    }

    @Override
    public void infoDados() {
        super.infoDados();
        System.out.println("\nOBSERVAÇÃO: Está conta possui LIMITAÇÕES");
        System.out.println("Consulte condições");
    }
}
