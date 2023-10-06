public class Pedido implements Pagamento {
    private double valorCompra;
    private double frete = 20;

    public Pedido(double valorCompra){
        this.valorCompra = valorCompra;
    }

    public double getValorCompra() {
        return valorCompra;
    }
    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }
    public double getFrete() {
        return frete;
    }
    public void setFrete(double frete) {
        this.frete = frete;
    }

    public double calcularTotalAPagar(){
        return getValorCompra() + getFrete();
    }

}
