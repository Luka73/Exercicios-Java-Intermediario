package Heranca.Entities;

import java.time.LocalDate;

public class Dependente extends Pessoa {

    private boolean estudante;
    private Beneficio beneficio;

    public Dependente() {

    }

    public Dependente(boolean estudante, Beneficio beneficio) {
        this.estudante = estudante;
        this.beneficio = beneficio;
    }

    public Dependente(String nome, String cpf, boolean estudante, Beneficio beneficio) {
        super(nome, cpf);
        this.estudante = estudante;
        this.beneficio = beneficio;
    }

    public Dependente(String nome, String email, LocalDate nascimento, String cpf, boolean estudante, Beneficio beneficio) {
        super(nome, email, nascimento, cpf);
        this.estudante = estudante;
        this.beneficio = beneficio;
    }

    public boolean isEstudante() {
        return estudante;
    }

    public void setEstudante(boolean estudante) {
        this.estudante = estudante;
    }

    public Beneficio getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(Beneficio beneficio) {
        this.beneficio = beneficio;
    }
}
