public class App {
    public static void main(String[] args) throws Exception {
        Secretario s1 = new Secretario("rafael", 6000, "manha", "098765432100");
        Gerente g1 = new Gerente("paulo", 7000, "t.i", "123456789099");

        System.out.println("Bonificação de " + s1.getNome() + "= R$" + s1.getBonificacao());
        System.out.println("Bonificação de " + g1.getNome() + "= R$" + g1.getBonificacao());

        System.out.println("Documento de " + s1.getNome() + "= " + s1.getDocumento());
        System.out.println("Documento de " + g1.getNome() + "= " + g1.getDocumento());
    }
}
