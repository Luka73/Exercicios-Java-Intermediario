package Heranca.Entities;

import java.time.LocalDate;

public class Engenheiro extends Funcionario {
    private String crm;

    public Engenheiro(String nome, String cpf, String crm) {
        super(nome, cpf);
        this.crm = crm;
    }

    public Engenheiro(String nome, String email, LocalDate nascimento, String cpf, Dependente dependente, String crm) {
        super(nome, email, nascimento, cpf, dependente);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public void calculaSalario(int horasTrabalhadas, double valorDaHora) {
        super.calculaSalario(horasTrabalhadas, valorDaHora);
    }
}
