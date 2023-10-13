package CarrinhoDeCompra;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {


    private List<Carrinho> carrinhoDeCompras;

    public CarrinhoDeCompras(){
        this.carrinhoDeCompras = new ArrayList<>();
    }

    public void adicionarCompras(String compras){
        carrinhoDeCompras.add(new Carrinho(compras));
    }

    public void removerCompras(String compras){
        List<Carrinho> comprasParaRemover = new ArrayList<>();

        for(Carrinho c : carrinhoDeCompras){
            if(c.getCompras().equalsIgnoreCase(compras)){
                comprasParaRemover.add(c);
            }
        }
        carrinhoDeCompras.removeAll(comprasParaRemover);
    }

    public int obterNumeroDeCompras(){return carrinhoDeCompras.size();}

    public void obterComprasCarrinho(){System.out.println(carrinhoDeCompras);}

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        System.out.println("O número total de compras no carrinho são: " + carrinhoDeCompras.obterNumeroDeCompras());

        carrinhoDeCompras.adicionarCompras("compra 1");
        carrinhoDeCompras.adicionarCompras("compra 1");
        carrinhoDeCompras.adicionarCompras("compra 2");
        System.out.println("O número total de compras no carrinho são: " + carrinhoDeCompras.obterNumeroDeCompras());

        carrinhoDeCompras.removerCompras("compra 2");
        System.out.println("O número total de compras no carrinho são: " + carrinhoDeCompras.obterNumeroDeCompras());

        carrinhoDeCompras.obterComprasCarrinho();

    }

}
