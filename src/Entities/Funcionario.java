package Entities;

public class Funcionario { //classe
    public String nome; //atributo
    public String sobrenome;
    public String email;
    public int idade;

    public Funcionario() { //construtor default!

    }

    //sobrecarga!
    public Funcionario(String nome, String sobrenome, String email, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.idade = idade;
    }

    public void mostraEmail() { //método
        System.out.println("Email: " + email);
    }

    public void mostraODobroDaIdade() {
        System.out.println("Dobro da idade: " + (idade * 2));
    }

    public void mostraNomeESobrenomeJuntos() {
        System.out.println("Nome completo: " + nome + " " + sobrenome);
    }
}
