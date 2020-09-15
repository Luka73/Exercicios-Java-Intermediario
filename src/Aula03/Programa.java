package Aula03;

public class Programa { //classe de execução
    public static void main(String[] args) { //método main! Executa o programa!
        Conta conta1 = new Conta();
        conta1.setAgencia("0001");
        conta1.setNumero("8392-9");
        conta1.setSaldo(500.00);
        //conta1.saldo
        conta1.setTitular("Pedro Silva");

        conta1.saca(800); //método!!
        System.out.println("Saldo do Pedro: " + conta1.getSaldo());

        conta1.getSaldo();
        conta1.setSaldo(400);

    }
}