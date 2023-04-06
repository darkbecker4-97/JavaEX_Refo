public class ContaBancaria {
    public String numeroDaConta;
    public double saldo;
    public String titular;

    public ContaBancaria(String numeroDaConta, double saldo, String titular) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    public void transferir(double valor, ContaBancaria contaDestino) {
        if (saldo >= valor) {
            saldo -= valor;
            contaDestino.saldo += valor;
            System.out.println("Transferência de R$" + valor + " realizada com sucesso para a conta de " + contaDestino.titular + ".");
        } else {
            System.out.println("Saldo insuficiente para realizar a transferência.");
        }
    }
}
