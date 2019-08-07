package br.com.digitalhouse.herancaClasseAbstrata;

import java.security.PublicKey;

public class Pessoa {

    //Attributes
    private String nome;
    private String sobreNome;
    private double cpf;
    protected String sexo;
    private boolean vivo;

    public Pessoa(String novoNome, String novoSexo) {
        nome = novoNome;
        sexo = novoSexo;
    }

    public void respirar(String nome){

    }

    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String novoSobreNome) {
        sobreNome = novoSobreNome;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double novoCpf) {
        cpf = novoCpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String novoSexo) {
        sexo = novoSexo;
    }

    //Methods
    public boolean estudar(boolean status) {
        return false;
    }

    public void cadastroPessoa(String nome, String sobreNome) {
        System.out.println("Dados da pessoa: " + nome + " " + sobreNome);
    }

    public void cadastroPessoa(String nome, String sobreNome, String sexo) {
        System.out.println("Dados Atualizados: " + nome + " e " + sexo);
    }

    public void cadastroPessoa(String nome) {
        System.out.println("Dados Simples: " + nome);
    }


}
