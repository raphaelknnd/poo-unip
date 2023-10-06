public class App {
    public static void main(String[] args) throws Exception {
        // questão 1
        double valorFinal;
        Produto p1 = new Produto("Refrigerante 2L", 10.0, 15);
        Produto p2 = new Produto("Biscoito Richester", 3.50, 20);
        Produto p3 = new Produto("Àgua mineral 200mL", 1.5, 50);

        p1.imprimirDados();
        p2.imprimirDados();
        p3.imprimirDados();

        valorFinal = p1.realizarVenda(10);
        System.out.println("Valor da venda: R$" + valorFinal);

        valorFinal = p2.realizarVenda(25); //erro proposital
        System.out.println("Valor da venda: R$" + valorFinal);

        valorFinal = p2.realizarVenda(5);
        System.out.println("Valor da venda: R$" + valorFinal);

        valorFinal = p3.realizarVenda(15);
        System.out.println("Valor da venda: R$" + valorFinal);

        // questão 2
        ContaBancaria c1 = new ContaBancaria(5000);

        c1.sacar(1350);
        c1.sacar(7000); //caso de saldo insuficiente logo de cara

        // questão 3
        Pedido ped1 = new Pedido(75);
        Assinatura assinat1 = new Assinatura(50, 12);

        System.out.println("Total a pagar pelo pedido é R$" + ped1.calcularTotalAPagar());
        System.out.println("Total a pagar pela assinatura R$" + assinat1.calcularTotalAPagar());

    }
}
