package Heranca.Entities;

import java.time.LocalDate;

public class Funcionario extends Pessoa {
    protected double salario;
    protected LocalDate dataDeContratacao;
    protected Dependente dependente;

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Funcionario(String nome, String email, LocalDate nascimento, String cpf, Dependente dependente) {
        super(nome, email, nascimento, cpf);
        this.dependente = dependente;
    }

    public double getSalario() {
        return salario;
    }

    public Dependente getDependente() {
        return dependente;
    }

    public void setDependente(Dependente dependente) {
        this.dependente = dependente;
    }

    public void calculaSalario(int horasTrabalhadas, double valorDaHora) {
        double salario = this.salario + (horasTrabalhadas * valorDaHora);
        salario = salario - calculaDescontoDoBeneficio();
        this.salario = Math.round(salario * 100.0) / 100.0;
    }

    public void calculaSalario(double salario) {
        double salarioComDesconto = salario - calculaDescontoDoBeneficio();
        this.salario = Math.round(salarioComDesconto * 100.0) / 100.0;
    }

    private double calculaDescontoDoBeneficio() {
        Beneficio beneficio = dependente.getBeneficio();
        double desconto = 0;
        int idade = dependente.calculaIdade();

        if((dependente.isEstudante() && idade <= 30) || (idade <= 24)) {

           if (beneficio == Beneficio.PLANO_DE_SAUDE) {
               desconto = salario * 0.04;
           } else if (beneficio == Beneficio.AUXILIO_EDUCACAO) {
               desconto = salario * 0.05;
           } else if (beneficio == Beneficio.AUXILIO_NUTRICIONAL_E_ESPORTIVO) {
               desconto = salario * 0.06;
           }
        }

        return salario - desconto;
    }

    private double calculaTrienio() {
        double trienio = 0;
        int i = 0;

        


        return trienio;
    }
}
