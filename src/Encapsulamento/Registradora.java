package Encapsulamento;

public class Registradora {

    private double total;

    public void addProduto(Produto produto) {
        total = total + produto.getPreco();
    }

    public double getTotal() {
        return total;
    }

    public String getNomeDoProduto(Produto produto) {
        return produto.getCodigo() + "/" + produto.getModelo() + " - " + produto.getMarca();
    }
}
