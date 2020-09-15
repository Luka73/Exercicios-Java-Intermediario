package Encapsulamento;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Boleto {
    private String comprador;
    private double valor;
    private LocalDate vencimeto;
    private double taxa;
    private final int PRAZO = 5;

    public Boleto() {
        setVencimento();
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador.toUpperCase();
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor + taxa;
    }

    private void setVencimento() {
        LocalDate date = LocalDate.now();
        vencimeto = date.plusDays(PRAZO);

        if(vencimeto.getDayOfWeek() == DayOfWeek.SATURDAY) {
            vencimeto = vencimeto.plusDays(2);
        } else if (vencimeto.getDayOfWeek() == DayOfWeek.SUNDAY) {
            vencimeto = vencimeto.plusDays(1);
        }
    }

    public String getVencimento() {
        return vencimeto.toString();
    }

    public void aplicaDesconto(double desconto, boolean porcento) {
        if(porcento)
            valor = Calculadora.subtrai(valor, Calculadora.porcento(valor, desconto));
        else
            valor = Calculadora.subtrai(valor, desconto);
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
}
