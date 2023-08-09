package Trabalho;
import Trabalho.Estoque;
import Trabalho.Venda;

    public class Produto {
        private int codigo;
        private String nome;
        private double preco;
        private int quantidadeEstoque;

        // Construtor
        public Produto(int codigo, String nome, double preco, int quantidadeEstoque) {
            this.codigo = codigo;
            this.nome = nome;
            this.preco = preco;
            this.quantidadeEstoque = quantidadeEstoque;
        }

        public double calcularValorTotal() {
            return preco * quantidadeEstoque;
        }

        public int getCodigo() {
            return codigo;
        }

        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }

        // Getters e setters
        // ...
    }

