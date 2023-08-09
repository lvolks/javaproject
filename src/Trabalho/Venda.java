package Trabalho;

import java.util.ArrayList;
import java.util.List;
import Trabalho.Produto;
import Trabalho.Estoque;

public class Venda {
    private List<Produto> produtosVendidos;

    public Venda() {
        produtosVendidos = new ArrayList<>();
    }

    public void adicionarProdutoVendido(Produto produto) {
        produtosVendidos.add(produto);
    }

    public double calcularValorTotalVenda() {
        double valorTotal = 0;
        for (Produto produto : produtosVendidos) {
            valorTotal += produto.getPreco();
        }
        return valorTotal;
    }

    // Outros métodos relacionados a vendas
    // ...
}
