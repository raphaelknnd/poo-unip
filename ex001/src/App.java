public class App {
    public static void main(String[] args) throws Exception {
        Conta c1 = new Conta("raphael", "12345678900", 12345, 0066, 50000.00, 1, 1, 2000);

        Conta c2 = new Conta("kennedy", "09876543211", 67890, 0066, 7000.00, 1, 2, 2000);

        if(c1.getBalance() > c2.getBalance()){
            System.out.println(c1.getHolder().getName());
        }else{
            System.out.println(c2.getHolder().getName());
        }

        c1.details();
        System.out.println("Total de contas = " + Conta.getCount());

        c1.donation();

        for(int i = 0; i < 5; i++){
            c2.toDeposit(100);
        }

        System.out.println("Valos após o laço = " + c2.getBalance());
    }
}

