public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double value){
        if(value <= getSaldo()){
            while(value <= getSaldo()){
                setSaldo(getSaldo() - value);
                System.out.println("Foram sacados R$" + value +"\nSaldo: R$" + getSaldo() + "\n==========");
            }
        }else{
            System.out.println("Saldo insuficiente para ação.");
        }
    }
}
