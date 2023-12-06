public class Venda {
    private int idVenda;
    private String dataVenda;
    private int quantidadeVendida;
    private int idProduto;

    public Venda(int idVenda, String dataVenda, int quantidadeVendida, int idProduto){
        this.idVenda = idVenda;
        this.dataVenda = dataVenda;
        this.quantidadeVendida = quantidadeVendida;
        this.idProduto = idProduto;
    }

    public int getIdVenda() {
        return idVenda;
    }
    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }
    public String getDataVenda() {
        return dataVenda;
    }
    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }
    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }
    public void setQuantidadeVendida(int quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }
    public int getIdProduto() {
        return idProduto;
    }
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
}
