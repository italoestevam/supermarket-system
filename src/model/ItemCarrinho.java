package model;

import java.math.BigDecimal;

public class ItemCarrinho {

    private Long id;
    private Produto produto;
    private Integer quantidade;
    private BigDecimal precoUnitario;

    public ItemCarrinho(Long id, Produto produto, Integer quantidade, BigDecimal precoUnitario) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public ItemCarrinho() {
    }

    public ItemCarrinho(Produto produto, Integer quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
    //Metodo
    //Estudar depois esse Método

    public  BigDecimal subTotal(){
        if (precoUnitario == null || quantidade == null){
            return BigDecimal.ZERO;
        }
        return precoUnitario.multiply(BigDecimal.valueOf(quantidade));

    }

    //Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(BigDecimal precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
}
