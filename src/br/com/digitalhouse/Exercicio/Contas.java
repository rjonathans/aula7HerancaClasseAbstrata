package br.com.digitalhouse.Exercicio;

public abstract class Contas {

    private double saldo;
    private double dinheiro;
    private Cheque cheque;

    public Contas() {
    }

    public Contas(double saldo, double dinheiro) {
        this.saldo = saldo;
        this.dinheiro = dinheiro;
    }

    public Contas(double saldo, Cheque valor) {
        this.saldo = saldo;
        this.cheque = valor;
    }

    public abstract void depositar(Valor valor);
    public abstract void sacar(Valor valor);
    public abstract void consultar(Valor valor);

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public Cheque getCheque() {
        return cheque;
    }

    public void setCheque(Cheque cheque) {
        this.cheque = cheque;
    }
}
