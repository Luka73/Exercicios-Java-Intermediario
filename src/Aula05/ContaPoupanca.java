package Aula05;

public class ContaPoupanca extends Conta {
    private double taxaDeRendimento;

    public ContaPoupanca() {

    }

    public ContaPoupanca(double taxaDeRendimento) {
        this.taxaDeRendimento = taxaDeRendimento;
    }


    public ContaPoupanca(String agencia, String numero, Titular titular, double saldo, String moeda, double taxaDeRendimento) {
        super(agencia, numero, titular, saldo, moeda);
        this.taxaDeRendimento = taxaDeRendimento;
    }

    public double getTaxaDeRendimento() {
        return taxaDeRendimento;
    }

    public void setTaxaDeRendimento(double taxaDeRendimento) {
        this.taxaDeRendimento = taxaDeRendimento;
    }
}
