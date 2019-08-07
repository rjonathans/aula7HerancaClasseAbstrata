package br.com.digitalhouse.herancaClasseAbstrata;

public class Principal {
    public static void main(String[] args) {
        Crianca bebe = new Crianca("Gugu","Masculino");
        Pessoa programador = new Pessoa("Robson","Masculino");
        Pessoa professor = new Pessoa("Jessica","Correa");

        System.out.println(bebe.getNome());
        System.out.println(bebe.getSexo());
        System.out.println(professor.getNome());

        bebe.estudar(true);
        programador.estudar(false);
        professor.cadastroPessoa("Jessica","Correa","Feminino");

    }
}
