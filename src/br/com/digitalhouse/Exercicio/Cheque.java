package br.com.digitalhouse.Exercicio;

import java.util.Date;

public class Cheque {
    private double valor;
    private String bancoEmissor;
    private Date dataParaPagamento;

    public Cheque(double valor, String bancoEmissor, Date dataParaPagamento) {
        this.valor = valor;
        this.bancoEmissor = bancoEmissor;
        this.dataParaPagamento = dataParaPagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getBancoEmissor() {
        return bancoEmissor;
    }

    public void setBancoEmissor(String bancoEmissor) {
        this.bancoEmissor = bancoEmissor;
    }

    public Date getDataParaPagamento() {
        return dataParaPagamento;
    }

    public void setDataParaPagamento(Date dataParaPagamento) {
        this.dataParaPagamento = dataParaPagamento;
    }
}
