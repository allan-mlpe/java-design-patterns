package nullobject;

public class Item {

    private String descricao;
    private Double preco;
    private Desconto desconto = new SemDesconto();

    public Item(String descricao, Double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public Item(String descricao, Double preco, Desconto desconto) {
        this.descricao = descricao;
        this.preco = preco;
        this.desconto = desconto;
    }

    public double precoQuantidade(int quantidadeItens) {
        double valorComDesconto = desconto.darDesconto(preco);
        return valorComDesconto * quantidadeItens;
    }

    @Override
    public String toString() {
        return String.format("%s R$%.2f", descricao, desconto.darDesconto(preco));
    }
}
