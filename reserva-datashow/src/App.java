public class App {
    public static void main(String[] args) throws Exception {
        CrudDatashow crudDatashow = new CrudDatashow();
        // Datashow d1 = new Datashow();
        // d1.setId(1);
        // d1.setDescricao("BenQ");

        // crudDatashow.inserir(d1);

        crudDatashow.buscarPorId(1);
    }
}
