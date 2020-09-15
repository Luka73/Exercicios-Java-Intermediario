package Heranca;

import Heranca.Entities.*;

public class Program {

    public static void main(String[] args) {
        Advogado advogado = new Advogado("Paulo", "129302233-28", "029201");
        Funcionario medico = new Medico("Maria", "283918930-00", "920103");
        Funcionario engenheiro = new Engenheiro("Lucas", "162817983-12", "1820381");
        Funcionario secretaria = new Secretario("Talita", "371829293-43");

        Dependente depDoAdvogado = new Dependente("Pedro", "210283919-92", true, Beneficio.AUXILIO_EDUCACAO);
        Dependente depDoEngenheiro = new Dependente("Larissa", "281288219-44", false, Beneficio.PLANO_DE_SAUDE);
        Dependente depDoMedico = new Dependente("Enzo", "918929839-52", true, Beneficio.AUXILIO_NUTRICIONAL_E_ESPORTIVO);

        advogado.setDependente(depDoAdvogado);
        engenheiro.setDependente(depDoEngenheiro);
        medico.setDependente(depDoMedico);

        advogado.calculaSalario(120, 30, 12);
        engenheiro.calculaSalario(150, 32);
        medico.calculaSalario(160, 41);
        secretaria.calculaSalario(1800);

        System.out.println(advogado.getSalario());
        System.out.println(engenheiro.getSalario());
        System.out.println(medico.getSalario());
        System.out.println(secretaria.getSalario());
    }



}
