public class Gerente extends Funcionario {
    private String setor;
    private String cnpj;

    

    public Gerente(String nome, double salario, String setor, String cnpj){
        super(nome, salario);
        this.setor = setor;
        this.cnpj = cnpj;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getBonificacao(){
        return getSalario() * 0.3;
    }
    
    public String getDocumento(){
        return getCnpj();
    }
}
