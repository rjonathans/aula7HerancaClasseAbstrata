package br.com.digitalhouse.Exercicio;

public class Clientes {

    private Integer id;
    private String last;
    private String rg;
    private String cpf;

    public Clientes(){

    }

    public Clientes(Integer id, String last, String rg, String cpf) {
        this.id = id;
        this.last = last;
        this.rg = rg;
        this.cpf = cpf;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
