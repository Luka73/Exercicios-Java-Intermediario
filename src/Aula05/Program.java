package Aula05;

public class Program {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente(); //construtor default
        conta1.setSaldo(500);
        conta1.setAgencia("1234");
        conta1.setNumero("1239-1");
        conta1.setMoeda("CAD");
        conta1.setAnuidade(50);
        //String nome = "Andre Costa";
        Titular titular1 = new Titular("Andre Costa", "andre@gmail.com", "129494194");
        Titular titular2 = new Titular("Larissa Alves", "larissa@gmail.com", "414214194");
        conta1.setTitular(titular1);

        //sobrecarga do construtor
        ContaPoupanca conta2 = new ContaPoupanca("234", "82913-1", titular2, 100, "CAD", 2);


    }
}
