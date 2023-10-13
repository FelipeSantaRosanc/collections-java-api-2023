package CarrinhoDeCompra;

public class Carrinho {

    private String compras;

    public Carrinho (String compras){
        this.compras = compras;
    }

    public String getCompras(){
        return compras;
    }

    @Override
    public String toString() {
        return compras;
    }
}
