package model;
public class Produto {

    private long id;
    private String nameProduto;
    private Integer estoque;
    private double precoProduto;
    private String categoria;

    public Produto() {
    }

    public Produto(long id, String nameProduto, Integer estoque, double precoProduto, String categoria) {
        this.id = id;
        this.nameProduto = nameProduto;
        this.estoque = estoque;
        this.precoProduto = precoProduto;
        this.categoria = categoria;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameProduto() {
        return nameProduto;
    }

    public void setNameProduto(String nameProduto) {
        this.nameProduto = nameProduto;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
