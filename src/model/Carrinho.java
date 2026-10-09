package model;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
public class Carrinho {

    public List<ItemCarrinho> itens = new ArrayList<>();
    private Long id;

    public Carrinho() {
    }
    public Carrinho(Long id) {
        this.id = id;
    }

    //Metodo para adicionar um item ao carrinho.

    public void adicionarItem(Produto produto, Integer quantidade){
        //Verifica se o produto ja existe no carrinho para apenas somar a quantidade.

        for (ItemCarrinho item : itens) {
            if (item.getProduto() != null
                && item.getProduto().getId() != null
                && item.getProduto().getId().equals(produto.getId())){

                item.setQuantidade(item.getQuantidade() + quantidade);
                return;
            }
        }
        ItemCarrinho novoItem = new ItemCarrinho(produto , quantidade);
        itens.add(novoItem);
    }

    //Metodo para remover um item pelo produto
    public  void  removeItem(Produto produto){
        itens.removeIf(item -> item.getProduto().getId().equals(produto.getId()));

    }


    //Metodo para calcular o valor total de todos os itens do carrinho
    public BigDecimal getValorTotal(){
        BigDecimal total = BigDecimal.ZERO;
        for(ItemCarrinho item : itens) {
            total = total.add(item.getPrecoUnitario());
        }
        return total;
    }








    //Getter e Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ItemCarrinho> getItens() {
        return itens;
    }

    public void setItens(List<ItemCarrinho> itens) {
        this.itens = itens;
    }
}
