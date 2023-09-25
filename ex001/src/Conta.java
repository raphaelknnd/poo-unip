public class Conta {
    private Titular holder; //cliente
    private int accountNumber; //numero da conta
    private int agencyNumber; //numero da agencia
    private double balance; //saldo
    private Data dateCreationAccount; //data de criação da conta
    private static int count = 0;

    public Conta(String name, String cpf, int accountNumber, int agencyNumber, double balance, int day, int mounth, int year){
        this.holder = new Titular(name, cpf);
        this.accountNumber = accountNumber;
        this.agencyNumber = agencyNumber;
        this.balance = balance;
        this.dateCreationAccount = new Data(day, mounth, year);

        Conta.count++;
    }

    //retorno do total de contas criadas
    public static int getCount(){
        return count;
    }

    public Titular getHolder() {
        return holder;
    }

    public void setHolder(String name, String cpf) {
        this.holder.setName(name);
        this.holder.setCpf(cpf);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAgencyNumber() {
        return agencyNumber;
    }

    public void setAgencyNumber(int agencyNumber) {
        this.agencyNumber = agencyNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Data getDateCreationAccount() {
        return dateCreationAccount;
    }

    /*
    public void setDateCreationAccount(String dateCreationAccount) {
        this.dateCreationAccount = dateCreationAccount;
    }
    */


    //método de saque
    public void toWithdraw(double value){
        setBalance(getBalance() - value);
    }

    //método de depósito
    public void toDeposit(double value){
        setBalance(getBalance() + value);
    }

    //método rendimento da conta
    public double income(){
        return getBalance() * 0.1;
    }


    //informações da conta
    public void details(){
        System.out.println("------------------------------------------------------");
        System.out.println("Nome: " + this.holder.getName());
        System.out.println("CPF: " + this.holder.getCpf());
        System.out.println("Número: " + getAccountNumber());
        System.out.println("Agência: " + getAgencyNumber());
        System.out.println("Saldo: R$" + getBalance());
        System.out.println("Data de criação: " + this.dateCreationAccount.formatDate());
        System.out.println("------------------------------------------------------");
    }


    //doação com decremento de uma unidade
    public void donation(){
        double balance = getBalance();
        setBalance(--balance);
        System.out.println("Novo saldo após doação = " + getBalance());
    }

 
}
