package br.com.digitalhouse.Exercicio;

public abstract class Contas {

    private double saldo;
    private Valor dinheiro;
    private Valor Cheque;

    protected Contas(double saldo, Valor dinheiro, Valor cheque) {
        this.saldo = saldo;
        this.dinheiro = dinheiro;
        Cheque = cheque;
    }

    public abstract void depositar(Valor valor);
    public abstract void sacar(Valor valor);
    public abstract void consultar(Valor valor);

}
