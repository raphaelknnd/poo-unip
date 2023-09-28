public class Gerente extends Funcionario {
    private String setor;

    public Gerente(String nome, double salario, String setor){
        super(nome, salario);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getBonificacao(){
        return getSalario() * 0.3;
    }
    
}
