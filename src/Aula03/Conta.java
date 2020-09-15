package Aula03;

public class Conta { //Conta Bancária
    private String agencia; //0001
    private String numero; //3628-1
    private double saldo; //626.90
    private String titular; //Pedro Silva

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    //métodos acessores (getters e setters)
    public void setSaldo(double saldo) { //encapsulando!
        if(saldo > 0) {
            this.saldo = saldo;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void saca(double valor) {
        if(saldo >= valor && valor > 0) {
            saldo = saldo - valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
