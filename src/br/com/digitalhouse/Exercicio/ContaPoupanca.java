package br.com.digitalhouse.Exercicio;

public class ContaPoupanca extends Contas{

    private Double taxa;

    public ContaPoupanca(double novoSaldo, Cheque novoCheque) {
        super(novoSaldo, novoCheque);
    }

    public ContaPoupanca(double saldo, double dinheiro) {
        super(saldo, dinheiro);
    }

    public ContaPoupanca(double v, Valor dinheiroVivo) {
        super();
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
        System.out.println("recolhendo taxa");

    }
}
