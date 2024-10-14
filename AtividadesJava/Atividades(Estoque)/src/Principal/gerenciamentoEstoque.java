package Principal;

public class gerenciamentoEstoque{
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public gerenciamentoEstoque(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void adicionarProduto(int quantidade) {
        if (quantidade > 0) {
            this.quantidadeEmEstoque += quantidade;
            System.out.println(quantidade + " unidades do produto '" + this.nome + "' foram adicionadas ao estoque.");
        } else {
            System.out.println("Quantidade inválida para adição de produtos.");
        }
    }

    public void removerProduto(int quantidade) {
        if (quantidade > 0 && quantidade <= this.quantidadeEmEstoque) {
            this.quantidadeEmEstoque -= quantidade;
            System.out.println(quantidade + " unidades do produto '" + this.nome + "' foram removidas do estoque.");
        } else {
            System.out.println("Quantidade inválida para remoção de produtos ou estoque insuficiente.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Nome do produto: " + this.nome);
        System.out.println("Preço por unidade: R$" + this.preco);
        System.out.println("Quantidade em estoque: " + this.quantidadeEmEstoque);
        System.out.println("Valor total em estoque: R$" + (this.preco * this.quantidadeEmEstoque));
    }

    public static void main(String[] args) {
 
        gerenciamentoEstoque produto1 = new gerenciamentoEstoque("Camiseta", 25.0, 50);
        gerenciamentoEstoque produto2 = new gerenciamentoEstoque("Tênis", 100.0, 30);


        produto1.exibirInformacoes();
        produto1.adicionarProduto(10);
        produto1.removerProduto(5);
        produto1.exibirInformacoes();

        produto2.exibirInformacoes();
        produto2.adicionarProduto(5);
        produto2.removerProduto(40);
        produto2.exibirInformacoes();
    }
}