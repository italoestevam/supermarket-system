package repository;

import model.Produto;

import java.io.LineNumberInputStream;
import java.util.ArrayList;
import java.util.List;

public class CreateUpdate {


    public boolean deletar(Long id) {
        return produtos.removeIf(p -> p.getId().equals(id));
    }


    // Simula o nosso banco de dados em memória (uma lista privada)
    private List<Produto> produtos = new ArrayList<>();
    private Long proximoId = 1L;

    // 1. Salvar ou Atualizar um Produto
    public Produto salvar(Produto produto) {
        if (produto.getId() == null) {
            // Se não tem ID, é um produto novo (Create)
            produto.setId(proximoId++);
            produtos.add(produto);
        } else {
            // Se já tem ID, atualiza na lista (Update)
            deletar(produto.getId());

            produtos.add(produto);
        }
        return produto;
    }


}
