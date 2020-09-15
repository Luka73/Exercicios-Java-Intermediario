package Aula05;

public class ContaCorrente extends Conta {
    private double anuidade;

    public ContaCorrente() {

    }

    public ContaCorrente(double anuidade) {
        this.anuidade = anuidade;
    }

    public double getAnuidade() {
        return anuidade;
    }

    public void setAnuidade(double anuidade) {
        this.anuidade = anuidade;
    }
}
