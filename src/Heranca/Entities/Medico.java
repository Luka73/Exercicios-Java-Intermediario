package Heranca.Entities;

import java.time.LocalDate;

public class Medico extends Funcionario {
    private String crm;
    private String especializacao;

    public Medico(String nome, String cpf, String crm) {
        super(nome, cpf);
        this.crm = crm;
    }

    public Medico(String nome, String email, LocalDate nascimento, String cpf, Dependente dependente, String crm, String especializacao) {
        super(nome, email, nascimento, cpf, dependente);
        this.crm = crm;
        this.especializacao = especializacao;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public void calculaSalario(int horasTrabalhadas, double valorDaHora) {
        super.calculaSalario(horasTrabalhadas, valorDaHora);

        salario = salario + (salario * 0.08);

        if(horasTrabalhadas > 170) {
            salario = salario + (salario * 0.20);
        } else if (horasTrabalhadas > 120) {
            salario = salario + (salario * 0.15);
        }
    }
}
