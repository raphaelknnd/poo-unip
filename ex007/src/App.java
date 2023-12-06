public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Produto p = new Produto(1, "Coca-cola", 10.5f, 5);

        CrudProduto.inserir(p);
    }
}
