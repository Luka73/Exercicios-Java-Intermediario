package Encapsulamento;

public class Programa {
    public static void main(String[] args) {
        Produto papel1 = new Produto();
        papel1.setCodigo("01");
        papel1.setModelo("A4");
        papel1.setModelo("Canon");
        papel1.setValor(10);

        Produto papel2 = new Produto();
        papel2.setCodigo("02");
        papel2.setModelo("A3");
        papel2.setModelo("HP");
        papel2.setValor(15);

        Produto papel3 = new Produto();
        papel3.setCodigo("03");
        papel3.setModelo("A5");
        papel3.setModelo("OfficeJet");
        papel3.setValor(11);

        //sobrecarga
        Produto papel4 = new Produto("04", "A7", "HP", 1.2, 2.1, 12.6);

        Registradora reg = new Registradora();
        reg.addProduto(papel1);
        reg.addProduto(papel2);
        reg.addProduto(papel3);
        System.out.println("Produto: " + reg.getNomeDoProduto(papel1));
        System.out.println("Produto: " + reg.getNomeDoProduto(papel2));
        System.out.println("Produto: " + reg.getNomeDoProduto(papel3));
        System.out.println("Total: " + reg.getTotal());

        Boleto boleto = new Boleto();
        //boleto.setTaxa(10, true);
        boleto.setValor(reg.getTotal());
        boleto.aplicaDesconto(5, false);
        boleto.setComprador("Andre");
        System.out.println("Comprador: " + boleto.getComprador());
        System.out.println("Vencimento: " + boleto.getVencimento());
        System.out.println("Valor a pagar: " + boleto.getValor());
    }
}
