public class Produto {
    private String descricao;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String descricao, double preco, int quantidadeEstoque){
        this.descricao = descricao;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }
    
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void imprimirDados(){
        System.out.println("==========");
        System.out.println("Descrição: " + getDescricao() +"\nPreço: R$" + getPreco() + "\nQtd em estoque: " + getQuantidadeEstoque());
        System.out.println("==========");
    }

    public double realizarVenda(int quantidade){
        if(quantidade <= this.quantidadeEstoque){
            setQuantidadeEstoque(getQuantidadeEstoque() - quantidade);
        }else{
            quantidade = 0;
            System.out.println("Quantidade superior ao estoque.");
        }
        return quantidade * this.preco;
    }
    
}
