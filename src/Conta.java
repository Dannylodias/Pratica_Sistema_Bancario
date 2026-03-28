public class Conta {
    private int num_conta;
    private double saldo;
    private String tipo;


    public int getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(int num_conta) {
        this.num_conta = num_conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void somaSaldo(double Deposito) {
        this.saldo += Deposito;
    }

    public void sacarSaldo(double Saque) {
        this.saldo -= Saque;
    }

    public void infoDados() {//to.string
        System.out.println("----------------------------- Dados Conta -----------------------------");
        System.out.println("Num Conta: " + this.getNum_conta());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Tipo: " + this.getTipo());

    }
}


