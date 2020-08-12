package Entities;

public class Funcionario { //classe
    public String nome; //atributo
    public String sobrenome;
    public String email;
    public int idade;

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
