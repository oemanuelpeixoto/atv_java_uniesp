public class Cliente {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito efetuado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque efetuado com sucesso!");
        } else {
            System.out.println("Saque não pode ser realizado. Verifique o saldo ou o valor do saque.");
        }
    }

    public void transferir(Cliente destinatario, double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            destinatario.depositar(valor);
            System.out.println("Transferência efetuada com sucesso!");
        } else {
            System.out.println("Transferência não pode ser realizada. Verifique o saldo ou o valor da transferência.");
        }
    }
}