package Heranca.Entities;

import java.time.LocalDate;

public abstract class Pessoa {
    protected String nome;
    protected String email;
    protected LocalDate nascimento;
    protected String cpf;

    public Pessoa() {

    }

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Pessoa(String nome, String email, LocalDate nascimento, String cpf) {
        this.nome = nome;
        this.email = email;
        this.nascimento = nascimento;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    protected int calculaIdade() {
        LocalDate now = LocalDate.now();
        int idade = now.getYear() - nascimento.getYear();
        if(now.getMonthValue() > nascimento.getMonthValue() && now.getDayOfMonth() > nascimento.getDayOfMonth()) {
            idade = idade - 1;
        }

        return idade;
    }
}
