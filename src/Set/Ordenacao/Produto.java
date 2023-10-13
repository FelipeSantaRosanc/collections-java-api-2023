package Set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {

    //Atributo

    private Long codigo;
    private String nome;
    private Double preco;
    private int quantidade;


    public Produto(Long codigo, String nome, Double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return Objects.equals(getCodigo(), produto.getCodigo());
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo());
    }

    public Long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}


 class ComparatorPorPreco implements Comparator<Produto>{

     @Override
     public int compare(Produto p1, Produto p2) {
         return Double.compare(p1.getPreco(), p2.getPreco());
     }
 }