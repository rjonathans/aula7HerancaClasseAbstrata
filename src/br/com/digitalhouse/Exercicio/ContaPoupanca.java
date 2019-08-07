package br.com.digitalhouse.Exercicio;

public class ContaPoupanca extends Contas{

    private Double taxa;

    protected ContaPoupanca(double saldo, Valor dinheiro, Valor cheque) {
        super(saldo, dinheiro, cheque);
    }


    @Override
    public void depositar(Valor valor) {

    }

    @Override
    public void sacar(Valor valor) {

    }

    @Override
    public void consultar(Valor valor) {

    }

    public void recolhimentoDetaxa(){

    }
}
