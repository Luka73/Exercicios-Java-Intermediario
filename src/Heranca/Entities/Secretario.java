package Heranca.Entities;

import java.time.LocalDate;

public class Secretario extends Funcionario {

    public Secretario(String nome, String cpf) {
        super(nome, cpf);
    }

    public Secretario(String nome, String email, LocalDate nascimento, String cpf, Dependente dependente) {
        super(nome, email, nascimento, cpf, dependente);
    }
}
