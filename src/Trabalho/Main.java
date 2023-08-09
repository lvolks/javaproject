package Trabalho;
import Trabalho.Estoque;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estoque estoque = new Estoque();
        Venda venda = new Venda();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Procurar Produto por Código");
            System.out.println("3. Sair");
            System.out.println("4. Adicionar produto ao carrinho");
            System.out.println("5. Valor final da venda");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (escolha) {
                case 1:
                    System.out.print("Digite o código do produto: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer

                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite o preço do produto: ");
                    double preco = scanner.nextDouble();

                    System.out.print("Digite a quantidade em estoque: ");
                    int quantidade = scanner.nextInt();

                    Produto novoProduto = new Produto(codigo, nome, preco, quantidade);
                    estoque.adicionarProduto(novoProduto);
                    System.out.println("Produto adicionado ao estoque.");
                    break;

                case 2:
                    System.out.print("Digite o código do produto: ");
                    int codigoBusca = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer

                    Produto produtoEncontrado = estoque.buscarProdutoPorCodigo(codigoBusca);
                    if (produtoEncontrado != null) {
                        System.out.println("Produto encontrado: " + produtoEncontrado.getNome());
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    System.exit(0);
                    break;

                case 4:
                    System.out.print("Digite o código do produto que será adicionado ao carrinho: ");
                    int produtoBusca = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer

                    Produto produtoBuscado = estoque.buscarProdutoPorCodigo(produtoBusca);
                    if (produtoBuscado != null) {
                        venda.adicionarProdutoVendido(produtoBuscado);
                        System.out.println("Produto adicionado ao carrinho!");
                    }
                    break;

                case 5:
                    // Calcular valor total da venda
                    double valorTotalVenda = venda.calcularValorTotalVenda();
                    System.out.println("Valor total da venda: " + valorTotalVenda);
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
            // Criar produtos
            Produto produto1 = new Produto(1, "Camiseta", 29.99, 50);
            Produto produto2 = new Produto(2, "Calça Jeans", 79.99, 30);
            Produto produto3 = new Produto(3, "Sapato", 100.00, 20);

            // Criar estoque e adicionar produtos
            estoque.adicionarProduto(produto1);
            estoque.adicionarProduto(produto2);
            estoque.adicionarProduto(produto3);



            // Criar venda e adicionar produtos vendidos
            // venda.adicionarProdutoVendido(produto1);
            // venda.adicionarProdutoVendido(produto2);
            // venda.adicionarProdutoVendido(produto3);

        }
    }
}