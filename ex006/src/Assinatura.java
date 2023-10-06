public class Assinatura implements Pagamento{
    private double valorMensal;
    private int numMeses;
    private double desconto;

    public Assinatura(double valorMensal, int numMeses){
        this.valorMensal = valorMensal;
        this.numMeses = numMeses;
    }

    public double getValorMensal() {
        return valorMensal;
    }
    public void setValorMensal(double valorMensal) {
        this.valorMensal = valorMensal;
    }
    public int getNumMeses() {
        return numMeses;
    }
    public void setNumMeses(int numMeses) {
        this.numMeses = numMeses;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto; 
    }

    public double calcularTotalAPagar(){
        desconto = getValorMensal() * getNumMeses() * 0.15; //desconto de 15% por ser assinatura
        return (getValorMensal() * getNumMeses()) - desconto;
    }
}
