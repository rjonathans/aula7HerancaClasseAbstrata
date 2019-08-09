package br.com.digitalhouse.Exercicio;

public class Valor {

    private Cheque cheque;
    private Double dinheiro;

    public Valor() {
    }

    public Valor(Cheque cheque) {
        this.cheque = cheque;
    }

    public Valor(Double dinheiro) {
        this.dinheiro = dinheiro;
    }



    public Cheque getCheque() {
        return cheque;
    }

    public void setCheque(Cheque cheque) {
        this.cheque = cheque;
    }

    public Double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(Double dinheiro) {
        this.dinheiro = dinheiro;
    }
}
