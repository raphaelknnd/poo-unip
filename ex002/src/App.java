public class App {
    public static void main(String[] args) throws Exception {
        Funcionario f1 = new Funcionario("yan", 5000);
        Secretario s1 = new Secretario("rafael", 6000, "manha");
        Gerente g1 = new Gerente("paulo", 7000, "t.i");

        System.out.println("Bonificação de " + f1.getNome() + "= R$" + f1.getBonificacao());
        System.out.println("Bonificação de " + s1.getNome() + "= R$" + s1.getBonificacao());
        System.out.println("Bonificação de " + g1.getNome() + "= R$" + g1.getBonificacao());
    }
}
