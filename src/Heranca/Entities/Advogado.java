package Heranca.Entities;

import java.time.LocalDate;

public class Advogado extends Funcionario {
    private String oab;
    private String especilizacao;

    public Advogado(String nome, String cpf, String oab) {
        super(nome, cpf);
        this.oab = oab;
    }

    public Advogado(String nome, String email, LocalDate nascimento, String cpf, Dependente dependente, String oab, String especilizacao) {
        super(nome, email, nascimento, cpf, dependente);
        this.oab = oab;
        this.especilizacao = especilizacao;
    }

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    public String getEspecilizacao() {
        return especilizacao;
    }

    public void setEspecilizacao(String especilizacao) {
        this.especilizacao = especilizacao;
    }

    public void calculaSalario(int horasTrabalhadas, double valorDaHora, int casosVencidos) {
       super.calculaSalario(horasTrabalhadas, valorDaHora);

       final int VALOR_CASO_VENCIDO = 120;

       salario = salario + (casosVencidos * VALOR_CASO_VENCIDO);

    }
}
