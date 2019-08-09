package br.com.digitalhouse.Exercicio;

public class main {
    public static void main(String[] args) {

        Valor dinheiroVivo = new Valor(10000d);
        Clientes novoCliente = new Clientes(123,"Gloria","42123846x","32763327877");
        ContaPoupanca novaContaPoupança = new ContaPoupanca(1000d,dinheiroVivo);

        novaContaPoupança.recolhimentoDetaxa();


    }
}
